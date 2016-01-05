package nl.jssl.ss.performance;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import net.minidev.json.JSONValue;
import nl.jssl.ss.Serializer;
import nl.jssl.ss.nested.Bean1;
import nl.jssl.ss.nested.Bean2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SmartJson {
    public void jackson() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Bean1 bean1 = new Bean1();
        Bean2 bean2 = new Bean2();
        bean1.setData1(UUID.randomUUID().toString());
        bean1.setBean2(bean2);
        bean2.setData2(UUID.randomUUID().toString());

        Serializer.toJSONString(bean1);
        JSONValue.toJSONString(bean1);
        for (int c = 0; c < 200; c++) {
            System.gc();
            long t0 = System.currentTimeMillis();
            List<String> trashbin = new ArrayList<String>();
            for (int i = 0; i < 10000; i++) {
                bean1.setData1(UUID.randomUUID().toString());
                bean1.setBean2(bean2);
                bean2.setData2(UUID.randomUUID().toString());
                String valueAsString = JSONValue.toJSONString(bean1);
                trashbin.add(valueAsString);
            }
            System.out.print(System.currentTimeMillis() - t0);
            System.out.print(",");
            trashbin.clear();
            System.gc();
            long tt0 = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                bean1.setData1(UUID.randomUUID().toString());
                bean1.setBean2(bean2);
                bean2.setData2(UUID.randomUUID().toString());
                String jsonString = Serializer.toJSONString(bean1);
                // System.out.println(jsonString);
                trashbin.add(jsonString);
            }
            System.out.println(System.currentTimeMillis() - tt0);
        }

    }
}
