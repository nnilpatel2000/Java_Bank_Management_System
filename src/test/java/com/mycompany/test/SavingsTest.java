/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import com.mycompany.vo.Savings;
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
public class SavingsTest {

    Savings savings;
    Savings saveBT;
    Savings savingsbt = new Savings();

    public SavingsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        savings = new Savings(500.00, 13, 1122333448, 01122337, 5000.00);
        saveBT = new Savings();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testSavings() {
        savings.setMinimum_balance(500.00);
        assertEquals(500.00, savings.getMinimum_balance(), 0);

        Savings s = new Savings();
        String savings1 = "Savings{minimum_balance=0.0,Accounts{c_id=0, account_number=0, routing_number=0, account_balance=0.0}}";
        assertEquals(savings1, s.toString());

    }

    @Test
    public void testTrue() {
        assertTrue(saveBT.validate(500.0, 201, 112233567, 1122456, 3500.00));
    }

    @Test
    public void testFalse() {
        assertTrue(!saveBT.validate(1500.0, 101, 112234456, 1122335, 2500.00));
    }

    @Test
    public void validateReturnsFalseWhenMinimumBalanceDoesNotMatch() {

        double minimum_balance = 1500.00;
        int c_id = 201;
        int account_number = 112233567;
        int routing_number = 1122456;
        double account_balance = 3500.00;

        assertFalse(savingsbt.validate(minimum_balance, c_id, account_number, routing_number, account_balance));

    }

    @Test
    public void validateReturnsFalseWhenIdDoesNotMatch() {

        double minimum_balance = 500.00;
        int c_id = 401;
        int account_number = 112233567;
        int routing_number = 1122456;
        double account_balance = 3500.00;

        assertFalse(savingsbt.validate(minimum_balance, c_id, account_number, routing_number, account_balance));

    }

    @Test
    public void validateReturnsFalseWhenAccountNumberDoesNotMatch() {

        double minimum_balance = 500.00;
        int c_id = 201;
        int account_number = 112233678;
        int routing_number = 1122456;
        double account_balance = 3500.00;

        assertFalse(savingsbt.validate(minimum_balance, c_id, account_number, routing_number, account_balance));

    }

    @Test
    public void validateReturnsFalseWhenRoutingNumberDoesNotMatch() {

        double minimum_balance = 500.00;
        int c_id = 201;
        int account_number = 112233567;
        int routing_number = 1122654;
        double account_balance = 3500.00;

        assertFalse(savingsbt.validate(minimum_balance, c_id, account_number, routing_number, account_balance));

    }

    @Test
    public void validateReturnsFalseWhenAccountBalanceDoesNotMatch() {

        double minimum_balance = 500.00;
        int c_id = 201;
        int account_number = 112233567;
        int routing_number = 1122456;
        double account_balance = 7500.00;

        assertFalse(savingsbt.validate(minimum_balance, c_id, account_number, routing_number, account_balance));

    }

    @Test
    public void validateReturnsTrueWhenEverythingMatch() {

        double minimum_balance = 500.00;
        int c_id = 201;
        int account_number = 112233567;
        int routing_number = 1122456;
        double account_balance = 3500.00;

        assertTrue(savingsbt.validate(minimum_balance, c_id, account_number, routing_number, account_balance));

    }
}
