package loancalculator.library.strategies;

import loancalculator.library.domainobjects.Lender;
import loancalculator.library.domainobjects.LoanFulfilment;

import java.util.*;

/**
 * Created by paul on 29/12/2016.
 */

public class CheapestFirstLoanFulfilmentStrategy implements LoanFulfilmentStrategy {

    @Override
    public List<LoanFulfilment> Execute(int loanAmount, List<Lender> lenders) {

        ArrayList<LoanFulfilment> fulfilments = new ArrayList<>();

        if (lenders.stream().mapToInt((lender) -> lender.getFundsAvailable()).sum() < loanAmount) {
            return fulfilments;
        }

        ArrayList<Lender> sortedLenders = new ArrayList<>(lenders);
        Collections.sort(sortedLenders, Comparator.comparing(l -> l.getFundsAvailable()));

        for (Lender lender : sortedLenders) {

        }

        return fulfilments;
    }
}
