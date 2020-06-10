package nl.jssl.jsontoy.serialize.primitives;

import static junit.framework.Assert.assertEquals;
import nl.jssl.jsontoy.serialize.Serializer;

import org.junit.Test;

public class FloatPropertyTest {
    @Test
    public void testPrimitive() {
        assertEquals("-55.6", Serializer.toJSONString(-55.6F));
    }

    @Test
    public void testWrapper() {
        assertEquals("55.0", Serializer.toJSONString(Float.valueOf("55.0")));
    }

    @Test
    public void testProperty() {
        Bean object = new Bean();
        object.setData(1F);
        assertEquals("{\"data\": 1.0}", Serializer.toJSONString(object));
    }

    public class Bean {
        private float data;

        public float getData() {
            return data;
        }

        public void setData(float data) {
            this.data = data;
        }

    }
}
