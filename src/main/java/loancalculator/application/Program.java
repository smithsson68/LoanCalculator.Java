package loancalculator.application;

import loancalculator.library.domainObjects.Lender;
import loancalculator.library.repositories.CsvLenderRepository;
import loancalculator.library.repositories.LenderRepository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

/**
 * Created by zopadev on 22/12/16.
 */

public class Program {
    public static void main(String[] args){

        String lendersFilePath = "~/IdeaProjects/LoanCalculator/Lenders.csv";

        try{
            LenderRepository lr = new CsvLenderRepository(new FileReader(lendersFilePath));
            List<Lender> lenders = lr.list();
        }
        catch (FileNotFoundException e) {
            System.out.println("Opps - couldn't find the lenders file at : " + lendersFilePath);
        }
    }
}
