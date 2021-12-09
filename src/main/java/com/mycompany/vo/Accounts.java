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
public class Accounts {

    private int c_id;
    private int account_number;
    private int routing_number;
    private double account_balance;

    @Override
    public String toString() {
        return "Accounts{" + "c_id=" + c_id + ", account_number=" + account_number + ", routing_number=" + routing_number + ", account_balance=" + account_balance + '}';
    }

    public Accounts() {
    }

    public Accounts(int c_id, int account_number, int routing_number, double account_balance) {
        this.c_id = c_id;
        this.account_number = account_number;
        this.routing_number = routing_number;
        this.account_balance = account_balance;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public int getRouting_number() {
        return routing_number;
    }

    public void setRouting_number(int routing_number) {
        this.routing_number = routing_number;
    }

    public double getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }

    public static Accounts aBranch() {
        Accounts branch = null;
        
        try {
            int c_id = 100;
            int account_number = 187654321;
            int routing_number = 18765432;
            double account_balance = 9876.00;
            branch = new Accounts(c_id, account_number, routing_number, account_balance);
            System.out.println(branch);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return branch;
    }

    public boolean validate(int c_id, int account_number, int routing_number, double account_balance) {
        boolean status = false;
        Accounts branch = Accounts.aBranch();

        if (branch.getC_id() == (c_id) && branch.getAccount_number() == (account_number)
            && branch.getRouting_number() == (routing_number) && branch.getAccount_balance() == (account_balance)) {
                       
            return true;
        }
        return status;

    }

}
