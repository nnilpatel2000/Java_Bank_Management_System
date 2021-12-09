/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import com.mycompany.vo.Employee;
import com.mycompany.vo.FullTime;
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
public class FullTimeTest {

    FullTime ft;
    FullTime ftBT;
    FullTime fulltime = new FullTime();

    public FullTimeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ft = new FullTime(42000.00, 12, "Tom", 322 - 223 - 2332, "tom@abc.com");
        ftBT = new FullTime();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testFullTime() {
        ft.setAnnual_salary(42000.00);
        assertEquals(42000.00, ft.getAnnual_salary(), 0);

        FullTime ft1 = new FullTime();
        String ft2 = "FullTime{annual_salary=0.0,Employee{e_id=0, e_name=null, e_phone=0, email=null}}";
        assertEquals(ft2, ft1.toString());

    }

    @Test
    public void testTrue() {
        assertTrue(ftBT.validate(100000.0, 1, "faisal", 123456789, "faisal@abc.com"));
    }

    @Test
    public void testFalse() {
        assertTrue(!ftBT.validate(10000.0, 25, "faisal", 123456712, "faisal@abc.com"));
    }

    @Test
    public void validateReturnsFalseWhenAnnualSalaryDoesNotMatch() {

        double annual_salary = 100099.00;
        int e_id = 1;
        String e_name = "faisal";
        int e_phone = 123456789;
        String email = "faisal@abc.com";

        assertFalse(fulltime.validate(annual_salary, e_id, e_name, e_phone, email));

    }

    @Test
    public void validateReturnsFalseWhenIdDoesNotMatch() {

        double annual_salary = 100000.00;
        int e_id = 25;
        String e_name = "faisal";
        int e_phone = 123456789;
        String email = "faisal@abc.com";

        assertFalse(fulltime.validate(annual_salary, e_id, e_name, e_phone, email));
    }

    @Test
    public void validateReturnsFalseWhenNameDoesNotMatch() {

        double annual_salary = 100000.00;
        int e_id = 1;
        String e_name = "mitul";
        int e_phone = 123456789;
        String email = "faisal@abc.com";

        assertFalse(fulltime.validate(annual_salary, e_id, e_name, e_phone, email));

    }

    @Test
    public void validateReturnsFalseWhenPhoneDoesNotMatch() {

        double annual_salary = 100000.00;
        int e_id = 1;
        String e_name = "faisal";
        int e_phone = 123456712;
        String email = "faisal@abc.com";

        assertFalse(fulltime.validate(annual_salary, e_id, e_name, e_phone, email));

    }

    @Test
    public void validateReturnsFalseWhenEmailDoesNotMatch() {

        double annual_salary = 100000.00;
        int e_id = 1;
        String e_name = "faisal";
        int e_phone = 123456789;
        String email = "mitul@abc.com";

        assertFalse(fulltime.validate(annual_salary, e_id, e_name, e_phone, email));

    }

    @Test
    public void validateReturnsTrueWhenEverythingMatch() {

        double annual_salary = 100000.00;
        int e_id = 1;
        String e_name = "faisal";
        int e_phone = 123456789;
        String email = "faisal@abc.com";

        assertTrue(fulltime.validate(annual_salary, e_id, e_name, e_phone, email));

    }
}
