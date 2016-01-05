package nl.jssl.ss.collections;

import static junit.framework.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import nl.jssl.ss.Serializer;

import org.junit.Test;

public class ListTest {
    @Test
    public void testValue() {
        List<String> list = new ArrayList();
        list.add("value1");
        list.add("value2");
        assertEquals("[\"value1\", \"value2\"]", Serializer.toJSONString(list));
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
