package loancalculator.library.results;

/**
 * Created by paul on 29/12/2016.
 */

public class LoanCalculationErrorResult implements LoanCalculationResult {

    private String errorMessage;

    public LoanCalculationErrorResult(String errorMessage){
        this.errorMessage = errorMessage;
    }

    @Override
    public String getMessage() {
        return this.errorMessage;
    }
}
