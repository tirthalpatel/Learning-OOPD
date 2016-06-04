# Creational Patterns

* The creational patterns are all about class instantiation i.e. involve object instantiation and also provide a way to decouple a client from the objects it needs to instantiate.
* The creational patterns abstract the process of object instantiation, i.e. separating how objects are created, composed, and represented from the code that relies on them. 
* The creational patterns support the creation process by helping to provide the following capabilities:
	- Generic instantiation: This allows objects to be created in a system without having to identify a specific class type in code.
	- Simplicity: Some of the patterns make object creation easier, so callers will not have to write large, complex code to instantiate an object.
	- Creation constraints: Some patterns enforce constraints on the type or number of objects that can be created within a system.

## See it in Action:

* Abstract Factory - Creates an instance of several families of classes
* Builder - Separates object construction from its representation
* Factory Method - Creates an instance of several derived classes
* Object Pool - Avoid expensive acquisition and release of resources by recycling objects that are no longer in use
* Prototype - A fully initialized instance to be copied or cloned
* [Singleton](https://github.com/tirthalpatel/Learning-OOPD/tree/master/DesignPatterns/src/com/tirthal/learning/design/patterns/creational/singleton) - A class of which only a single instance can exist within a system