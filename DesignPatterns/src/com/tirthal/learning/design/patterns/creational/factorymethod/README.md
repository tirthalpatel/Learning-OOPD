# Factory Method Pattern

To replace class constructors and abstract the process of object generation so that the type of the object instantiated can be determined at run-time.

## Usage / Concepts

* Define a "virtual" constructor. Used to instantiate an object from one among a set of classes based on a logic.
* Create object without exposing the creation logic to the client and refer to newly created object using a common interface.
* Object instantiation logic should not be exposed to client. A client class will not know what classes it will be required to create.

## See it in Action / Sample Code Snippet

* Factory method of Java Calendar and custom implementation of Payment use case.
* Run [AppTestDrive.java](https://github.com/tirthalpatel/Learning-OOPD/blob/master/DesignPatterns/src/com/tirthal/learning/design/patterns/creational/factorymethod/AppTestDrive.java) and refer the corresponding code flow.
	* Payment (interface) can have concrete implementations such as CashPayment, CreditCardPayment and NetbankingPayment.  
	* PaymentFactory's factory method is responsible for creating instance of Payment as per supplied PaymentOption argument by client app.

## Key Design Considerations

* Factory is responsible for object instantiation lifecycle. If applicable, consider designing an internal "object pool" that will allow objects to be reused instead of created from scratch.
* Parameterized factory method - design the arguments to the factory method. What qualities or characteristics are necessary and sufficient to identify the correct derived class to instantiate?
* If having an inheritance hierarchy that exercises polymorphism, consider adding a polymorphic creation capability by defining a static factory method in the base class.

## Real World Examples

* [java.util.Calendar#getInstace()](https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html#getInstance())
* [java.util.ResourceBundle#getBundle()](https://docs.oracle.com/javase/7/docs/api/java/util/ResourceBundle.html#getBundle(java.lang.String))
* [java.text.NumberFormat#getInstance()](https://docs.oracle.com/javase/7/docs/api/java/text/NumberFormat.html#getInstance())