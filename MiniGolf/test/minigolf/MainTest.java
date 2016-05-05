/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minigolf;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kira
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newRound method, of class Main.
     */
    @Test
    public void testNewRound() {
        System.out.println("newRound");
        String courseName = "";
        String playerName = "";
        Round expResult = null;
        Round result = Main.newRound(courseName, playerName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRound method, of class Main.
     */
    @Test
    public void testGetRound() {
        System.out.println("getRound");
        String player = "";
        String coursename = "";
        Round expResult = null;
        Round result = Main.getRound(player, coursename);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourse method, of class Main.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        String courseName = "";
        Course expResult = null;
        Course result = Main.getCourse(courseName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of scoreSoFar method, of class Main.
     */
    @Test
    public void testScoreSoFar() {
        System.out.println("scoreSoFar");
        String courseName = "";
        String playerName = "";
        int expResult = 0;
        int result = Main.scoreSoFar(courseName, playerName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enterStrokes method, of class Main.
     */
    @Test
    public void testEnterStrokes() {
        System.out.println("enterStrokes");
        String courseName = "";
        String playerName = "";
        int strokes = 0;
        Main instance = new Main();
        instance.enterStrokes(courseName, playerName, strokes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
