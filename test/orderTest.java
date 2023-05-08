/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.order;
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
public class orderTest {
    
    int harga;
    int qty;
    
    @Test
    public void orderMethodTest() {
        
        System.out.println("Order Test");
        order instance = new order();
        harga = 40000;
        qty = 2;
        int expResult = 80000;
        int result = instance.orderMenu(harga, qty);
        assertEquals(expResult, result, 0.0);
        
    }
    
    public orderTest() {
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
