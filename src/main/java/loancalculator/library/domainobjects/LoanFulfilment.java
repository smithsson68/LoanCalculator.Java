package loancalculator.library.domainobjects;

/**
 * Created by paul on 29/12/2016.
 */

public class LoanFulfilment {

    private Lender lender;
    private int amount;

    public LoanFulfilment(Lender lender, int amount) {
        this.lender = lender;
        this.amount = amount;
    }

    public Lender getLender() {
        return this.lender;
    }

    public int getAmount() {
        return this.amount;
    }
}
