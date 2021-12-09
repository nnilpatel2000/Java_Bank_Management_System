/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import com.mycompany.vo.Accounts;
import com.mycompany.vo.Bank_Management_System;
import com.mycompany.vo.Customer;
import com.mycompany.vo.Employee;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author saiye
 */
public class BMSMasterTest {

    Bank_Management_System bms;
    Employee ftemp;
    Employee ptemp;
    Customer cus;
    Accounts cAcc;
    Accounts sAcc;

    public BMSMasterTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        bms = new Bank_Management_System();
        ftemp = new Employee();
        ptemp = new Employee();
        cus = new Customer();
        cAcc = new Accounts();
        sAcc = new Accounts();

    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void BMSTest() {

    }
}
