# Prototype Pattern

To instantiate a new object by copying all of the properties of an existing object, creating an independent clone. This pattern is specifically used when creation of object directly is costly or inefficient. For example, an object is to be created after a costly database operation. We can cache the object, return its clone on next request and update the database as and when needed thus reducing database calls.

## Usage / Concepts

* Avoid costly object creation - initial creation of each object is an expensive operation.
* Create objects based upon a template of an existing objects through cloning.
* Composition, creation, and representation of objects should be decoupled from a system.

## See it in Action / Sample Code Snippet

* Run [AppTestDrive.java](https://github.com/tirthalpatel/Learning-OOPD/blob/master/DesignPatterns/src/com/tirthal/learning/design/patterns/creational/prototype/AppTestDrive.java) and refer the corresponding code flow.
	* "Rectangle, Square and Circle" extends "Shape", which implements Cloneable
	* ShapeRegistry - avoids costly object creation and provides prototyped object to client	

## Key Design Considerations

* Often utilizes an interface for Clone / Cloneable - Think about Shallow vs. Deep copy.
* Typically avoid usage of "new". Although a copy, each instance is unique.
* Usually implemented with a Registry / Cache.
* Costly construction not handled by client.

## Hot Spots

* Prototype Manager – implemented usually as a hashtable keeping the object to clone. When use it, prototype become a factory method which uses cloning instead of instantiation.
* Deep Clones vs. Shallow Clones – when we clone complex objects which contains other objects, we should take care how they are cloned. We can clone contained objects also (deep cloning) or we can the same reference for them, and to share them between cloned container objects.
* Initializing Internal States – there are certain situations when objects need to be initialized after they are created.

## Real World Examples

* java.lang.Object#clone(): The class has to implement java.lang.Cloneable