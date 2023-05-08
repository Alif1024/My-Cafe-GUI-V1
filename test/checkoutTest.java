/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.checkout;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nural
 */
public class checkoutTest {
    
    int total;
    int money;
    
    @Test
    public void checkoutMethodTest() {       
        System.out.println("Checkout Test");
        checkout instance = new checkout();
        total = 80000;
        money = 100000;
        int expResult = 20000;
        int result = instance.checkoutMethod(money, total);
        assertEquals(expResult, result, 0.0);
        
    }
    
    public checkoutTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
