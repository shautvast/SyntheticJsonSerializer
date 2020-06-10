package nl.jssl.jsontoy.serialize;

public interface SerializerFactory {
    public <T> JSONSerializer<T> createSerializer(Class<T> beanjavaClass);
}
