package nl.jssl.jsontoy.serialize.primitives;

import static junit.framework.Assert.assertEquals;
import nl.jssl.jsontoy.serialize.Serializer;

import org.junit.Test;

public class NullPropertyTest {

    @Test
    public void testPrimitive() {
        assertEquals("null", Serializer.toJSONString(null));
    }

    @Test
    public void testProperty() {
        Bean object = new Bean();
        assertEquals("{\"data\": null}", Serializer.toJSONString(object));
    }

    public class Bean {
        private String data;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

    }
}
