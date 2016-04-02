package ua.com.marami;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class ConsoleScannerTest {

    private BufferedReader bufferedReader = org.mockito.Mockito.mock(BufferedReader.class);

    @Mock
    private PrintStream printStream;

    @InjectMocks
    private ConsoleScanner consoleScanner = new ConsoleScanner();

    @Before
    public void setUp() {
        System.setOut(printStream);
    }

    @After
    public void cleanUp() {
        System.setOut(null);
    }

    @Test
    public void testGetIntEnteredCorrectNumber() throws IOException {
        when(bufferedReader.readLine()).thenReturn("2");
        assertThat(consoleScanner.getInt(2, 5), is(2));
    }

    @Test
    public void testGetIntEnteredOutOfScopePositiveNumberThenCorrect() throws IOException {
        when(bufferedReader.readLine()).thenReturn("10").thenReturn("1");
        assertThat(consoleScanner.getInt(0, 3), is(1));
        verify(printStream).println(contains("You should type a number FROM 0 TO 3"));
    }

    @Test
    public void testGetIntEnteredCorrectNegativeNumber() throws IOException {
        when(bufferedReader.readLine()).thenReturn("-1");
        assertThat(consoleScanner.getInt(-2, 3), is(-1));
    }

    @Test
    public void testGetIntEnteredOutOfScopeNegativeNumberThenCorrect() throws IOException {
        when(bufferedReader.readLine()).thenReturn("-10").thenReturn("1");
        assertThat(consoleScanner.getInt(-2, 3), is(1));
        verify(printStream).println(contains("You should type a number FROM -2 TO 3"));
    }

    @Test
    public void testGetIntEnteredMoreThanIntegerMaxValueThenCorrect() throws IOException {
        when(bufferedReader.readLine()).thenReturn("100000000000").thenReturn("1");
        assertThat(consoleScanner.getInt(0, 3), is(1));
        verify(printStream).println(contains("You should type a number from 0 to 3"));
    }

    @Test
    public void testGetIntEnteredLessThanIntegerMinValueThenCorrect() throws IOException {
        when(bufferedReader.readLine()).thenReturn("-100000000000").thenReturn("1");
        assertThat(consoleScanner.getInt(0, 3), is(1));
        verify(printStream).println(contains("You should type a number from 0 to 3"));
    }

    @Test
    public void testGetIntEnteredNotNumberThenCorrect() throws IOException {
        when(bufferedReader.readLine()).thenReturn("ssssss").thenReturn("0");
        assertThat(consoleScanner.getInt(0, 3), is(0));
        verify(printStream).println(contains("You should type a number from 0 to 3"));
    }

    @Test
    public void testGetIntSingleEnteredCorrectNumber() throws IOException {
        when(bufferedReader.readLine()).thenReturn("33");
        assertThat(consoleScanner.getInt(2), is(33));
    }

    @Test
    public void testGetIntSingleEnteredCorrectNegativeNumber() throws IOException {
        when(bufferedReader.readLine()).thenReturn("-1");
        assertThat(consoleScanner.getInt(-2), is(-1));
    }

    @Test
    public void testGetIntSingleEnteredOutOfScopeNegativeNumberThenCorrect() throws IOException {
        when(bufferedReader.readLine()).thenReturn("-10").thenReturn("1");
        assertThat(consoleScanner.getInt(-2), is(1));
        verify(printStream).println(contains("You should type a number FROM -2 TO 2147483647"));
    }

    @Test
    public void testGetIntSingleEnteredMoreThanIntegerMaxValueThenCorrect() throws IOException {
        when(bufferedReader.readLine()).thenReturn("100000000000").thenReturn("1");
        assertThat(consoleScanner.getInt(0), is(1));
        verify(printStream).println(contains("You should type a number from 0 to 2147483647"));
    }

    @Test
    public void testGetIntSingleEnteredLessThanIntegerMinValueThenCorrect() throws IOException {
        when(bufferedReader.readLine()).thenReturn("-100000000000").thenReturn("1");
        assertThat(consoleScanner.getInt(0), is(1));
        verify(printStream).println(contains("You should type a number from 0 to 2147483647"));
    }

    @Test
    public void testGetIntSingleEnteredNotNumberThenCorrect() throws IOException {
        when(bufferedReader.readLine()).thenReturn("ssssss").thenReturn("2");
        assertThat(consoleScanner.getInt(0), is(2));
        verify(printStream).println(contains("You should type a number from 0 to 2147483647"));
    }

    @Test
    public void testClose() throws IOException {
        consoleScanner.close();
        verify(bufferedReader).close();
    }
}
