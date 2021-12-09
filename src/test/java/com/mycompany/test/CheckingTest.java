/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import com.mycompany.vo.Accounts;
import com.mycompany.vo.Checking;
import java.util.ArrayList;
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
public class CheckingTest {

    Checking checking;
    Checking checking2;
    Checking chkBT;
    Checking checkingbt = new Checking();

    public CheckingTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        checking = new Checking(1500.00, 12, 1122333447, 01122336, 6500.00);
        checking2 = new Checking();
        chkBT = new Checking();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testChecking() {
        checking.setMinimum_balance(1500.00);
        assertEquals(1500.00, checking.getMinimum_balance(), 0);

        checking2.setMinimum_balance(1500.00);
        assertEquals(1500.00, checking2.getMinimum_balance(), 0);

        Checking c = new Checking();
        String checking1 = "Checking{minimum_balance=0.0,Accounts{c_id=0, account_number=0, routing_number=0, account_balance=0.0}}";
        assertEquals(checking1, c.toString());

    }

    @Test
    public void testTrue() {
        assertTrue(chkBT.validate(1500.0, 101, 112233456, 1122345, 4500.00));
    }

    @Test
    public void testFalse() {
        assertTrue(!chkBT.validate(500.0, 201, 112234456, 1122335, 2500.00));
    }

    @Test
    public void validateReturnsFalseWhenMinimumBalanceDoesNotMatch() {

        double minimum_balance = 500.00;
        int c_id = 101;
        int account_number = 112233456;
        int routing_number = 1122345;
        double account_balance = 4500.00;

        assertFalse(checkingbt.validate(minimum_balance, c_id, account_number, routing_number, account_balance));

    }

    @Test
    public void validateReturnsFalseWhenIdDoesNotMatch() {

        double minimum_balance = 1500.00;
        int c_id = 301;
        int account_number = 112233456;
        int routing_number = 1122345;
        double account_balance = 4500.00;

        assertFalse(checkingbt.validate(minimum_balance, c_id, account_number, routing_number, account_balance));

    }

    @Test
    public void validateReturnsFalseWhenAccountNumberDoesNotMatch() {

        double minimum_balance = 1500.00;
        int c_id = 101;
        int account_number = 112234456;
        int routing_number = 1122345;
        double account_balance = 4500.00;

        assertFalse(checkingbt.validate(minimum_balance, c_id, account_number, routing_number, account_balance));

    }

    @Test
    public void validateReturnsFalseWhenRoutingNumberDoesNotMatch() {

        double minimum_balance = 1500.00;
        int c_id = 101;
        int account_number = 112233456;
        int routing_number = 1122335;
        double account_balance = 4500.00;

        assertFalse(checkingbt.validate(minimum_balance, c_id, account_number, routing_number, account_balance));

    }

    @Test
    public void validateReturnsFalseWhenAccountBalanceDoesNotMatch() {

        double minimum_balance = 1500.00;
        int c_id = 101;
        int account_number = 112233456;
        int routing_number = 1122345;
        double account_balance = 2500.00;

        assertFalse(checkingbt.validate(minimum_balance, c_id, account_number, routing_number, account_balance));

    }

    @Test
    public void validateReturnsTrueWhenEverythingMatch() {

        double minimum_balance = 1500.00;
        int c_id = 101;
        int account_number = 112233456;
        int routing_number = 1122345;
        double account_balance = 4500.00;

        assertTrue(checkingbt.validate(minimum_balance, c_id, account_number, routing_number, account_balance));

    }
}
