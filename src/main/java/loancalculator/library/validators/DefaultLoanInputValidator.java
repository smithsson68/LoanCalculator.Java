package loancalculator.library.validators;

/**
 * Created by zopadev on 23/12/16.
 */

public class DefaultLoanInputValidator implements LoanInputValidator {

    final static int MIN_LOAN_AMOUNT = 1000;
    final static int MAX_LOAN_AMOUNT = 15000;

    @Override
    public void validateLoanAmount(int loanAmount) throws ValidationException {

        Boolean valid = isLoanAmountInRange(loanAmount) && isLoanAmountIncrementOf100(loanAmount);

        if (!valid) {
            throw new ValidationException(String.format("Loan amount is invalid - please supply a value between £{%s} and £{%s} to the nearest £100", MIN_LOAN_AMOUNT, MAX_LOAN_AMOUNT));
        }
    }

    private static Boolean isLoanAmountInRange(int loanAmount)
    {
        return loanAmount >= MIN_LOAN_AMOUNT && loanAmount <= MAX_LOAN_AMOUNT;
    }

    private static Boolean isLoanAmountIncrementOf100(int loanAmount)
    {
        return loanAmount%100 == 0;
    }
}
