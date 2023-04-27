package mx.edu.unistmo.informatica.twi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
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
        App instance = new App();
        int expResult = 7;
        int result = instance.numeroMayor(a, b, c);
        assertEquals(expResult, result);        
    }

    @Test
    public void testNumeroMayorCaso2() {        
        int a = 5;
        int b = 3;
        int c = 4;
        App instance = new App();
        int expResult = 5;
        int result = instance.numeroMayor(a, b, c);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testNumeroMayorCaso3() {        
        int a = 5;
        int b = 7;
        int c = 6;
        App instance = new App();
        int expResult = 7;
        int result = instance.numeroMayor(a, b, c);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testNumeroMayorCaso4() {        
        int a = 5;
        int b = 7;
        int c = 9;
        App instance = new App();
        int expResult = 9;
        int result = instance.numeroMayor(a, b, c);
        assertEquals(expResult, result);        
    }
}
