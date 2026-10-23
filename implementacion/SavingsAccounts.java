
package ec.edu.espoch.banco.implementacion;

import ec.edu.espoch.banco.interfaces.InterfazSavingsAccounts;
import ec.edu.espoch.banco.objetos.Account;
import ec.edu.espoch.banco.objetos.SavingsAccount;

/**
 *
 * @author Jonat
 */
public class SavingsAccounts extends Accounts implements InterfazSavingsAccounts{
    
     @Override
        public boolean withdraw(SavingsAccount savingsaccount,float value) {
         boolean aux = false;
         if (isActive(savingsaccount)) {
             aux = super.deposit(savingsaccount, value);
             }    
        return aux;
    }
//-----------------------------------------------------------------------------------
        @Override
    public boolean deposit(SavingsAccount savingsaccount, float value) {
        boolean aux=false;    
        if (isActive(savingsaccount)) {
                
                aux=super.deposit(savingsaccount, value);
                
            }
        return aux;
    }
//------------------------------------------------------------------------------------
        @Override
    public boolean monthlyStatement(SavingsAccount savingsaccount) {
             int ndep=savingsaccount.getNumberOfWithdrawals();
             ndep +=1;
             savingsaccount.setNumberOfWithdrawals(ndep);
             //----------------------------------------------
             boolean res=false;
             if (savingsaccount.getNumberOfWithdrawals()>4) {
             float inpn=savingsaccount.getMonthlyFee();
             inpn +=1000;
             savingsaccount.setMonthlyFee(inpn);
             isActive(savingsaccount);
             res=true;
             }
        return res;
    }
//-----------------------------------------------------------------------------------
        @Override
    public String show(SavingsAccount savingsaccount) {
        
        return "Account{" + "balance" + savingsaccount.getBalance()
                + ", numberOfDeposits=" + savingsaccount.getNumberOfDeposits() 
                + ", numberOfWithdrawals=" + savingsaccount.getNumberOfWithdrawals() 
                + ", annualInterestRate=" + savingsaccount.getAnnualInterestRate() 
                + ", monthlyFee=" + savingsaccount.getMonthlyFee() 
                + ", calculateMonthlyInterest=" + savingsaccount.getCalculateMonthlyInterest() ;
        }
 //----------------------------------------------------------------------------------------   
    private boolean isActive (SavingsAccount savingsaccount){

        if (savingsaccount.getBalance() < 10000) {
            System.out.println("Cuenta Inactiva");
            savingsaccount.setActive(false);
        } else {
            System.out.println("Cuenta Activa");
            savingsaccount.setActive(true);

        }

        return savingsaccount.istActive();
        
    }
    
}
