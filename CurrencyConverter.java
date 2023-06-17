/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewmanager;

/**
 *
 * @author HP
 */
public class CurrencyConverter {
    private static final double DOLLAR_TO_SHEKEL_RATE = 3.65;
    private static final double SHEKEL_TO_DOLLAR_RATE = 1 ;

    public double convertCurrency(double amount, boolean dollarsToShekels) {
        if (dollarsToShekels) {
            return amount * DOLLAR_TO_SHEKEL_RATE;
        } else {
            return amount * SHEKEL_TO_DOLLAR_RATE;
        }
    }
};