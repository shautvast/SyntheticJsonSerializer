package nl.jssl.sd;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class IntegerTest {

    @Test
    public void testPrimitive() {
        assertEquals(1, Deserializer.deserialize("1"));
    }
}
