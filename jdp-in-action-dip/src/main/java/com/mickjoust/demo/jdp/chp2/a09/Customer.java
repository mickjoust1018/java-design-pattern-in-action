package com.mickjoust.demo.jdp.chp2.a09;

/**
 * @author mickjoust
 **/
public class Customer {

    private String firstName;
    private String lastName;
    private Wallet myWallet;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Wallet getWallet(){
        return myWallet;
    }
    public float pay(float bill) {
        if (myWallet != null) {
            if (myWallet.getTotalMoney() > bill) {
                myWallet.subtractMoney(bill);
                return bill;
            }
        }
        return 0;
    }
}
