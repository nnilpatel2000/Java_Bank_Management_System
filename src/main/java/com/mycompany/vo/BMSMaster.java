/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author saiye
 */
public class BMSMaster {

    public static void main(String[] args) {
        int choice = 0;
        Bank_Management_System bms = null;
        Employee ftemp = null;
        Employee ptemp = null;
        Customer cus = null;
        Accounts cAcc = null;
        Accounts sAcc = null;

        do {
            mainMenu();
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Bank");
                    subMenuBMS();
                    Scanner sc1 = new Scanner(System.in);
                    int choice1 = sc.nextInt();

                    switch (choice1) {
                        case 1:
                            System.out.println("Bank Name option selected");
                            subMenu();
                            Scanner sc2 = new Scanner(System.in);
                            int choice11 = sc2.nextInt();

                            switch (choice11) {
                                case 1:
                                    System.out.println("Add option Selected");
                                    bms = new Bank_Management_System("Bank Of America", null, null, null, new ArrayList<Employee>(), new ArrayList<Customer>());
                                    System.out.println(bms);
                                    break;
                                case 2:
                                    System.out.println("Edit option selected");
                                    if (bms == null) {
                                        System.out.println("Add a Bank first ");
                                        break;
                                    }
                                    System.out.println("Enter Bank's new name");
                                    Scanner sc3 = new Scanner(System.in);
                                    String name = sc3.next();
                                    bms.setBankName(name);
                                    System.out.println(bms);
                                    break;

                                case 4:
                                    System.out.println("View option selected");
                                    if (bms == null) {
                                        System.out.println("Add a bank first ");
                                        break;
                                    }
                                    System.out.println(bms);
                                    break;

                                case 5:
                                    System.out.println("Back option selected");
                                    subMenuBMS();
                                    Scanner sc5 = new Scanner(System.in);
                                    int subMenuBMSChoice5 = sc5.nextInt();
                                    break;
                            }
                            break;

                        case 2:
                            System.out.println("User Type option selected");
                            subMenuUserType();
                            Scanner sc6 = new Scanner(System.in);
                            int choice12 = sc6.nextInt();
                            switch (choice12) {
                                case 1:
                                    System.out.println("Employee option Selected");
                                    break;
                                case 2:
                                    System.out.println("Customer option Selected");
                                    break;
                                case 3:
                                    System.out.println("Back option selected");
                                    subMenuBMS();
                                    Scanner sc7 = new Scanner(System.in);
                                    int subMenuUserTypeChoice3 = sc7.nextInt();
                                    break;
                            }
                            break;
                        case 5:
                            System.out.println("Back Option Selected");
                            mainMenu();
                            Scanner sc225 = new Scanner(System.in);
                            int mainMenuChoice = sc225.nextInt();
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Employee");
                    subMenuEmp();
                    Scanner sc8 = new Scanner(System.in);
                    int choice2 = sc8.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.println("FullTime Employee option selected");
                            subMenu();
                            Scanner sc10 = new Scanner(System.in);
                            int choice21 = sc10.nextInt();
                            switch (choice21) {
                                case 1:
                                    System.out.println("Add option Selected");
                                    System.out.println("Enter FullTime Employee Id");
                                    Scanner sc111 = new Scanner(System.in);
                                    int e_id = sc111.nextInt();
                                    System.out.println("Enter FullTime Employee Name");
                                    String e_name = sc111.next();
                                    System.out.println("Enter FullTime Employee Phone");
                                    int e_phone = sc111.nextInt();
                                    System.out.println("Enter FullTime Employee Email");
                                    String email = sc111.next();
                                    System.out.println("Enter Annual Salary");
                                    double annual_salary = sc111.nextDouble();
                                    Employee ftemp11 = new FullTime(annual_salary, e_id, e_name, e_phone, email);
                                    bms.getEmployeeList().add(ftemp11);
                                    System.out.println(bms);
                                    break;
                                case 2:
                                    System.out.println("Edit option selected");
                                    if (bms == null) {
                                        System.out.println("Add a bank first");
                                        break;
                                    }
                                    if (ftemp == null) {
                                        System.out.println("Add an Employee first ");
                                        break;
                                    }
                                    System.out.println("Enter FullTime Employee Id");
                                    Scanner sc11 = new Scanner(System.in);
                                    e_id = sc11.nextInt();
                                    System.out.println("Enter FullTime Employee Name");
                                    e_name = sc11.next();
                                    System.out.println("Enter FullTime Employee Phone");
                                    e_phone = sc11.nextInt();
                                    System.out.println("Enter FullTime Employee Email");
                                    email = sc11.next();
                                    System.out.println("Enter Annual Salary");
                                    annual_salary = sc11.nextDouble();
                                    Employee ftemp1 = new FullTime(annual_salary, e_id, e_name, e_phone, email);
                                    bms.getEmployeeList().add(ftemp1);
                                    System.out.println(bms);
                                    break;

                                case 4:
                                    System.out.println("View option selected");
                                    if (bms == null) {
                                        System.out.println("Add a bank first");
                                        break;
                                    }
                                    if (ftemp == null) {
                                        System.out.println("Add an Employee first ");
                                        break;
                                    }

                                    System.out.println(bms);
                                    break;

                                case 5:
                                    System.out.println("Back option selected");
                                    subMenuEmp();
                                    Scanner sc12 = new Scanner(System.in);
                                    int subMenuEmpChoice5 = sc12.nextInt();
                                    break;
                            }
                            break;

                        case 2:
                            System.out.println("PartTime Employee option selected");
                            subMenu();
                            Scanner sc13 = new Scanner(System.in);
                            int choice22 = sc13.nextInt();
                            switch (choice22) {
                                case 1:
                                    System.out.println("Add option Selected");
                                    System.out.println("Enter PartTime Employee Id");
                                    Scanner sc114 = new Scanner(System.in);
                                    int e_id = sc114.nextInt();
                                    System.out.println("Enter PartTime Employee Name");
                                    String e_name = sc114.next();
                                    System.out.println("Enter PartTime Employee Phone");
                                    int e_phone = sc114.nextInt();
                                    System.out.println("Enter PartTime Employee Email");
                                    String email = sc114.next();
                                    System.out.println("Enter Annual Salary");
                                    double annual_salary = sc114.nextDouble();
                                    Employee ptemp11 = new PartTime(annual_salary, e_id, e_name, e_phone, email);
                                    bms.getEmployeeList().add(ptemp11);
                                    System.out.println(bms);
                                    break;
                                case 2:
                                    System.out.println("Edit option selected");
                                    if (bms == null) {
                                        System.out.println("Add a bank first");
                                        break;
                                    }
                                    if (ptemp == null) {
                                        System.out.println("Add an Employee first ");
                                        break;
                                    }
                                    System.out.println("Enter PartTime Employee Id");
                                    Scanner sc14 = new Scanner(System.in);
                                    e_id = sc14.nextInt();
                                    System.out.println("Enter PartTime Employee Name");
                                    e_name = sc14.next();
                                    System.out.println("Enter PartTime Employee Phone");
                                    e_phone = sc14.nextInt();
                                    System.out.println("Enter PartTime Employee Email");
                                    email = sc14.next();
                                    System.out.println("Enter Annual Salary");
                                    annual_salary = sc14.nextDouble();
                                    Employee ptemp1 = new PartTime(annual_salary, e_id, e_name, e_phone, email);
                                    bms.getEmployeeList().add(ptemp1);
                                    System.out.println(bms);
                                    break;
                                case 4:
                                    System.out.println("View option selected");
                                    if (bms == null) {
                                        System.out.println("Add a bank first");
                                        break;
                                    }
                                    if (ptemp == null) {
                                        System.out.println("Add an Employee first ");
                                        break;
                                    }

                                    System.out.println(bms);
                                    break;

                                case 5:
                                    System.out.println("Back option selected");
                                    subMenuEmp();
                                    Scanner sc15 = new Scanner(System.in);
                                    int subMenuEmpChoice5 = sc15.nextInt();
                                    break;
                            }
                            break;

                        case 3:
                            System.out.println("Back Option Selected");
                            mainMenu();
                            Scanner sc1114 = new Scanner(System.in);
                            int mainMenuChoice = sc1114.nextInt();
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Customer");
                    subMenuCus();
                    Scanner sc16 = new Scanner(System.in);
                    int choice3 = sc16.nextInt();
                    switch (choice3) {
                        case 1:
                            System.out.println("Business Customer Option Selected");
                            subMenu();
                            Scanner sc17 = new Scanner(System.in);
                            int choice31 = sc17.nextInt();
                            switch (choice31) {
                                case 1:
                                    System.out.println("Add Option Selected");
                                    Scanner sc18 = new Scanner(System.in);
                                    System.out.println("Enter Business Customer Id");
                                    int c_id = sc18.nextInt();
                                    System.out.println("Enter Business Customer Name");
                                    String c_name = sc18.next();
                                    System.out.println("Enter Business Customer Phone");
                                    int c_phone = sc18.nextInt();
                                    System.out.println("Enter Business Customer Email");
                                    String c_email = sc18.next();
                                    double withdraw_limit = 10000.0;
                                    cus = new Business(withdraw_limit, c_id, c_name, c_phone, c_email, new ArrayList<Accounts>());
                                    bms.getCustomerList().add(cus);
                                    System.out.println(bms);
                                    break;
                                case 2:
                                    System.out.println("Edit option selected");
                                    if (bms == null) {
                                        System.out.println("Add a bank first");
                                        break;
                                    }
                                    if (cus == null) {
                                        System.out.println("Add a Customer first");
                                        break;
                                    }
                                    System.out.println("Enter Business Customer Id");
                                    Scanner sc19 = new Scanner(System.in);
                                    c_id = sc19.nextInt();
                                    System.out.println("Enter Business Customer Name");
                                    c_name = sc19.next();
                                    System.out.println("Enter Business Customer Phone");
                                    c_phone = sc19.nextInt();
                                    System.out.println("Enter Business Customer Email");
                                    c_email = sc19.next();
                                    withdraw_limit = 10000.0;
                                    cus = new Business(withdraw_limit, c_id, c_name, c_phone, c_email, new ArrayList<Accounts>());
                                    bms.getCustomerList().add(cus);
                                    System.out.println(bms);
                                    break;
                                case 4:
                                    System.out.println("View option selected");
                                    if (bms == null) {
                                        System.out.println("Add a bank first");
                                        break;
                                    }
                                    if (cus == null) {
                                        System.out.println("Add a Customer first ");
                                        break;
                                    }

                                    System.out.println(bms);
                                    break;

                                case 5:
                                    System.out.println("Back option selected");
                                    subMenuCus();
                                    Scanner sc20 = new Scanner(System.in);
                                    int subMenuCusChoice5 = sc20.nextInt();
                                    break;
                            }
                            break;

                        case 2:
                            System.out.println("Individual Customer Option Selected");
                            subMenu();
                            Scanner sc21 = new Scanner(System.in);
                            int choice32 = sc21.nextInt();
                            switch (choice32) {
                                case 1:
                                    System.out.println("Add Option Selected");
                                    Scanner sc22 = new Scanner(System.in);
                                    System.out.println("Enter Individual Customer Id");
                                    int c_id = sc22.nextInt();
                                    System.out.println("Enter Individual Customer Name");
                                    String c_name = sc22.next();
                                    System.out.println("Enter Individual Customer Phone");
                                    int c_phone = sc22.nextInt();
                                    System.out.println("Enter Individual Customer Email");
                                    String c_email = sc22.next();
                                    double withdraw_limit = 5000.0;
                                    cus = new Individual(withdraw_limit, c_id, c_name, c_phone, c_email, new ArrayList<Accounts>());
                                    bms.getCustomerList().add(cus);
                                    System.out.println(bms);
                                    break;
                                case 2:
                                    System.out.println("Edit option selected");
                                    if (bms == null) {
                                        System.out.println("Add a bank first");
                                        break;
                                    }
                                    if (cus == null) {
                                        System.out.println("Add a Customer first");
                                        break;
                                    }
                                    System.out.println("Enter Individual Customer Id");
                                    Scanner sc23 = new Scanner(System.in);
                                    c_id = sc23.nextInt();
                                    System.out.println("Enter Individual Customer Name");
                                    c_name = sc23.next();
                                    System.out.println("Enter Individual Customer Phone");
                                    c_phone = sc23.nextInt();
                                    System.out.println("Enter Individual Customer Email");
                                    c_email = sc23.next();
                                    withdraw_limit = 10000.0;
                                    Customer iCus = new Business(withdraw_limit, c_id, c_name, c_phone, c_email, new ArrayList<Accounts>());
                                    bms.getCustomerList().add(iCus);
                                    System.out.println(bms);
                                    break;
                                case 4:
                                    System.out.println("View option selected");
                                    if (bms == null) {
                                        System.out.println("Add a bank first");
                                        break;
                                    }
                                    if (cus == null) {
                                        System.out.println("Add a Customer first ");
                                        break;
                                    }

                                    System.out.println(bms);
                                    break;

                                case 5:
                                    System.out.println("Back Option Selected");
                                    subMenuCus();
                                    Scanner sc24 = new Scanner(System.in);
                                    int subMenuCusChoice5 = sc24.nextInt();
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("Back Option Selected");
                            mainMenu();
                            Scanner sc224 = new Scanner(System.in);
                            int mainMenuChoice = sc224.nextInt();
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Accounts");
                    subMenuAcc();
                    Scanner sc25 = new Scanner(System.in);
                    int choice4 = sc25.nextInt();
                    switch (choice4) {
                        case 1:
                            System.out.println("Checking Account Option Selected");
                            subMenu();
                            Scanner sc26 = new Scanner(System.in);
                            int choice41 = sc26.nextInt();
                            switch (choice41) {
                                case 1:
                                    System.out.println("Add option Selected");
                                    System.out.println("Enter Customer ID");
                                    int c_id = sc26.nextInt();
                                    System.out.println("Enter Checking Account number");
                                    int account_number = sc26.nextInt();
                                    System.out.println("Enter Checking Routing Number");
                                    int routing_number = sc26.nextInt();
                                    System.out.println("Enter Checking Account Balance");
                                    double account_balance = sc26.nextDouble();
                                    double minimum_limit = 1500.00;
                                    cAcc = new Checking(minimum_limit, c_id, account_number, routing_number, account_balance);
                                    cus.getAccountsList().add(cAcc);
                                    System.out.println(bms);
                                    break;
                                case 2:
                                    System.out.println("Edit option selected");
                                    if (bms == null) {
                                        System.out.println("Add a bank first");
                                        break;
                                    }
                                    if (cAcc == null) {
                                        System.out.println("Add an Account first");
                                        break;
                                    }
                                    System.out.println("Enter Customer ID");
                                    Scanner sc27 = new Scanner(System.in);
                                    c_id = sc27.nextInt();
                                    System.out.println("Enter Checking Account number");
                                    account_number = sc27.nextInt();
                                    System.out.println("Enter Checking Routing Number");
                                    routing_number = sc27.nextInt();
                                    System.out.println("Enter Checking Account Balance");
                                    account_balance = sc27.nextDouble();
                                    minimum_limit = 1500.00;
                                    cAcc = new Checking(minimum_limit, c_id, account_number, routing_number, account_balance);
                                    cus.getAccountsList().add(cAcc);
                                    System.out.println(bms);
                                    break;
                                case 4:
                                    System.out.println("View option selected");
                                    if (bms == null) {
                                        System.out.println("Add a bank first");
                                        break;
                                    }
                                    if (cAcc == null) {
                                        System.out.println("Add an Employee first ");
                                        break;
                                    }
                                    System.out.println(bms);
                                    break;

                                case 5:
                                    System.out.println("Back option selected");
                                    subMenuAcc();
                                    Scanner sc28 = new Scanner(System.in);
                                    int subMenuAccChoice = sc28.nextInt();
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Savings Account Option Selected");
                            subMenu();
                            Scanner sc29 = new Scanner(System.in);
                            int choice42 = sc29.nextInt();
                            switch (choice42) {
                                case 1:
                                    System.out.println("Add option Selected");
                                    System.out.println("Enter Customer ID");
                                    Scanner sc30 = new Scanner(System.in);
                                    int c_id = sc30.nextInt();
                                    System.out.println("Enter Checking Account number");
                                    int account_number = sc30.nextInt();
                                    System.out.println("Enter Checking Routing Number");
                                    int routing_number = sc30.nextInt();
                                    System.out.println("Enter Checking Account Balance");
                                    double account_balance = sc30.nextDouble();
                                    double minimum_limit = 500.00;
                                    sAcc = new Savings(minimum_limit, c_id, account_number, routing_number, account_balance);
                                    cus.getAccountsList().add(sAcc);
                                    System.out.println(bms);
                                    break;
                                case 2:
                                    System.out.println("Edit option selected");
                                    if (bms == null) {
                                        System.out.println("Add a bank first");
                                        break;
                                    }
                                    if (sAcc == null) {
                                        System.out.println("Add an Account first");
                                        break;
                                    }
                                    System.out.println("Enter Customer ID");
                                    Scanner sc31 = new Scanner(System.in);
                                    c_id = sc31.nextInt();
                                    System.out.println("Enter Checking Account number");
                                    account_number = sc31.nextInt();
                                    System.out.println("Enter Checking Routing Number");
                                    routing_number = sc31.nextInt();
                                    System.out.println("Enter Checking Account Balance");
                                    account_balance = sc31.nextDouble();
                                    minimum_limit = 500.00;
                                    sAcc = new Savings(minimum_limit, c_id, account_number, routing_number, account_balance);
                                    cus.getAccountsList().add(sAcc);
                                    System.out.println(bms);
                                    break;
                                case 4:
                                    System.out.println("View option selected");
                                    if (bms == null) {
                                        System.out.println("Add a bank first");
                                        break;
                                    }
                                    if (sAcc == null) {
                                        System.out.println("Add an Employee first ");
                                        break;
                                    }
                                    System.out.println(bms);
                                    break;

                                case 5:
                                    System.out.println("Back option selected");
                                    subMenuAcc();
                                    Scanner sc32 = new Scanner(System.in);
                                    int subMenuAccChoice = sc32.nextInt();
                                    break;

                            }
                            break;
                        case 3:
                            System.out.println("Back Option Selected");
                            mainMenu();
                            Scanner sc226 = new Scanner(System.in);
                            int mainMenuChoice = sc226.nextInt();
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Exit from the Menu");
                    break;

            }

        } while (choice != 5);

    }

    static void mainMenu() {
        System.out.println("===Bank Of America===");
        System.out.println("1 Bank");
        System.out.println("2 Employee");
        System.out.println("3 Customer");
        System.out.println("4 Accounts");
        System.out.println("5 Exit");
        System.out.println("Enter your choice : ");
    }

    static void subMenu() {
        System.out.println("1 Add");
        System.out.println("2 Edit");
        System.out.println("3 Delete");
        System.out.println("4 view");
        System.out.println("5 Back");
        System.out.println("Enter your choice : ");

    }

    static void subMenuBMS() {
        System.out.println("---Bank Option Selected---");
        System.out.println("1 Bank Name");
        System.out.println("2 User Type");
        System.out.println("3 User Name");
        System.out.println("4 Password");
        System.out.println("5 Back");
        System.out.println("Enter your choice : ");
    }

    static void subMenuEmp() {
        System.out.println("1 FullTime Employee");
        System.out.println("2 PartTime Employee");
        System.out.println("3 Back");
        System.out.println("Enter your choice : ");
    }

    static void subMenuCus() {
        System.out.println("1 Business Customer");
        System.out.println("2 Individual Customer");
        System.out.println("3 Back");
        System.out.println("Enter your choice : ");
    }

    static void subMenuAcc() {
        System.out.println("1 Checking Account");
        System.out.println("2 Savings Account");
        System.out.println("3 Back");
        System.out.println("Enter your choice : ");
    }

    static void subMenuUserType() {
        System.out.println("1 Employee");
        System.out.println("2 Customer");
        System.out.println("3 Back");
        System.out.println("Enter your choice : ");
    }
}
