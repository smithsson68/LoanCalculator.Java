package loancalculator.library;

import loancalculator.library.results.LoanCalculationErrorResult;
import loancalculator.library.results.LoanCalculationResult;
import loancalculator.library.validators.LoanInputValidator;
import loancalculator.library.validators.ValidationException;

/**
 * Created by zopadev on 23/12/16.
 */

public class LoanCalculatorFacade {

    private LoanInputValidator loanInputValidator;

    public LoanCalculatorFacade(LoanInputValidator loanInputValidator) {
        this.loanInputValidator = loanInputValidator;
    }


    public LoanCalculationResult Calculate(int loanAmount) {

        try {

            this.loanInputValidator.validateLoanAmount(loanAmount);

        } catch (ValidationException e) {

            return new LoanCalculationErrorResult("Validation error - " + e.getMessage());
        }




    }
}
