package ua.com.marami;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class MyNumberTest {

    @Test
    public void testIsPrimeNegativeIsFasle(){
        assertFalse(MyNumber.isPrime(-1));
    }

    @Test
    public void testIsPrime0IsFasle(){
        assertFalse(MyNumber.isPrime(0));
    }

    @Test
    public void testIsPrime1IsFasle(){
        assertFalse(MyNumber.isPrime(1));
    }

    @Test
    public void testIsPrime2IsTrue(){
        assertTrue(MyNumber.isPrime(2));
    }

    @Test
    public void testIsPrime3IsTrue(){
        assertTrue(MyNumber.isPrime(3));
    }

    @Test
    public void testIsPrime61IsTrue(){
        assertTrue(MyNumber.isPrime(61));
    }

    @Test
    public void testIsPrime131IsTrue(){
        assertTrue(MyNumber.isPrime(131));
    }

    @Test
    public void testIsPrime133IsFalse(){
        assertFalse(MyNumber.isPrime(133));
    }

    @Test
    public void testFindAmountOfOne333(){
        assertThat(MyNumber.findAmountOfOneInBin(333), is(5));
    }

    @Test
    public void testFindAmountOfOne1023(){
        assertThat(MyNumber.findAmountOfOneInBin(1023), is(10));
    }

    @Test
    public void testFindAmountOfOne2048(){
        assertThat(MyNumber.findAmountOfOneInBin(2048), is(1));
    }
}
