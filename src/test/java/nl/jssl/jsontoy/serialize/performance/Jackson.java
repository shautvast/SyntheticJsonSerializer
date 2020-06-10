package nl.jssl.jsontoy.serialize.performance;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import nl.jssl.jsontoy.serialize.Serializer;
import nl.jssl.jsontoy.serialize.nested.Bean1;
import nl.jssl.jsontoy.serialize.nested.Bean2;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jackson {
    List<String> trashbin = new ArrayList<String>();

    @Test
    public void jackson() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Bean1 bean1 = new Bean1();
        Bean2 bean2 = new Bean2();
        bean1.setData1(UUID.randomUUID().toString());
        bean1.setBean2(bean2);
        bean2.setData2(UUID.randomUUID().toString());
        String valueAsString = objectMapper.writeValueAsString(bean1);
        String jsonString = Serializer.toJSONString(bean1);

        for (int c = 0; c < 20; c++) {
            trashbin.clear();
            System.gc();
            long t0 = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                bean1 = new Bean1();
                bean2 = new Bean2();
                bean1.setData1(UUID.randomUUID().toString());
                bean1.setBean2(bean2);
                bean2.setData2(UUID.randomUUID().toString());
                valueAsString = objectMapper.writeValueAsString(bean1);
                // System.out.println(valueAsString);
                trashbin.add(valueAsString);
            }
            System.out.print(System.currentTimeMillis() - t0);
            System.out.print(",");
            trashbin.clear();
            System.gc();
            long tt0 = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                bean1 = new Bean1();
                bean2 = new Bean2();
                bean1.setData1(UUID.randomUUID().toString());
                bean1.setBean2(bean2);
                bean2.setData2(UUID.randomUUID().toString());
                jsonString = Serializer.toJSONString(bean1);
                // System.out.println(jsonString);
                trashbin.add(jsonString);
            }
            System.out.println(System.currentTimeMillis() - tt0);
        }

    }
}
