package loancalculator.library.validators.defaultloaninputvalidator;

import loancalculator.library.validators.DefaultLoanInputValidator;
import loancalculator.library.validators.ValidationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by paul on 29/12/2016.
 */

@RunWith(Parameterized.class)
public class WhenValueInRangeButNotMulipleOf100 {

    private int input;

    @Parameterized.Parameters
    public static Collection inputs() {
        return Arrays.asList(new Object[][]{
                {1001, null},
                {2020, null},
                {5050, null},
                {14999, null}
        });
    }

    public WhenValueInRangeButNotMulipleOf100(int input, Object unused) {
        this.input = input;
    }

    @Test(expected = ValidationException.class)
    public void throwsValidationException() throws ValidationException {

        DefaultLoanInputValidator validator = new DefaultLoanInputValidator();
        validator.validateLoanAmount(this.input);
    }
}
