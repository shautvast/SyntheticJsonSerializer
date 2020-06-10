package nl.jssl.jsontoy.deserialize;

public class Deserializer {

    private int position;
    private final String jsonString;

    private Deserializer( String jsonString,int position) {
        this.position = position;
        this.jsonString = jsonString;
    }




}
