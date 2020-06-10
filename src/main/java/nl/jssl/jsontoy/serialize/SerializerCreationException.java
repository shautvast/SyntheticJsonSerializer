package nl.jssl.jsontoy.serialize;

@SuppressWarnings("serial")
public class SerializerCreationException extends RuntimeException {

    public SerializerCreationException(Throwable t) {
        super(t);
    }

}
