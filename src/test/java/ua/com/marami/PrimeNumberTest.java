package ua.com.marami;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberTest {

    @Test
    public void testIsPrimeNegativeIsFasle(){
        assertFalse(PrimeNumber.isPrime(-1));
    }

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

    @Test
    public void testFindMaxPrimeNegativeisNull(){
        assertNull(PrimeNumber.findMaxPrime(-1));
    }

    @Test
    public void testFindMaxPrime0isNull(){
        assertNull(PrimeNumber.findMaxPrime(0));
    }

    @Test
    public void testFindMaxPrime1isNull(){
        assertNull(PrimeNumber.findMaxPrime(1));
    }

    @Test
    public void testFindMaxPrime2is2(){
        assertThat(PrimeNumber.findMaxPrime(2), is(2));
    }

    @Test
    public void testFindMaxPrime131is131(){
        assertThat(PrimeNumber.findMaxPrime(131), is(131));
    }

    @Test
    public void testFindMaxPrime133is131(){
        assertThat(PrimeNumber.findMaxPrime(133), is(131));
    }

}
