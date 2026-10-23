
package ec.edu.espoch.banco.objetos;

/**
 *
 * @author Jonat
 */
public class CheckingAccount extends Account {
    
    protected float overdraft= 0.0f;
    
    //cosntructor 

    public CheckingAccount(float balance, float annualInterestRate) {
        super(balance, annualInterestRate);
    }
    
    //setter y guetter

    public float getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(float overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" + "overdraft=" + overdraft + '}';
    }
    
    
}
