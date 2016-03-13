package ua.com.marami;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PrimeNumberTest {

    @Test
    public void testIsPrime0IsFasle(){
        assertFalse(PrimeNumber.isPrime(0));
    }

    @Test
    public void testIsPrime1IsFasle(){
        assertFalse(PrimeNumber.isPrime(1));
    }

    @Test
    public void testIsPrime2IsTrue(){
        assertTrue(PrimeNumber.isPrime(2));
    }

    @Test
    public void testIsPrime3IsTrue(){
        assertTrue(PrimeNumber.isPrime(3));
    }

    @Test
    public void testIsPrime61IsTrue(){
        assertTrue(PrimeNumber.isPrime(61));
    }

    @Test
    public void testIsPrime131IsTrue(){
        assertTrue(PrimeNumber.isPrime(131));
    }

    @Test
    public void testIsPrime133IsFalse(){
        assertFalse(PrimeNumber.isPrime(133));
    }

}
