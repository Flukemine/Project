/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenprojectc;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author dawsoncamilleri
 */
public class lottoprogTest {
    
    public lottoprogTest() {
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
     * Test of user method, of class lottoprog.
     */
    @org.junit.Test
    public void testUser() {
        System.out.println("user");
        lottoprog instance = new lottoprog();
        instance.user();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playerNumbers method, of class lottoprog.
     */
    @org.junit.Test
    public void testPlayerNumbers() {
        System.out.println("playerNumbers");
        lottoprog instance = new lottoprog();
        instance.playerNumbers();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals("The test case is a prototype.", "w");
    }

    /**
     * Test of main method, of class lottoprog.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        lottoprog instance = new lottoprog();
        instance.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
