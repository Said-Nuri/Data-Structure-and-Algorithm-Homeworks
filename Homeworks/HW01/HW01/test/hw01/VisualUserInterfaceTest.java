/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author said
 */
public class VisualUserInterfaceTest {
    
    public VisualUserInterfaceTest() {
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
     * Test of command method, of class VisualUserInterface.
     */
    @Test
    public void testCommand() {
        System.out.println("command");
        VisualUserInterface instance = new VisualUserInterfaceImpl();
        instance.command();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class VisualUserInterfaceImpl implements VisualUserInterface {

        public void command() {
        }
    }
    
}
