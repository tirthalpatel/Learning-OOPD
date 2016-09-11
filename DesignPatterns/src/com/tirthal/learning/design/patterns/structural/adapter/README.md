# Adapter Pattern

To act as an intermediary between two classes, converting the interface of one class so that it can be used with the other. Often designed to integrate new client with old/legacy components.

## Usage / Concepts

* Use when an object needs to utilize an existing class with an incompatible interface.
* Permits classes with disparate interfaces to work together by creating a common object by which they may communicate and interact.
* Convert interface into another interface - for making things working after code is designed or specifically dealing with legacy code.
* Retrofit to make unrelated classes work together or translate requests.

## See it in Action / Sample Code Snippet

* Java Arrays.asList and custom adapter pattern example.
* Run [AppTestDrive.java](https://github.com/tirthalpatel/Learning-OOPD/blob/master/DesignPatterns/src/com/tirthal/learning/design/patterns/structural/adapter/AppTestDrive.java) client and refer the corresponding code flow.
	* TextFormattable: Target
	* CsvFormattable: Adaptee
	* CsvAdapterImpl: Adapter

## Key Design Considerations

Adapter makes things work after they're designed. The classes/objects participating in adapter pattern:

* Target: defines the domain-specific interface that Client uses.
* Adapter: adapts the interface Adaptee to the Target interface.
* Adaptee: defines an existing interface that needs adapting.
* Client: collaborates with objects conforming to the Target interface.

## Real World Examples

* [Arrays -> List](https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#asList(T...))
* Java IO Streams
* Spring Integration uses JMS adapters to send and receive JMS messages and JDBC adapters to convert messages to database queries and result sets back to messages.
* Non software examples: power supply adapters, card readers and adapters, etc.
