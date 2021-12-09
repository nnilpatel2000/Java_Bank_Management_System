/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import com.mycompany.vo.Accounts;
import com.mycompany.vo.Business;
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
public class BusinessTest {

    Business business;
    Business business1;
    Business busBT;
    Business bus = new Business();

    public BusinessTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        business = new Business();
        business1 = new Business(10000.00, 1, "Jack", 223232232, "jack@abc.com", business.getAccountsList());
        busBT = new Business();

    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testBusiness() {

        business.setWithdraw_limit(10000.00);
        assertEquals(10000.00, business.getWithdraw_limit(), 0);

        business1.setWithdraw_limit(10000.00);
        assertEquals(10000.00, business1.getWithdraw_limit(), 0);

        Business business2 = new Business();

        String business3 = "Business{withdraw_limit=0.0,Customer{c_id=0, c_name=null, c_phone=0, c_email=null, accountsList=null}}";
        assertEquals(business3, business2.toString());

    }

    @Test
    public void testTrue() {
        assertTrue(busBT.validate(10000.0, 100, "Nil", 998877665, "nil@abc.com", new ArrayList<Accounts>()));
    }

    @Test
    public void testFalse() {
        assertTrue(!busBT.validate(5000.00, 200, "mitul", 4646664, "sfsff", new ArrayList<Accounts>()));
    }

    @Test
    public void validateReturnsFalseWhenWithdrawLimitDoesNotMatch() {

        double withdraw_limit = 5000.00;
        int c_id = 100;
        String c_name = "Nil";
        int c_phone = 998877665;
        String c_email = "nil@abc.com";
        ArrayList<Accounts> accountsList = new ArrayList<Accounts>();

        assertFalse(bus.validate(withdraw_limit, c_id, c_name, c_phone, c_email, accountsList));

    }

    @Test
    public void validateReturnsFalseWhenIdDoesNotMatch() {

        double withdraw_limit = 10000.00;
        int c_id = 200;
        String c_name = "Nil";
        int c_phone = 998877665;
        String c_email = "nil@abc.com";
        ArrayList<Accounts> accountsList = new ArrayList<Accounts>();

        assertFalse(bus.validate(withdraw_limit, c_id, c_name, c_phone, c_email, accountsList));

    }

    @Test
    public void validateReturnsFalseWhenNameDoesNotMatch() {

        double withdraw_limit = 10000.00;
        int c_id = 100;
        String c_name = "mitul";
        int c_phone = 998877665;
        String c_email = "nil@abc.com";
        ArrayList<Accounts> accountsList = new ArrayList<Accounts>();

        assertFalse(bus.validate(withdraw_limit, c_id, c_name, c_phone, c_email, accountsList));

    }

    @Test
    public void validateReturnsFalseWhenPhoneDoesNotMatch() {

        double withdraw_limit = 10000.00;
        int c_id = 100;
        String c_name = "Nil";
        int c_phone = 542155;
        String c_email = "nil@abc.com";
        ArrayList<Accounts> accountsList = new ArrayList<Accounts>();
        assertFalse(bus.validate(withdraw_limit, c_id, c_name, c_phone, c_email, accountsList));

    }

    @Test
    public void validateReturnsFalseWhenEmailDoesNotMatch() {

        double withdraw_limit = 10000.00;
        int c_id = 100;
        String c_name = "Nil";
        int c_phone = 998877665;
        String c_email = "mitul@abc.com";
        ArrayList<Accounts> accountsList = new ArrayList<Accounts>();

        assertFalse(bus.validate(withdraw_limit, c_id, c_name, c_phone, c_email, accountsList));

    }

    @Test
    public void validateReturnsFalseWhenAccountsListDoesNotMatch() {

        double withdraw_limit = 10000.00;
        int c_id = 100;
        String c_name = "Nil";
        int c_phone = 998877665;
        String c_email = "nil@abc.com";
        ArrayList<Accounts> accountsList = null;

        assertFalse(bus.validate(withdraw_limit, c_id, c_name, c_phone, c_email, accountsList));

    }

    @Test
    public void validateReturnsTrueWhenEverythingMatch() {

        double withdraw_limit = 10000.00;
        int c_id = 100;
        String c_name = "Nil";
        int c_phone = 998877665;
        String c_email = "nil@abc.com";
        ArrayList<Accounts> accountsList = new ArrayList<Accounts>();

        assertTrue(bus.validate(withdraw_limit, c_id, c_name, c_phone, c_email, accountsList));

    }
}
