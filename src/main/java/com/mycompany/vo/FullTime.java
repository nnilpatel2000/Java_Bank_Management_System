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
public class FullTime extends Employee {

    private double annual_salary;

    @Override
    public String toString() {
        return "FullTime{" + "annual_salary=" + annual_salary + "," + super.toString() + '}';
    }

    public FullTime() {
    }

    public FullTime(double annual_salary, int e_id, String e_name, int e_phone, String email) {
        super(e_id, e_name, e_phone, email);
        this.annual_salary = annual_salary;
    }

    public double getAnnual_salary() {
        return annual_salary;
    }

    public void setAnnual_salary(double annual_salary) {
        this.annual_salary = annual_salary;
    }

    public static FullTime ftBranch() {
        FullTime branch = null;
        try {
            double annual_salary = 100000.00;
            int e_id = 1;
            String e_name = "faisal";
            int e_phone = 123456789;
            String email = "faisal@abc.com";
            branch = new FullTime(annual_salary, e_id, e_name, e_phone, email);
            System.out.println(branch);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return branch;
    }

    public boolean validate(double annual_salary, int e_id, String e_name, int e_phone, String email) {
        boolean status = false;
        FullTime branch = FullTime.ftBranch();

        if (branch.getAnnual_salary() == (annual_salary) && branch.getE_id() == (e_id) && branch.getE_name().equalsIgnoreCase(e_name) && branch.getE_phone() == (e_phone) && branch.getEmail().equalsIgnoreCase(email)) {
            return true;
        }
        return status;
    }

}
