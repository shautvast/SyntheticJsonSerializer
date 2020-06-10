package nl.jssl.jsontoy.serialize.primitives;

import static junit.framework.Assert.assertEquals;
import nl.jssl.jsontoy.serialize.Serializer;

import org.junit.Test;

public class IntPropertyTest {

    @Test
    public void testPrimitive() {
        assertEquals("-55", Serializer.toJSONString(-55));
    }

    @Test
    public void testWrapper() {
        assertEquals("55", Serializer.toJSONString(Integer.valueOf("55")));
    }

    @Test
    public void testPropertyValue() {
        Bean object = new Bean();
        object.setData(1);
        assertEquals("{\"data\": 1}", Serializer.toJSONString(object));
    }

    public class Bean {
        private int data;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

    }
}
