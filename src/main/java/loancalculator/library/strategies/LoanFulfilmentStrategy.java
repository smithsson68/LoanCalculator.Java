package loancalculator.library.strategies;

import loancalculator.library.domainobjects.Lender;
import loancalculator.library.domainobjects.LoanFulfilment;

import java.util.Collection;

/**
 * Created by paul on 29/12/2016.
 */

public interface LoanFulfilmentStrategy {
    Collection<LoanFulfilment> Execute(int loanAmount, Collection<Lender> lenders);
}
