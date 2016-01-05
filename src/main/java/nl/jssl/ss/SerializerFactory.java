package nl.jssl.ss;

public interface SerializerFactory {
    public <T> JSONSerializer<T> createSerializer(Class<T> beanjavaClass);
}
