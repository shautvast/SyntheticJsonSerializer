package nl.jssl.ss.primitives;

import static junit.framework.Assert.assertEquals;
import nl.jssl.ss.Serializer;

import org.junit.Test;

public class DoublePropertyTest {
    @Test
    public void testPrimitive() {
        assertEquals("-55.6", Serializer.toJSONString(-55.6D));
    }

    @Test
    public void testWrapper() {
        assertEquals("55.0", Serializer.toJSONString(Double.valueOf("55.0")));
    }

    @Test
    public void testProperty() {
        Bean object = new Bean();
        object.setData(326.2D);
        assertEquals("{\"data\": 326.2}", Serializer.toJSONString(object));
    }

    public class Bean {
        private double data;

        public double getData() {
            return data;
        }

        public void setData(double data) {
            this.data = data;
        }

    }
}
