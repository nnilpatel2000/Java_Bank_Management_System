/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import com.mycompany.vo.Accounts;
import com.mycompany.vo.Business;
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
public class IndividualTest {

    Individual individual;
    Individual individual1;
    Individual indBT;
    Individual ind = new Individual();

    public IndividualTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        individual = new Individual();
        individual1 = new Individual(5000.00, 4, "Mike", 313313313, "mike@abc.com", individual.getAccountsList());
        indBT = new Individual();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testIndividual() {

        individual.setWithdraw_limit(5000.00);
        assertEquals(5000.00, individual.getWithdraw_limit(), 0);

        individual1.setWithdraw_limit(5000.00);
        assertEquals(5000.00, individual1.getWithdraw_limit(), 0);

        Individual i = new Individual();
        String individual2 = "Individual{withdraw_limit=0.0,Customer{c_id=0, c_name=null, c_phone=0, c_email=null, accountsList=null}}";
        assertEquals(individual2, i.toString());

    }

    @Test
    public void testTrue() {
        assertTrue(indBT.validate(5000.0, 200, "mitul", 445566332, "mitul@abc.com", new ArrayList<Accounts>()));
    }

    @Test
    public void testFalse() {
        assertTrue(!indBT.validate(5000.00, 200, "mitul", 4646664, "sfsff", new ArrayList<Accounts>()));
    }

    @Test
    public void validateReturnsFalseWhenWithdrawLimitDoesNotMatch() {

        double withdraw_limit = 15000.00;
        int c_id = 200;
        String c_name = "mitul";
        int c_phone = 445566332;
        String c_email = "mitul@abc.com";
        ArrayList<Accounts> accountsList = new ArrayList<Accounts>();

        assertFalse(ind.validate(withdraw_limit, c_id, c_name, c_phone, c_email, accountsList));

    }

    @Test
    public void validateReturnsFalseWhenIdDoesNotMatch() {

        double withdraw_limit = 5000.00;
        int c_id = 300;
        String c_name = "mitul";
        int c_phone = 445566332;
        String c_email = "mitul@abc.com";
        ArrayList<Accounts> accountsList = new ArrayList<Accounts>();

        assertFalse(ind.validate(withdraw_limit, c_id, c_name, c_phone, c_email, accountsList));

    }

    @Test
    public void validateReturnsFalseWhenNameDoesNotMatch() {

        double withdraw_limit = 5000.00;
        int c_id = 200;
        String c_name = "nil";
        int c_phone = 445566332;
        String c_email = "mitul@abc.com";
        ArrayList<Accounts> accountsList = new ArrayList<Accounts>();

        assertFalse(ind.validate(withdraw_limit, c_id, c_name, c_phone, c_email, accountsList));

    }

    @Test
    public void validateReturnsFalseWhenPhoneDoesNotMatch() {

        double withdraw_limit = 5000.00;
        int c_id = 200;
        String c_name = "mitul";
        int c_phone = 115599334;
        String c_email = "mitul@abc.com";
        ArrayList<Accounts> accountsList = new ArrayList<Accounts>();
        assertFalse(ind.validate(withdraw_limit, c_id, c_name, c_phone, c_email, accountsList));

    }

    @Test
    public void validateReturnsFalseWhenEmailDoesNotMatch() {

        double withdraw_limit = 5000.00;
        int c_id = 200;
        String c_name = "mitul";
        int c_phone = 445566332;
        String c_email = "nil@abc.com";
        ArrayList<Accounts> accountsList = new ArrayList<Accounts>();

        assertFalse(ind.validate(withdraw_limit, c_id, c_name, c_phone, c_email, accountsList));

    }

    @Test
    public void validateReturnsFalseWhenAccountsListDoesNotMatch() {

        double withdraw_limit = 5000.00;
        int c_id = 200;
        String c_name = "mitul";
        int c_phone = 445566332;
        String c_email = "mitul@abc.com";
        ArrayList<Accounts> accountsList = null;

        assertFalse(ind.validate(withdraw_limit, c_id, c_name, c_phone, c_email, accountsList));

    }

    @Test
    public void validateReturnsTrueWhenEverythingMatch() {

        double withdraw_limit = 5000.00;
        int c_id = 200;
        String c_name = "mitul";
        int c_phone = 445566332;
        String c_email = "mitul@abc.com";
        ArrayList<Accounts> accountsList = new ArrayList<Accounts>();

        assertTrue(ind.validate(withdraw_limit, c_id, c_name, c_phone, c_email, accountsList));

    }
}
