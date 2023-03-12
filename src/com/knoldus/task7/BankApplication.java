package com.knoldus.task7;

class Customer{
    private double accountbalance;  // encapsulating the details inside Customer class.

    public void setAccountbalance(double accountbalance) {
        this.accountbalance = accountbalance;
    }

    public double getAccountbalance() {
        return accountbalance;
    }
}
public class BankApplication {
    public static void main(String[] args) {
        Customer customerOne=new Customer();
        double accountbalance=15000;
        customerOne.setAccountbalance(accountbalance);

        //getbalance of the customer
        System.out.println("Current Balance of the customer is: "+customerOne.getAccountbalance());
    }
}
