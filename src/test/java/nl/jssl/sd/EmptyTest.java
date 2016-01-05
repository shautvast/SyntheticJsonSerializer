package nl.jssl.sd;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class EmptyTest {
    @Test
    public void null_shouldReturnEmpty() {
        assertEquals(null, Deserializer.deserialize("{}"));
    }
}
