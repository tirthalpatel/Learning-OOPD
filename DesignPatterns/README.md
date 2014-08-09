Learn Design Patterns
=====================
This project contains sample java code (by practical examples along with easy to understand comments) to learn design patterns.

How to use this project?
------------------------
Just import this project in Eclipse as an existing project, do necessary configuration to fix build path errors (e.g. setup JRE 1.7).

Motive
------
Lastly in year 2005, I read "Head First Design Patterns" book and then I consider patterns usage in coding as and when required. 

Again I thought to revise my design patterns knowledge in this year, and this project would be consequence of it.   

I took some content from below resources for the quick reference, so credit goes to authors of "SourceMaking Site", "OODesign Site" and "Design Patterns DZone Refcard".
	* http://sourcemaking.com/design_patterns
	* http://www.oodesign.com/
	* http://refcardz.dzone.com/refcardz/design-patterns

Additionally I would implement some of java code examples based on my experience. Also I aim to keep adding more examples to demonstrate Java 8 based implementation of design patterns in future.


Design Patterns
===============
* are recurring solutions to software design problems you find again and again in real-world application development.
* are just a description or template for how to solve a problem that can be used in many different situations, so can't be transformed directly into code. 
* can speed up the development process by providing tested, proven development paradigms. 
* allow developers to communicate using well-known, well understood names for software interactions.

Patterns can be categorized under the following heads based on Scope.
 * Class - Deals with class relationships that can be changed at compile time.
 * Object - Deals with object relationships that can be changed at runtime.

The are generally categorized as following. 

Creational Patterns
-------------------

Used to construct objects such that they can be decoupled from their implementing system.

[Start exploring creation pattern] (https://github.com/tirthalpatel/Learning-OOPD/tree/master/DesignPatterns/src/com/tirthal/learning/design/patterns/creational)	
	* Abstract Factory - Creates an instance of several families of classes	
	* Builder - Separates object construction from its representation
	* Factory Method - Creates an instance of several derived classes
	* Object Pool - Avoid expensive acquisition and release of resources by recycling objects that are no longer in use
	* Prototype - A fully initialized instance to be copied or cloned
	* Singleton - Ensures one and only object is created

Structural Patterns
-------------------

Used to form large object structures between many disparate objects.

[Start exploring structural pattern] (https://github.com/tirthalpatel/Learning-OOPD/tree/master/DesignPatterns/src/com/tirthal/learning/design/patterns/structural)
	* Adapter - Match interfaces of different classes
	* Bridge - Separates an object’s interface from its implementation
	* Composite - A tree structure of simple and composite objects
	* Decorator - Add responsibilities to objects dynamically
	* Facade - A single class that represents an entire subsystem
	* Flyweight - A fine-grained instance used for efficient sharing
	* Private Class Data - Restricts accessor/mutator access
	* Proxy - An object representing another object

Behavioral Patterns
-------------------

Used to manage algorithms, relationships and responsibilities between objects.

[Start exploring behavioral pattern] (https://github.com/tirthalpatel/Learning-OOPD/tree/master/DesignPatterns/src/com/tirthal/learning/design/patterns/behavioral)
	* Chain of Responsibility - A way of passing a request between a chain of objects
	* Command - Encapsulate a command request as an object
	* Interpreter - A way to include language elements in a program
	* Iterator - Sequentially access the elements of a collection
	* Mediator - Defines simplified communication between classes
	* Memento - Capture and restore an object's internal state
	* Null Object - Designed to act as a default value of an object
	* Observer - A way of notifying change to a number of classes
	* State - Alter an object's behavior when its state changes
	* Strategy - Encapsulates an algorithm inside a class
	* Template Method - Defer the exact steps of an algorithm to a subclass
	* Visitor - Defines a new operation to a class without change

Concurrency Patterns
--------------------

To be added in future