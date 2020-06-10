package nl.jssl.jsontoy.deserialize;

public class Deserializer {

    public static Object deserialize(String json) {
        if (json.equals("{}")) {
            return null;
        } else
            return "test";
    }

}
