/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import com.mycompany.vo.Accounts;
import com.mycompany.vo.Business;
import com.mycompany.vo.Checking;
import com.mycompany.vo.Customer;
import com.mycompany.vo.Employee;
import com.mycompany.vo.Individual;
import com.mycompany.vo.Savings;
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
public class CustomerTest {

    Customer c1;
    Customer c2;
    Customer c3;
    Customer c4;
    Customer c5;
    Customer c6;
    Customer cBT;
    Customer customer = new Customer();

    public CustomerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        c6 = new Customer();
        c1 = new Business(10000.00, 1, "Amy", 212212212, "amy@xyz.com", c6.getAccountsList());
        c2 = new Individual(5000.00, 4, "Mike", 313313313, "mike@abc.com", c6.getAccountsList());
        cBT = new Customer();

    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCustomer() {
        ArrayList<Accounts> accountsList = new ArrayList<Accounts>();
        Accounts acc1 = new Checking(1500.00, 14, 1122333444, 01122333, 5500.00);
        Accounts acc2 = new Checking(1500.00, 15, 1122333443, 01122332, 7500.00);
        Accounts acc3 = new Savings(500.00, 16, 1122333445, 01123334, 3500.00);
        Accounts acc4 = new Savings(500.00, 17, 1122333449, 01123331, 7000.00);

        accountsList.add(acc1);
        accountsList.add(acc2);
        accountsList.add(acc3);
        accountsList.add(acc4);

        c6.setAccountsList(accountsList);

        c6.setC_id(1);
        assertEquals(1, c6.getC_id());

        c6.setC_name("tom");
        assertEquals("tom", c6.getC_name());

        c6.setC_email("tom@abc.com");
        assertEquals("tom@abc.com", c6.getC_email());

        c6.setC_phone(311123312);
        assertEquals(311123312, c6.getC_phone());

    }

    @Test
    public void testTrue() {
        assertTrue(cBT.validate(100, "nil", 123456789, "abc@abc.com", new ArrayList<Accounts>()));
    }

    @Test
    public void testFalse() {
        assertTrue(!cBT.validate(12, "mitul", 4646664, "sfsff", new ArrayList<Accounts>()));
    }

    @Test
    public void validateReturnsFalseWhenIdDoesNotMatch() {

        int c_id = 101;
        String c_name = "nil";
        int c_phone = 123456789;
        String c_email = "abc@abc.com";
        ArrayList<Accounts> accountsList = new ArrayList<Accounts>();

        assertFalse(customer.validate(c_id, c_name, c_phone, c_email, accountsList));

    }

    @Test
    public void validateReturnsFalseWhenNameDoesNotMatch() {

        int c_id = 100;
        String c_name = "mitul";
        int c_phone = 123456789;
        String c_email = "abc@abc.com";
        ArrayList<Accounts> accountsList = new ArrayList<Accounts>();

        assertFalse(customer.validate(c_id, c_name, c_phone, c_email, accountsList));

    }

    @Test
    public void validateReturnsFalseWhenPhoneDoesNotMatch() {

        int c_id = 100;
        String c_name = "nil";
        int c_phone = 123456780;
        String c_email = "abc@abc.com";
        ArrayList<Accounts> accountsList = new ArrayList<Accounts>();

        assertFalse(customer.validate(c_id, c_name, c_phone, c_email, accountsList));

    }

    @Test
    public void validateReturnsFalseWhenEmailDoesNotMatch() {

        int c_id = 100;
        String c_name = "nil";
        int c_phone = 123456789;
        String c_email = "xyz@abc.com";
        ArrayList<Accounts> accountsList = new ArrayList<Accounts>();

        assertFalse(customer.validate(c_id, c_name, c_phone, c_email, accountsList));

    }

    @Test
    public void validateReturnsFalseWhenAccountsListDoesNotMatch() {

        int c_id = 100;
        String c_name = "nil";
        int c_phone = 123456789;
        String c_email = "xyz@abc.com";
        ArrayList<Accounts> accountsList = null;

        assertFalse(customer.validate(c_id, c_name, c_phone, c_email, accountsList));

    }

    @Test
    public void validateReturnsTrueWhenEverythingMatch() {

        int c_id = 100;
        String c_name = "nil";
        int c_phone = 123456789;
        String c_email = "abc@abc.com";
        ArrayList<Accounts> accountsList = new ArrayList<Accounts>();

        assertTrue(customer.validate(c_id, c_name, c_phone, c_email, accountsList));

    }

}
