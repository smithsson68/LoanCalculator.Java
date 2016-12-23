package loancalculator.library.validators;

/**
 * Created by zopadev on 23/12/16.
 */

public interface LoanInputValidator {
    void validateLoanAmount(int loanAmount) throws ValidationException;
}
