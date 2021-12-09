/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import com.mycompany.vo.FullTime;
import com.mycompany.vo.PartTime;
import junit.framework.Assert;
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
public class PartTimeTest {

    PartTime pt;
    PartTime ptBT;
    PartTime parttime = new PartTime();

    public PartTimeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        pt = new PartTime(12000.00, 3, "Salman", 224 - 242 - 2424, "salman@abc.com");
        ptBT = new PartTime();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testPartTime() {
        pt.setAnnual_salary(12000.00);
        assertEquals(12000.00, pt.getAnnual_salary(), 0);

        PartTime pt1 = new PartTime();
        String pt2 = "PartTime{annual_salary=0.0,Employee{e_id=0, e_name=null, e_phone=0, email=null}}";
        assertEquals(pt2, pt1.toString());

    }

    @Test
    public void testTrue() {
        assertTrue(ptBT.validate(20000.0, 21, "salman", 112233445, "salman@xyz.com"));
    }

    @Test
    public void testFalse() {
        assertTrue(!ptBT.validate(10000.0, 25, "faisal", 123456712, "faisal@abc.com"));
    }

    @Test
    public void validateReturnsFalseWhenAnnualSalaryDoesNotMatch() {

        double annual_salary = 15000.00;
        int e_id = 21;
        String e_name = "salman";
        int e_phone = 112233445;
        String email = "salman@xyz.com";

        assertFalse(parttime.validate(annual_salary, e_id, e_name, e_phone, email));

    }

    @Test
    public void validateReturnsFalseWhenIdDoesNotMatch() {

        double annual_salary = 20000.00;
        int e_id = 31;
        String e_name = "salman";
        int e_phone = 112233445;
        String email = "salman@xyz.com";

        assertFalse(parttime.validate(annual_salary, e_id, e_name, e_phone, email));
    }

    @Test
    public void validateReturnsFalseWhenNameDoesNotMatch() {

        double annual_salary = 20000.00;
        int e_id = 21;
        String e_name = "nil";
        int e_phone = 112233445;
        String email = "salman@xyz.com";

        assertFalse(parttime.validate(annual_salary, e_id, e_name, e_phone, email));

    }

    @Test
    public void validateReturnsFalseWhenPhoneDoesNotMatch() {

        double annual_salary = 20000.00;
        int e_id = 21;
        String e_name = "salman";
        int e_phone = 112233554;
        String email = "salman@xyz.com";

        assertFalse(parttime.validate(annual_salary, e_id, e_name, e_phone, email));

    }

    @Test
    public void validateReturnsFalseWhenEmailDoesNotMatch() {

        double annual_salary = 20000.00;
        int e_id = 21;
        String e_name = "salman";
        int e_phone = 112233445;
        String email = "salman@abc.com";

        assertFalse(parttime.validate(annual_salary, e_id, e_name, e_phone, email));

    }

    @Test
    public void validateReturnsTrueWhenEverythingMatch() {

        double annual_salary = 20000.00;
        int e_id = 21;
        String e_name = "salman";
        int e_phone = 112233445;
        String email = "salman@xyz.com";

        assertTrue(parttime.validate(annual_salary, e_id, e_name, e_phone, email));

    }
}
