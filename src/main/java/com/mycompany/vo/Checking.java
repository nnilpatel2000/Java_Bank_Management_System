/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vo;

/**
 *
 * @author saiye
 */
public class Checking extends Accounts {

    private double minimum_balance;

    @Override
    public String toString() {
        return "Checking{" + "minimum_balance=" + minimum_balance + "," + super.toString() + '}';
    }

    public Checking() {
    }

    public Checking(double minimum_balance, int c_id, int account_number, int routing_number, double account_balance) {
        super(c_id, account_number, routing_number, account_balance);
        this.minimum_balance = minimum_balance;
    }

    public double getMinimum_balance() {
        return minimum_balance;
    }

    public void setMinimum_balance(double minimum_balance) {
        this.minimum_balance = minimum_balance;
    }

    public static Checking chkBranch() {
        Checking branch = null;
        try {
            double minimum_balance = 1500.00;
            int c_id = 101;
            int account_number = 112233456;
            int routing_number = 1122345;
            double account_balance = 4500.00;

            branch = new Checking(minimum_balance, c_id, account_number, routing_number, account_balance);
            System.out.println(branch);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return branch;
    }

    public boolean validate(double minimum_balance, int c_id, int account_number, int routing_number, double account_balance) {
        boolean status = false;
        Checking branch = Checking.chkBranch();

        if (branch.getMinimum_balance() == (minimum_balance) && branch.getC_id() == (c_id) && branch.getAccount_number() == (account_number) && branch.getRouting_number() == (routing_number) && branch.getAccount_balance() == (account_balance)) {
            return true;
        }
        return status;
    }

}
