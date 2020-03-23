//TODO
// Test for Type that have key but no Value
// Test for Exceptions
// Test for sample Pattern and Matcher

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestJerksonDataParser {

    String jerksonDataText;
    JerksonDataParser jerksonDataParser;

    @Before
    public void setUp() {
        this.jerksonDataParser = new JerksonDataParser();
        this.jerksonDataText = jerksonDataParser.getRawData();
    }

    @Test
    public void changeApples() {
        String expected = jerksonDataText;
        String actual = jerksonDataParser.getRawData();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeMilk() {
        String expected = jerksonDataText;
        String actual = jerksonDataParser.getRawData();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeBread() {
        String expected = jerksonDataText;
        String actual = jerksonDataParser.getRawData();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeCookies() {
        String expected = jerksonDataText;
        String actual = jerksonDataParser.getRawData();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeName() {
        String expected = jerksonDataText;
        String actual = jerksonDataParser.getRawData();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changePrice() {
        String expected = jerksonDataText;
        String actual = jerksonDataParser.getRawData();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeType() {
        String expected = jerksonDataText;
        String actual = jerksonDataParser.getRawData();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeExpiration() {
        String expected = jerksonDataText;
        String actual = jerksonDataParser.getRawData();
        Assert.assertEquals(expected, actual);
    }
}
