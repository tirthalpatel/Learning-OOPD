# Strategy Pattern

## Purpose / Definition

* Defines a set of encapsulated algorithms that can be swapped to carry out a specific behavior.
* Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

## See it in Action / Sample Code Snippet

* Modes of payment is an example of a Strategy - several payment options exist such as payment by cash, credit card, net-banking, etc; and a client can use any of these modes of payment interchangeably.
* Run [AppTestDrive.java](https://github.com/tirthalpatel/Learning-OOPD/blob/master/DesignPatterns/src/com/tirthal/learning/design/patterns/behavioral/strategy/AppTestDrive.java) and refer the corresponding code flow.
	* PaymentStrategy.java - the interface of an interchangeable family of algorithms (what is interchangeable behavior of payment strategy?)
	* PayByCash.java, PayByCreditCard.java, PayByPaypal.java - the derived classes hiding the implementation details of PaymentStrategy.java 
	* Merchant.java, MakeMyTrip.java, Myntra.java - clients makes use of an encapsulated family of algorithms for payment

## Use when

* The only difference between many related classes is their behavior.
* Multiple versions or variations of an algorithm are required.
* Algorithms access or utilize data that calling code shouldn't be exposed to.
* The behavior of a class should be defined at runtime.
* Conditional statements are complex and hard to maintain.

## Important Points

* Identify an algorithm (i.e. a behavior) that the client would prefer to access through a "flex point".
* Specify the signature for that algorithm in an interface.
* Hide the alternative implementation details in derived classes.
* Clients of the algorithm couple themselves to the interface.

## Hot Spot

* The strategy design pattern splits the behavior (there are many behaviors) of a class from the class itself. This has some advantages, but the main draw back is that a client must understand how the Strategies differ. Since clients get exposed to implementation issues the strategy design pattern should be used only when the variation in behavior is relevant to them.

## Real World Examples

* [java.util.Comparator#compare()](http://docs.oracle.com/javase/7/docs/api/java/util/Comparator.html#compare(T,%20T)) - a Collections.sort() method that takes Comparator parameter to decide sorting strategy, so based on the different implementations of Comparator interface, the objects are sorted in different ways.
* [javax.servlet.http.HttpServlet](http://docs.oracle.com/javaee/6/api/javax/servlet/http/HttpServlet.html) - the service() and all doXXX() methods take HttpServletRequest and HttpServletResponse and the implementor has to process them without getting hold of them as instance variables.
