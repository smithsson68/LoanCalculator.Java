package loancalculator.library.repositories;

import loancalculator.library.domainobjects.Lender;

import java.util.List;

/**
 * Created by zopadev on 22/12/16.
 */
public interface LenderRepository {
    List<Lender> list();
}
