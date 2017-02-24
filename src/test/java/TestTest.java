import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by Kaj Suiker on 24-2-2017.
 */
public class TestTest {
    @org.junit.Test
    public void tests() throws Exception {
        Test t = new Test("sda");
        Assert.assertEquals("TEST","ss", t.Tests());
        String aa="dsda";
    }

}