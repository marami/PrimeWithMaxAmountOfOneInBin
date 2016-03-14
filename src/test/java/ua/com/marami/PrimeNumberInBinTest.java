package ua.com.marami;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PrimeNumberInBinTest {

    PrimeNumberInBin pn;

    @Before
    public void setUp(){
        pn = new PrimeNumberInBin();
    }

    @Test
    public void testFindNumberWithMaxAmountOfOneInBin2(){
        assertThat(pn.findNumberWithMaxAmountOfOne(2), is(2));
        assertThat(pn.getAmountOfOne(), is(1));
    }

    @Test
    public void testFindNumberWithMaxAmountOfOneInBinLess2(){
        assertThat(pn.findNumberWithMaxAmountOfOne(1), is(0));
        assertThat(pn.getAmountOfOne(), is(0));
    }
}
