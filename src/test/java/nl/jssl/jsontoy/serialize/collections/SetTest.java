package nl.jssl.jsontoy.serialize.collections;

import static junit.framework.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import nl.jssl.jsontoy.serialize.Serializer;

import org.junit.Test;

public class SetTest {
    @Test
    public void testValue() {
        Set<String> list = new HashSet<String>();
        list.add("value1");
        list.add("value2");
        String jsonString = Serializer.toJSONString(list);
        assertTrue("[\"value2\", \"value1\"]".equals(jsonString) || "[\"value1\", \"value2\"]".equals(jsonString));
    }

    @Test
    public void testPropertyValue() {
        Bean object = new Bean();
        object.setSet(new HashSet<String>(Arrays.asList("value1", "value2")));
        String jsonString = Serializer.toJSONString(object);
        assertTrue("{\"set\": [\"value2\", \"value1\"]}".equals(jsonString) || "{\"set\": [\"value1\", \"value2\"]}".equals(jsonString));
    }

    public class Bean {
        private Set<String> set;

        public Set<String> getSet() {
            return set;
        }

        public void setSet(Set<String> set) {
            this.set = set;
        }
    }

}
