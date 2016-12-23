package loancalculator.library.validators.defaultloaninputvalidator;

import loancalculator.library.validators.DefaultLoanInputValidator;
import loancalculator.library.validators.ValidationException;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by zopadev on 23/12/16.
 */

@RunWith(Parameterized.class)
public class WhenValueOutOfRange {

    private int input;

        @Parameterized.Parameters
        public static Collection<Integer> inputs() {
            int[] inputs = {-1, 0, 999, 15001};
            return Arrays.asList(ArrayUtils.toObject(inputs));
        }

        public WhenValueOutOfRange(int input) {
            this.input = input;
        }

        @Test(expected = ValidationException.class)
        public void throwsValidationException() {

            DefaultLoanInputValidator validator = new DefaultLoanInputValidator();
            validator.validateLoanAmount(this.input);
        }
    }
}
