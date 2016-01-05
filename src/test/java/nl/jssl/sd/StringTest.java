package nl.jssl.sd;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class StringTest {
    @Test
    public void shouldReturnStringvalue() {
        assertEquals("test", Deserializer.deserialize("\"test\""));
    }
}
