# Builder Pattern

To simplify complex object creation by defining a class whose purpose is to build instances of another class. The Builder produces one main product, such that there might be more than one class in the product, but there is always one main class.

## Usage / Concepts

* To handles complex constructors (i.e. to find a solution to the telescoping constructor anti-pattern) or large number of parameters. 
* Can force immutability on object, once construction is finished.
* Object creation algorithms should be decoupled from the system.
* Multiple representations of creation algorithms are required.
* Runtime control over steps of construction process is required.
* Offers a client object to construct a complex object by specifying only its type and content, being shielded from the details related to the object's representation.

## See it in Action / Sample Code Snippet

* Java StringBuilder and custom Person class - Creating immutable object using builder approach.
* Run [AppTestDrive.java](https://github.com/tirthalpatel/Learning-OOPD/blob/master/DesignPatterns/src/com/tirthal/learning/design/patterns/creational/builder/AppTestDrive.java) and refer the corresponding code flow.

## Key Design Considerations

* Flexibility over telescoping constructors.
* Static inner builder class - builds immutable object and negates the need for exposed setters.
* Private constructor of class, which is called by internal builder to provide class instance to clients.

## Hot Spots

* Builder approach essentially doubles the number of lines of code for each attribute, however, client code benefits greatly in terms of usability and readability.
* Lack of IDE support - Majority Java IDE supporting code generation for constructors and setters, however, lacking similar support for builder implementation.

## Real World Examples

* [java.util.Locale.Builder](https://docs.oracle.com/javase/7/docs/api/java/util/Locale.Builder.html)
* [java.lang.StringBuilder](https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html)
* [java.nio.ByteBuffer#put()](https://docs.oracle.com/javase/7/docs/api/java/nio/ByteBuffer.html#put(byte))
* [javax.xml.parsers.DocumentBuilder](https://docs.oracle.com/javase/7/docs/api/javax/xml/parsers/DocumentBuilder.html)
* [Lombok's Builder](https://projectlombok.org/features/Builder.html)