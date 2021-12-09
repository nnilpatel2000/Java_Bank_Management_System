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
public class Employee {

    private int e_id;
    private String e_name;
    private int e_phone;
    private String email;

    @Override
    public String toString() {
        return "Employee{" + "e_id=" + e_id + ", e_name=" + e_name + ", e_phone=" + e_phone + ", email=" + email + '}';
    }

    public Employee() {
    }

    public Employee(int e_id, String e_name, int e_phone, String email) {
        this.e_id = e_id;
        this.e_name = e_name;
        this.e_phone = e_phone;
        this.email = email;
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public int getE_phone() {
        return e_phone;
    }

    public void setE_phone(int e_phone) {
        this.e_phone = e_phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static Employee eBranch() {
        Employee branch = null;
        try {
            int e_id = 10;
            String e_name = "nil";
            int e_phone = 123456789;
            String email = "abc@abc.com";
            branch = new Employee(e_id, e_name, e_phone, email);
            System.out.println(branch);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return branch;
    }

    public boolean validate(int e_id, String e_name, int e_phone, String email) {
        boolean status = false;
        Employee branch = Employee.eBranch();

        if (branch.getE_id() == (e_id) && branch.getE_name().equals(e_name)
                && branch.getE_phone() == (e_phone) && branch.getEmail().equals(email)) {
            return true;
        }
        return status;
    }

}
