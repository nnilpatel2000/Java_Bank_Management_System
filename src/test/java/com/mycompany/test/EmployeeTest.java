/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import com.mycompany.vo.Employee;
import com.mycompany.vo.FullTime;
import com.mycompany.vo.PartTime;
import java.util.ArrayList;
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
public class EmployeeTest {

    Employee emp1;
    Employee emp2;
    Employee emp3;
    Employee emp4;
    Employee empb;
    Employee employee = new Employee();

    public EmployeeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        emp1 = new PartTime(16000.00, 1, "Nil", 224 - 225 - 2626, "nil@abc.com");
        emp2 = new PartTime(15000.00, 2, "Faisal", 312 - 321 - 3121, "faisal@xyz.com");
        emp3 = new FullTime(35000.00, 11, "Mitul", 847 - 748 - 4847, "mitul@xyz.com");
        emp4 = new Employee();
        empb = new Employee();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testName() {

        assertEquals("Nil", emp1.getE_name());
        assertEquals("Mitul", emp3.getE_name());
        assertEquals("Faisal", emp2.getE_name());

        assertEquals(1, emp1.getE_id());
        assertEquals(11, emp3.getE_id());
        assertEquals(2, emp2.getE_id());

        assertEquals(224 - 225 - 2626, emp1.getE_phone());
        assertEquals(847 - 748 - 4847, emp3.getE_phone());
        assertEquals(312 - 321 - 3121, emp2.getE_phone());

        assertEquals("nil@abc.com", emp1.getEmail());
        assertEquals("mitul@xyz.com", emp3.getEmail());
        assertEquals("faisal@xyz.com", emp2.getEmail());

        assertEquals(16000.00, ((PartTime) emp1).getAnnual_salary(), 0);
        assertEquals(15000.00, ((PartTime) emp2).getAnnual_salary(), 0);
        assertEquals(35000.00, ((FullTime) emp3).getAnnual_salary(), 0);

        emp4.setE_id(4);
        assertEquals(4, emp4.getE_id());

        emp4.setE_name("Salman");
        assertEquals("Salman", emp4.getE_name());

        emp4.setE_phone(224 - 242 - 2424);
        assertEquals(224 - 242 - 2424, emp4.getE_phone());

        emp4.setEmail("salman@abc.com");
        assertEquals("salman@abc.com", emp4.getEmail());

        Employee e = new Employee();
        String emp5 = "Employee{e_id=0, e_name=null, e_phone=0, email=null}";
        assertEquals(emp5, e.toString());

    }

    @Test
    public void testTrue() {
        assertTrue(empb.validate(10, "nil", 123456789, "abc@abc.com"));
    }

    @Test
    public void testFalse() {
        assertTrue(!empb.validate(12, "mitul", 4646664, "sfsff"));
    }

    @Test
    public void validateReturnsFalseWhenIdDoesNotMatch() {

        int e_id = 11;
        String e_name = "nil";
        int e_phone = 123456789;
        String email = "abc@abc.com";

        assertFalse(employee.validate(e_id, e_name, e_phone, email));

    }

    @Test
    public void validateReturnsFalseWhenNameDoesNotMatch() {

        int e_id = 10;
        String e_name = "mitul";
        int e_phone = 123456789;
        String email = "abc@abc.com";

        assertFalse(employee.validate(e_id, e_name, e_phone, email));

    }

    @Test
    public void validateReturnsFalseWhenPhoneDoesNotMatch() {

        int e_id = 10;
        String e_name = "nil";
        int e_phone = 177456789;
        String email = "abc@abc.com";

        assertFalse(employee.validate(e_id, e_name, e_phone, email));

    }

    @Test
    public void validateReturnsFalseWhenEmailDoesNotMatch() {

        int e_id = 10;
        String e_name = "nil";
        int e_phone = 123456789;
        String email = "xyz@xyz.com";

        assertFalse(employee.validate(e_id, e_name, e_phone, email));

    }

    @Test
    public void validateReturnsTrueWhenEverythingMatch() {

        int e_id = 10;
        String e_name = "nil";
        int e_phone = 123456789;
        String email = "abc@abc.com";

        assertTrue(employee.validate(e_id, e_name, e_phone, email));

    }

}
