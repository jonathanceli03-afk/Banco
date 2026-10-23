    
package ec.edu.espoch.banco.implementacion;

import ec.edu.espoch.banco.interfaces.InterfazCheckingAccounts;
import ec.edu.espoch.banco.objetos.CheckingAccount;

/**
 *
 * @author Jonat
 */
public class CheckingAccounts extends Accounts implements InterfazCheckingAccounts{
    
    
        @Override
    public boolean withdraw(CheckingAccount checkingaccount, float value) {
        float currentBalance = checkingaccount.getBalance();

        if (value <= currentBalance) {
            return super.withdraw(checkingaccount, value);
        } else {
            float deficit = value - currentBalance;
            checkingaccount.setOverdraft(checkingaccount.getOverdraft() + deficit);
            checkingaccount.setBalance(0.0f);
            checkingaccount.setNumberOfWithdrawals(checkingaccount.getNumberOfWithdrawals() + 1);       
            return true;
        }
    }

        @Override
    public float deposit(float value) {
        return 0.0f;
    }

        @Override
    public float monthlyStatement() {
        return 0.0f;
    }

        @Override
    public String show() {
        return "";
    }
}
