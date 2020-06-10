package nl.jssl.jsontoy.serialize.collections;

import static junit.framework.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import nl.jssl.jsontoy.serialize.SerializerCreationException;
import nl.jssl.jsontoy.serialize.Serializer;
import nl.jssl.jsontoy.serialize.SynthSerializerFactory;

import org.junit.Test;

public class MapTest {
    @Test
    public void testValue() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        String jsonString = Serializer.toJSONString(map);
        assertTrue("{\"key1\": \"value1\", \"key2\": \"value2\"}".equals(jsonString) || "{\"key2\": \"value2\", \"key1\": \"value1\"}".equals(jsonString));
    }

    @Test
    public void testPropertyValue() {
        Bean object = new Bean();
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        object.setMap(map);
        String jsonString = Serializer.toJSONString(object);
        assertTrue("{\"map\": {\"key1\": \"value1\", \"key2\": \"value2\"}}".equals(jsonString)
                || "{\"map\": {\"key2\": \"value2\", \"key1\": \"value1\"}}".equals(jsonString));
    }

    @Test
    public void pumpUpTheVolume() {
        Serializer.setInstance(new SynthSerializerFactory());
        try {
            throw new SerializerCreationException(new Exception());
        } catch (Exception e) {
        }
    }

    public class Bean {

        private Map<String, String> map;

        public Map<String, String> getMap() {
            return map;
        }

        public void setMap(Map<String, String> map) {
            this.map = map;
        }

    }

}
