# Abstract Factory Pattern

To provide a contract for creating families of related or dependent objects without having to specify their concrete classes.

## Usage / Concepts

* Factory of Factories. Factory of a set of ‘related’ factory method design pattern.
* When need to provide a library of objects that does not show implementations and only reveals interfaces.
* Provide an interface that delegates creation calls to one or more concrete classes in order to deliver specific objects.

## See it in Action / Sample Code Snippet

* Custom implementation of CreditCard Abstract Factory.
* Run [AppTestDrive.java](https://github.com/tirthalpatel/Learning-OOPD/blob/master/DesignPatterns/src/com/tirthal/learning/design/patterns/creational/abstractfactory/AppTestDrive.java) client and refer the corresponding code flow.
	* CreditCardFactory.java: AbstractFactory abstract class
	* AmexFactory.java, MasterCardFactory.java, VisaFactory.java: ConcreteFactory implementation classes
	* CreditCard.java, Validator.java: AbstractProduct abstract classes
	* *CreditCard.java, *Validator.java: Product implementation classes	

## Key Design Considerations

Group collection of Factories together and typically built through Composition. The classes that participate to the Abstract Factory pattern are:

* AbstractFactory: declares a interface for operations that create abstract products.
* ConcreteFactory: implements operations to create concrete products.
* AbstractProduct: declares an interface for a type of product objects.
* Product: defines a product to be created by the corresponding ConcreteFactory; it implements the AbstractProduct interface.
* Client: should retire all references to new, and use the interfaces declared by the AbstractFactory and AbstractProduct classes.

## Hot Spots

* AbstractFactory class declares only an interface for creating the products. The actual creation is the task of the ConcreteProduct classes, where a good approach is applying the Factory Method design pattern for each product of the family.
* Extending factories can be done by using one Create method for all products and attaching information about the type of product needed.

## Real World Examples

* [javax.xml.parsers.DocumentBuilderFactory#newInstance()](https://docs.oracle.com/javase/7/docs/api/javax/xml/parsers/DocumentBuilderFactory.html#newInstance())
* [javax.xml.transform.TransformerFactory#newInstance()](https://docs.oracle.com/javase/7/docs/api/javax/xml/transform/TransformerFactory.html#newInstance())