# Composite Pattern

To create hierarchical, recursive tree structures of related objects where any element of the structure may be accessed and utilized in a standard manner.

## Usage / Concepts

* Facilitates the creation of object hierarchies where each object can be treated independently or as a set of nested objects through the same interface.
* Use when, 
	- Hierarchical representations of objects are needed.
	- Objects and compositions of objects should be treated uniformly.

## See it in Action / Sample Code Snippet

* Run [AppTestDrive.java](https://github.com/tirthalpatel/Learning-OOPD/blob/master/DesignPatterns/src/com/tirthal/learning/design/patterns/structural/composite/AppTestDrive.java) client and refer the corresponding code flow.
	* MenuComponent: Component.
	* MenuItem: Leaf.
	* Menu: Composite.

## Key Design Considerations

* Tree structured - Component, Leaf, Composite, in which Leaf and Composite have the same interface
* The classes/objects participating in composite pattern:
	* Component: Declares interface for objects in composition; Implements default behavior for the interface common to all classes as appropriate; Declares an interface for accessing and managing its child components.
	* Leaf: Represents leaf objects in composition; A leaf has no children; Defines behavior for primitive objects in the composition.
	* Composite: Defines behavior for components having children; Stores child component; Implements child related operations in the component interface.
	* Client: Manipulates objects in the composition through the component interface.

## Real World Examples

* [java.awt.Component#add(Component)](https://docs.oracle.com/javase/7/docs/api/java/awt/Container.html#add(java.awt.Component))
* JSF Widgets