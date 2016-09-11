# Singleton Pattern

To ensure that only one object of a particular class is ever created. All further references to objects of the singleton class refer to the same underlying instance.

## Usage / Concepts

* Exactly one instance of a class is required within a system (per JVM) for providing a global (or controlled) access point to the single object.
* Not necessarily, but usually lazy loaded.

## See it in Action / Sample Code Snippet

* Singleton instance of Java Runtime and custom Logger classes.
* Run [AppTestDrive.java](https://github.com/tirthalpatel/Learning-OOPD/blob/master/DesignPatterns/src/com/tirthal/learning/design/patterns/creational/singleton/AppTestDrive.java) and refer the corresponding code flow.
	* Option 1 - eager instantiation
	* Option 2 - lazy instantiation using double locking mechanism
	* Option 3 - simplify singleton implementation using inner class
	* Option 4 - singleton implementation using Java 5 enum

## Key Design Considerations

* Class is responsible for lifecycle of object creation.
* Static in nature and needs to be thread safe.
* Define a private static attribute in the "single instance" class.
* Define a public static accessor function in the class. Do "lazy initialization" (creation on first use) in the accessor function.
* Define private constructor and no parameters required for construction.
* Clients may only use the accessor function to manipulate the Singleton.

## Hot Spots

* Multithreading - A special care should be taken when singleton has to be used in a multithreading application.
* Serialization - When Singletons are implementing Serializable interface they have to implement readResolve method in order to avoid having 2 different objects.
* Classloaders - If the Singleton class is loaded by two different class loaders we'll have two different classes, one for each class loader.
* Global Access Point represented by the class name - The singleton instance is obtained using the class name. At the first view this is an easy way to access it, but it is not very flexible. If we need to replace the Singleton class, all the references in the code should be changed accordingly.
* Eagerly create instance - If application always created an instance of the singleton or if the overhead of creation and runtime aspects of the singleton are not of concerns. Then create singleton eagerly.

## Real World Examples

* [java.lang.Runtime#getRuntime()](https://docs.oracle.com/javase/8/docs/api/java/lang/Runtime.html#getRuntime--)
* [java.awt.Desktop#getDesktop()](https://docs.oracle.com/javase/8/docs/api/java/awt/Desktop.html#getDesktop--)
* Spring Beans, Graphic Managers, Configuration class, Accessing resources in shared mode, Database connection pool, etc.