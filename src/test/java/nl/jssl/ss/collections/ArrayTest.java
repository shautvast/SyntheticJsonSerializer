package nl.jssl.ss.collections;

import static junit.framework.Assert.assertEquals;
import nl.jssl.ss.Serializer;

import org.junit.Test;

public class ArrayTest {
    @Test
    public void testValue() {
        assertEquals("[\"value1\", \"value2\"]", Serializer.toJSONString(new String[] { "value1", "value2" }));
    }

    @Test
    public void testPropertyValue() {
        Bean object = new Bean();
        object.setArray(new String[] { "value1", "value2" });
        assertEquals("{\"array\": [\"value1\", \"value2\"]}", Serializer.toJSONString(object));
    }

    public class Bean {
        private String[] array;

        public String[] getArray() {
            return array;
        }

        public void setArray(String[] array) {
            this.array = array;
        }

    }

}
