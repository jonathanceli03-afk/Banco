
package ec.edu.espoch.banco.interfaces;

import ec.edu.espoch.banco.objetos.CheckingAccount;

/**
 *
 * @author Jonat
 */
public interface InterfazCheckingAccounts {
        
    public boolean withdraw(CheckingAccount checkingaccount, float value);
    public float deposit(float value);
    public float monthlyStatement();
    public String show();
}
