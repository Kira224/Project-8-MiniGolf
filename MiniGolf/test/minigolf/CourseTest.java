/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minigolf;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kira
 */
public class CourseTest {
    
    public CourseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Course.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String courseName = "";
        String expResult = "";
        String result = Course.getName(courseName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberofHoles method, of class Course.
     */
    @Test
    public void testGetNumberofHoles() {
        System.out.println("getNumberofHoles");
        int expResult = 0;
        int result = Course.getNumberofHoles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parForHole method, of class Course.
     */
    @Test
    public void testParForHole() {
        System.out.println("parForHole");
        int hole = 0;
        int expResult = 0;
        int result = Course.parForHole(hole);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
