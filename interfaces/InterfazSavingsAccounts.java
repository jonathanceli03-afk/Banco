
package ec.edu.espoch.banco.interfaces;

import ec.edu.espoch.banco.objetos.SavingsAccount;

/**
 *
 * @author Jonat
 */
public interface InterfazSavingsAccounts {
    
    public boolean withdraw(SavingsAccount savingsaccount,float value);
    public boolean deposit(SavingsAccount savingsaccount,float value);
    public boolean monthlyStatement(SavingsAccount savingsaccount);
    public String show(SavingsAccount savingsaccount);
}
