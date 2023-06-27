package creational.singleton.enuminstance;

//Enum works only Java-1.5 & after version
//INSTANCE. This value represents the singleton instance.
//Enum values are created only once by the JVM, ensuring that INSTANCE is a singleton.

//Pros : Enum classes are inherently thread-safe and provide a concise and reliable way to create singletons
// built-in serialization and protection against reflection-based attacks.
public enum Singleton {

    INSTANCE;  //will already have private constructor

}
