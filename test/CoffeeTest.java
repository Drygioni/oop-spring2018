/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import coffeemug.CoffeeMug;
import coffeemug.mug_creamer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jared Boese
 */
public class CoffeeTest {
    
    public CoffeeTest() {
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
    
    @Test
    public void testGetMugs()
    {
        System.out.println("getMugs");
        CoffeeMug instance = new CoffeeMug(2);
        int expResult = 2;
        int result = instance.getMugs();
        assertEquals(expResult,result);
        
    }
    
    @Test
    public void testSetCreamNone()
    {
        System.out.println("Set No Creamer");
        int mugs = 2;
        CoffeeMug unit = new CoffeeMug(mugs);
        unit.setCreamerNone();
        mug_creamer expResult = mug_creamer.NOCREAMER;
        mug_creamer Result = unit.GetMugCreamer(mugs);
        assertEquals(expResult,Result);
    }

}
