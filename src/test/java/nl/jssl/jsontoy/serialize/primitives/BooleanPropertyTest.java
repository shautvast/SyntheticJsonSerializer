package nl.jssl.jsontoy.serialize.primitives;

import static junit.framework.Assert.assertEquals;
import nl.jssl.jsontoy.serialize.Serializer;

import org.junit.Test;

public class BooleanPropertyTest {

    @Test
    public void testPrimitive() {
        assertEquals("false", Serializer.toJSONString(false));
    }

    @Test
    public void testWrapper() {
        assertEquals("false", Serializer.toJSONString(Boolean.FALSE));
    }

    @Test
    public void testProperty() {
        Bean object = new Bean();
        object.setData(true);
        assertEquals("{\"data\": true}", Serializer.toJSONString(object));
    }

    public class Bean {
        private boolean data;

        public boolean getData() {
            return data;
        }

        public void setData(boolean data) {
            this.data = data;
        }

    }
}
