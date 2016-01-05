package nl.jssl.sd;

public class Deserializer {

    public static Object deserialize(String json) {
        if (json.equals("{}")) {
            return null;
        } else
            return 1;
    }

}
