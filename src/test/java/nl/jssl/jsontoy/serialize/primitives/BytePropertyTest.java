package nl.jssl.jsontoy.serialize.primitives;

import static junit.framework.Assert.assertEquals;
import nl.jssl.jsontoy.serialize.Serializer;

import org.junit.Test;

public class BytePropertyTest {
    @Test
    public void testPrimitive() {
        assertEquals("-55", Serializer.toJSONString((byte) -55));
    }

    @Test
    public void testWrapper() {
        assertEquals("55", Serializer.toJSONString((byte) 55));
    }

    @Test
    public void testProperty() {
        Bean object = new Bean();
        object.setData((byte) 1);
        assertEquals("{\"data\": 1}", Serializer.toJSONString(object));
    }

    public class Bean {
        private byte data;

        public byte getData() {
            return data;
        }

        public void setData(byte data) {
            this.data = data;
        }

    }
}
