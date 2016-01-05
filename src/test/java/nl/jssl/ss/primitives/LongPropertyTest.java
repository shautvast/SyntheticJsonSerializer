package nl.jssl.ss.primitives;

import static junit.framework.Assert.assertEquals;
import nl.jssl.ss.Serializer;

import org.junit.Test;

public class LongPropertyTest {
    @Test
    public void testPrimitive() {
        assertEquals("-55", Serializer.toJSONString(-55L));
    }

    @Test
    public void testWrapper() {
        assertEquals("55", Serializer.toJSONString(Long.valueOf("55")));
    }

    @Test
    public void testProperty() {
        Bean object = new Bean();
        object.setData(1L);
        assertEquals("{\"data\": 1}", Serializer.toJSONString(object));
    }

    public class Bean {
        private long data;

        public long getData() {
            return data;
        }

        public void setData(long data) {
            this.data = data;
        }

    }
}
