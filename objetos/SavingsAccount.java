
package ec.edu.espoch.banco.objetos;

/**
 *
 * @author Jonat
 */
public class SavingsAccount extends Account{
    

    protected boolean active;

    //constructor
    public SavingsAccount(boolean active, float balance, float annualInterestRate) {
        super(balance, annualInterestRate);
        this.active = active;
    }

    //setter y guetter
    public boolean istActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" + "active=" + active + '}';
    }
    
    
}
