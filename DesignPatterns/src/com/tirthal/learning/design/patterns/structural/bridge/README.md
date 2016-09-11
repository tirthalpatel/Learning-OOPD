# Bridge Pattern

To separate the abstract elements of a class from the implementation details, providing the means to replace the implementation details without modifying the abstraction.

## Usage / Concepts

Decouples the functional abstraction from the implementation so that the two can vary independently. Use when,
 
* Abstractions and implementations should not be bound at compile time.
* Abstractions and implementations should be independently extensible.
* Changes in the implementation of an abstraction should have no impact on clients.
* Implementation details should be hidden from the client.

## See it in Action / Sample Code Snippet

* Run [AppTestDrive.java](https://github.com/tirthalpatel/Learning-OOPD/blob/master/DesignPatterns/src/com/tirthal/learning/design/patterns/structural/bridge/AppTestDrive.java) client and refer the corresponding code flow.
	* Vehicle: Abstraction, which contains reference to the implementer.
	* Car, Bike: Refined Abstraction.
	* Workshop: Implementer.
	* Assemble, Produce: Concrete Implementation of the Implementer.
* Abstractions and implementations can be independently extensible, i.e., add 'Truck extends Vehicle' or 'QualityAudit extends Workshop' independently.
* see [Before Bridge Design Pattern vs. After Bridge Design Pattern](http://javapapers.com/design-patterns/bridge-design-pattern/)

## Key Design Considerations

* Create two different hierarchies. One for abstraction and another for implementation. Create a bridge that coordinates between abstraction and implementation.
* Avoid permanent binding by removing the dependency between abstraction and implementation. Decouple abstraction and implementation using Encapsulation, Composition and Inheritance techniques.
* Abstraction and implementation can be extended separately. Should be used when we have need to switch implementation at runtime.
* Client should not be impacted, if there is modification in implementation of abstraction.
* The classes/objects participating in bridge pattern:
	* Abstraction: Core of the bridge design pattern and defines the crux. Contains a reference to the implementer.
	* Refined Abstraction: Extends the abstraction takes the finer detail one level below. Hides the finer elements from implementers.
	* Implementer: This interface is the higher level than abstraction. Just defines the basic operations.
	* Concrete Implementation: Implements the above implementer by providing concrete implementation.

## Real World Examples

* JDBC Drivers