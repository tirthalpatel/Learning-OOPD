Singleton Pattern
==================

Run AppTestDrive.java and refer the corresponding code flow.

Purpose / Definition
------------------
* Ensures that only one instance of a class is allowed within a system (per JVM).
* Ensures that only one instance of a particular class is ever created. All further references to objects of singleton class refer to the same underlying instance.

Use when
--------
* Exactly one instance of a class is required.
* Controlled access to a single object is necessary.

Check list
----------
* Define a private static attribute in the "single instance" class.
* Define a public static accessor function in the class.
* Do "lazy initialization" (creation on first use) in the accessor function.
* Define all constructors to be protected or private.
* Clients may only use the accessor function to manipulate the Singleton.

Examples
--------
* [java.lang.Runtime#getRuntime()] (http://docs.oracle.com/javase/6/docs/api/java/lang/Runtime.html#getRuntime%28%29)
* [java.awt.Desktop#getDesktop()] (http://docs.oracle.com/javase/6/docs/api/java/awt/Desktop.html#getDesktop%28%29)
* Logger class, Configuration class, Accessing resources in shared mode, etc.

Hot Spot
--------
* Multithreading - A special care should be taken when singleton has to be used in a multithreading application.
* Serialization - When Singletons are implementing Serializable interface they have to implement readResolve method in order to avoid having 2 different objects.
* Classloaders - If the Singleton class is loaded by 2 different class loaders we'll have 2 different classes, one for each class loader.
* Global Access Point represented by the class name - The singleton instance is obtained using the class name. At the first view this is an easy way to access it, but it is not very flexible. If we need to replace the Sigleton class, all the references in the code should be changed accordingly.
* Eagerly create instance - If application always created an instance of the singleton or if the overhead of creation and runtime aspects of the singleton are not of concerns. Then create singleton eagerly.
