/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vo;

import java.util.ArrayList;

/**
 *
 * @author saiye
 */
public class Individual extends Customer {

    private double withdraw_limit;

    @Override
    public String toString() {
        return "Individual{" + "withdraw_limit=" + withdraw_limit + "," + super.toString() + '}';
    }

    public Individual() {
    }

    public Individual(double withdraw_limit, int c_id, String c_name, int c_phone, String c_email, ArrayList<Accounts> accountsList) {
        super(c_id, c_name, c_phone, c_email, accountsList);
        this.withdraw_limit = withdraw_limit;
    }

    public double getWithdraw_limit() {
        return withdraw_limit;
    }

    public void setWithdraw_limit(double withdraw_limit) {
        this.withdraw_limit = withdraw_limit;
    }

    public static Individual indBranch() {
        Individual branch = null;
        try {
            double withdraw_limit = 5000.00;
            int c_id = 200;
            String c_name = "mitul";
            int c_phone = 445566332;
            String c_email = "mitul@abc.com";
            ArrayList<Accounts> accountsList = new ArrayList<Accounts>();
            branch = new Individual(withdraw_limit, c_id, c_name, c_phone, c_email, accountsList);
            System.out.println(branch);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return branch;
    }

    public boolean validate(double withdraw_limit, int c_id, String c_name, int c_phone, String c_email, ArrayList<Accounts> accountsList) {
        boolean status = false;
        Individual branch = Individual.indBranch();

        if (branch.getWithdraw_limit() == (withdraw_limit) && branch.getC_id() == (c_id) && branch.getC_name().equalsIgnoreCase(c_name) && branch.getC_phone() == (c_phone) && branch.getC_email().equalsIgnoreCase(c_email) && branch.getAccountsList().equals(accountsList)) {
            return true;
        }
        return status;
    }

}
