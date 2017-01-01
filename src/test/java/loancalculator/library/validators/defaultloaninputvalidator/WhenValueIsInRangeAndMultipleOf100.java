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
public class WhenValueIsInRangeAndMultipleOf100 {

    private int input;

    @Parameterized.Parameters
    public static Collection inputs() {
        return Arrays.asList(new Object[][]{
                {1000, null},
                {1100, null},
                {6600, null},
                {1500, null}
        });
    }

    public WhenValueIsInRangeAndMultipleOf100(int input, Object unused) {
        this.input = input;
    }

    @Test
    public void validationSucceeds() throws ValidationException {

        DefaultLoanInputValidator validator = new DefaultLoanInputValidator();
        validator.validateLoanAmount(this.input);
    }
}
