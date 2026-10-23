
package ec.edu.espoch.banco.implementacion;

import ec.edu.espoch.banco.objetos.Account;

/**
 *
 * @author Jonat
 */
public class Accounts {
    
    
    public boolean withdraw(Account account, float value) {
        boolean res=false;
        if (value <= account.getBalance()) {
            float aux=account.getBalance() + value;
            account.setBalance(aux);
            res=true;
        }
        return res;
    }

    public boolean deposit(Account account , float value) {
            float aux=account.getBalance() + value;
            account.setBalance(aux);
        return true;
    }

    public float monthlyStatement(Account account) {
        float monthlyinterest=calculateMonthlyInterest(account);
        float interestValue=(account.getMonthlyFee()*monthlyinterest);
        float newBalance=account.getBalance()-account.getMonthlyFee()-interestValue;
        account.setBalance(newBalance);
        return 0.0f;
    }

    public String show(Account account) {
        return "Account{" + "balance" + account.getBalance() 
                + ", numberOfDeposits=" + account.getNumberOfDeposits() 
                + ", numberOfWithdrawals=" + account.getNumberOfWithdrawals() 
                + ", annualInterestRate=" + account.getAnnualInterestRate() 
                + ", monthlyFee=" + account.getMonthlyFee() 
                + ", calculateMonthlyInterest=" + account.getCalculateMonthlyInterest() ;
        }
    private float calculateMonthlyInterest(Account account) {
        return (account.getAnnualInterestRate()/12);
    }
    
    
    
    
}
