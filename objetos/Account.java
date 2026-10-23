
package ec.edu.espoch.banco.objetos;

/**
 *
 * @author Jonat
 */
public class Account {
    
    
    protected float balance ;
    protected int numberOfDeposits  = 0;
    protected int numberOfWithdrawals  = 0;
    protected float annualInterestRate;
    protected float monthlyFee  = 0.0f;
    protected float calculateMonthlyInterest =0.0f ;

    
    //CONSTRUCTOR
    public Account(float balance, float annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    
    //SETTER Y GUETER 
    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getNumberOfDeposits() {
        return numberOfDeposits;
    }

    public void setNumberOfDeposits(int numberOfDeposits) {
        this.numberOfDeposits = numberOfDeposits;
    }

    public int getNumberOfWithdrawals() {
        return numberOfWithdrawals;
    }

    public void setNumberOfWithdrawals(int numberOfWithdrawals) {
        this.numberOfWithdrawals = numberOfWithdrawals;
    }

    public float getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(float annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public float getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(float monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public float getCalculateMonthlyInterest() {
        return calculateMonthlyInterest;
    }

    public void setCalculateMonthlyInterest(float calculateMonthlyInterest) {
        this.calculateMonthlyInterest = calculateMonthlyInterest;
    }







    
    
    
}
