package mx.edu.unistmo.informatica.twi.p1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class QuickStartTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testNumeroMayorCaso1() {        
        int a = 5;
        int b = 3;
        int c = 7;
        QuickStart instance = new QuickStart();
        int expResult = 7;
        int result = instance.numeroMayor(a, b, c);
        assertEquals(expResult, result);        
    }

    @Test
    public void testNumeroMayorCaso2() {        
        int a = 5;
        int b = 3;
        int c = 4;
        QuickStart instance = new QuickStart();
        int expResult = 5;
        int result = instance.numeroMayor(a, b, c);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testNumeroMayorCaso3() {        
        int a = 5;
        int b = 7;
        int c = 6;
        QuickStart instance = new QuickStart();
        int expResult = 7;
        int result = instance.numeroMayor(a, b, c);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testNumeroMayorCaso4() {        
        int a = 5;
        int b = 7;
        int c = 9;
        QuickStart instance = new QuickStart();
        int expResult = 9;
        int result = instance.numeroMayor(a, b, c);
        assertEquals(expResult, result);        
    }
}
