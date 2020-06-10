package nl.jssl.jsontoy.serialize.primitives;

import static junit.framework.Assert.assertEquals;
import nl.jssl.jsontoy.serialize.Serializer;

import org.junit.Test;

public class CharPropertyTest {
    @Test
    public void testPrimitive() {
        assertEquals("\"d\"", Serializer.toJSONString('d'));
    }

    @Test
    public void testWrapper() {
        assertEquals("\"s\"", Serializer.toJSONString('s'));
    }

    @Test
    public void testProperty() {
        Bean object = new Bean();
        object.setData('a');
        assertEquals("{\"data\": \"a\"}", Serializer.toJSONString(object));
    }

    public class Bean {
        private char data;

        public char getData() {
            return data;
        }

        public void setData(char data) {
            this.data = data;
        }

    }
}
