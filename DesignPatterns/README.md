# Learn Design Patterns

This project contains sample java code (by practical examples along with easy to understand comments) to learn design patterns.

## How to use this project?

Just import this project in Eclipse as an "Existing Maven Project". If require, do necessary configuration to fix build path errors (e.g. setup JRE 1.8).

## Motive

Lastly in year 2005, I read "Head First Design Patterns" book and then I consider patterns usage in coding as and when required.

Again I thought to revise my design patterns knowledge in chunks by 2016 year, and this project would be consequence of it.

I consider to take some content from below resources for the quick reference, so credit goes to authors of "Tutorials Point", "Java Point", "SourceMaking Site", "OODesign Site", "Design Patterns DZone Refcard" and "Design Patterns in Java courses of Pluralsight".

* http://www.javatpoint.com/design-patterns-in-java
* http://www.tutorialspoint.com/design_pattern/index.htm
* http://sourcemaking.com/design_patterns
* http://www.oodesign.com/
* http://refcardz.dzone.com/refcardz/design-patterns
* https://app.pluralsight.com/library/search?q=%22Design+Patterns+in+Java%22

Additionally, I intend to implement some of java code examples based on my experience.


## Design Patterns

* are recurring solutions to software design problems you find again and again in real-world application development.
* are just a description or template for how to solve a problem that can be used in many different situations, so can't be transformed directly into code.
* can speed up the development process by providing tested, proven development paradigms.
* allow developers to communicate using well-known, well understood names for software interactions.
* allow you to get experience reuse, instead of code reuse.

Patterns can be categorized under the following heads based on Scope.

 * Class - Deals with class relationships that can be changed at compile time.
 * Object - Deals with object relationships that can be changed at runtime.

The design patterns in java are generally categorized as following.

## Creational Patterns

Focuses on object instantiation or how objects are created. Let you construct objects such that they can be decoupled from their implementing system. [Start exploring creation patterns](https://github.com/tirthalpatel/Learning-OOPD/tree/master/DesignPatterns/src/com/tirthal/learning/design/patterns/creational),

* [Singleton](https://github.com/tirthalpatel/Learning-OOPD/tree/master/DesignPatterns/src/com/tirthal/learning/design/patterns/creational/singleton)
* [Builder](https://github.com/tirthalpatel/Learning-OOPD/tree/master/DesignPatterns/src/com/tirthal/learning/design/patterns/creational/builder)
* [Prototype](https://github.com/tirthalpatel/Learning-OOPD/tree/master/DesignPatterns/src/com/tirthal/learning/design/patterns/creational/prototype)
* [Factory Method](https://github.com/tirthalpatel/Learning-OOPD/tree/master/DesignPatterns/src/com/tirthal/learning/design/patterns/creational/factorymethod)
* [Abstract Factory](https://github.com/tirthalpatel/Learning-OOPD/tree/master/DesignPatterns/src/com/tirthal/learning/design/patterns/creational/abstractfactory)
* [Object Pool](https://github.com/tirthalpatel/Learning-OOPD/tree/master/DesignPatterns/src/com/tirthal/learning/design/patterns/creational/objectpool)

## Structural Patterns

Focuses on the relationship of classes structure. Let you ease the design by identifying a simple way to realize relationships between entities. [Start exploring structural patterns](https://github.com/tirthalpatel/Learning-OOPD/tree/master/DesignPatterns/src/com/tirthal/learning/design/patterns/structural),

* [Adapter](https://github.com/tirthalpatel/Learning-OOPD/tree/master/DesignPatterns/src/com/tirthal/learning/design/patterns/structural/adapter)
* [Bridge](https://github.com/tirthalpatel/Learning-OOPD/tree/master/DesignPatterns/src/com/tirthal/learning/design/patterns/structural/bridge)
* [Composite](https://github.com/tirthalpatel/Learning-OOPD/tree/master/DesignPatterns/src/com/tirthal/learning/design/patterns/structural/composite)
* [Decorator](https://github.com/tirthalpatel/Learning-OOPD/tree/master/DesignPatterns/src/com/tirthal/learning/design/patterns/structural/decorator)
* Facade
* Flyweight
* Proxy
* Private Class Data

## Behavioral Patterns

Focuses on the communication between objects. Let you manage algorithms, relationships, and responsibilities between objects. [Start exploring behavioral patterns](https://github.com/tirthalpatel/Learning-OOPD/tree/master/DesignPatterns/src/com/tirthal/learning/design/patterns/behavioral),

* Chain of Responsibility
* Command
* Interpreter
* Iterator
* Mediator
* Memento
* Null Object
* [Observer](https://github.com/tirthalpatel/Learning-OOPD/tree/master/DesignPatterns/src/com/tirthal/learning/design/patterns/behavioral/observer)
* State
* [Strategy](https://github.com/tirthalpatel/Learning-OOPD/tree/master/DesignPatterns/src/com/tirthal/learning/design/patterns/behavioral/strategy)
* Template Method
* Visitor

## Concurrency Patterns

Let you deal with the multi-threaded programming paradigm.

To be added in future



## Disclaimer

The code snippet are mainly targeted for learning purpose, and not focused for producing production code quality.