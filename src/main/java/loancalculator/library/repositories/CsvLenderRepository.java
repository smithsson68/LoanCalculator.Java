package loancalculator.library.repositories;

import loancalculator.library.domainobjects.Lender;

import com.opencsv.CSVReader;

import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by zopadev on 22/12/16.
 */

public class CsvLenderRepository implements LenderRepository {

    private Reader reader;

    public CsvLenderRepository(Reader reader) {
        this.reader = reader;
    }

    public List<Lender> list() {

        try (CSVReader reader = new CSVReader(this.reader, ',', '\'', 1)) {

            String[] line;
            ArrayList<Lender> lenders = new ArrayList<>();

            while ((line = reader.readNext()) != null) {
                Lender lender = new Lender(line[0], new BigDecimal(line[1]), new Integer(line[2]));
                lenders.add(lender);
            }

            return lenders;

        } catch (IOException e) {
            Logger.getGlobal().log(Level.SEVERE, "Error reading CSV file", e);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, "Error processing CSV file", e);
        }

        return null;
    }
}
