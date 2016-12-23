package loancalculator.library.domainObjects;

import java.math.BigDecimal;

/**
 * Created by zopadev on 22/12/16.
 */
public class Lender {

    private String name;
    private BigDecimal rate;
    private int fundsAvailable;

    public Lender(String name, BigDecimal rate, int fundsAvailable){
        this.name = name;
        this.rate = rate;
        this.fundsAvailable = fundsAvailable;
    }

    public String getName(){
        return this.name;
    }

    public BigDecimal getRate(){
        return this.rate;
    }

    public int getFundsAvailable(){
        return this.fundsAvailable;
    }
}
