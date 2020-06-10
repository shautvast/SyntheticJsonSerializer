package nl.jssl.jsontoy.serialize.primitives;

import static junit.framework.Assert.assertEquals;
import nl.jssl.jsontoy.serialize.Serializer;

import org.junit.Test;

public class ShortPropertyTest {
    @Test
    public void testPrimitive() {
        assertEquals("-55", Serializer.toJSONString((short) -55));
    }

    @Test
    public void testWrapper() {
        assertEquals("5", Serializer.toJSONString(Short.valueOf("5")));
    }

    @Test
    public void testProperty() {
        Bean object = new Bean();
        object.setData((short) 3);
        assertEquals("{\"data\": 3}", Serializer.toJSONString(object));
    }

    public class Bean {
        private short data;

        public short getData() {
            return data;
        }

        public void setData(short data) {
            this.data = data;
        }

    }
}
