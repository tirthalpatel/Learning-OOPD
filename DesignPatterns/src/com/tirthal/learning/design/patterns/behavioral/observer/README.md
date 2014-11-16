Observer Pattern
=================

Purpose / Definition
------------------
* Observer pattern = Publishers + Subscribers. 
* Defines one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.
* It lets one or more objects to be notified of state changes in other objects within the system, and in this pattern the objects that watch on the state of another object are called Observer and the object that is being watched is called Subject.

Sample Code Snippet
-------------------
* Some auction demonstrate observer pattern - the auctioneer starts the bidding and acceptance of the bid changes to the new highest bid price, which is broadcast to all of the registered bidders in the form of a new bid price.
* Run [AppTestDrive.java](https://github.com/tirthalpatel/Learning-OOPD/blob/master/DesignPatterns/src/com/tirthal/learning/design/patterns/behavioral/observer/AppTestDrive.java) and refer the corresponding code flow.
	* Auctioner.java implements Subject.java 
	* Bidder*.java implements Observer.java  

Use when
--------
* State changes in one or more objects should trigger behavior in other objects.
* Broadcasting capabilities are required.
* An understanding exists that objects will be blind to the expense of notification.

Important Points
----------------
* Differentiate between the core (or independent) functionality and the optional (or dependent) functionality.
* Model the independent functionality with a "subject" abstraction.
* Model the dependent functionality with an "observer" hierarchy.
* The Subject is coupled only to the Observer base class.
* The client configures the number and type of Observers.
* Observers register themselves with the Subject.
* The Subject broadcasts events to all registered Observers.
* The Subject may "push" information at the Observers, or, the Observers may "pull" the information they need from the Subject.

Hot Spot
--------
* Sometime if any problem comes, debugging becomes very difficult because flow of control is implicitly between observers and observable. 
* Also if we miss to unregister the object it can create the memory issue, because subject holds all the reference of all the observers.

More Relevant Examples
----------------------
* [java.util.Observer](http://docs.oracle.com/javase/7/docs/api/java/util/Observer.html) and [java.util.Observable](http://docs.oracle.com/javase/7/docs/api/java/util/Observable.html) (rarely used in real world though)
* [java.util.EventListener](http://docs.oracle.com/javase/6/docs/api/java/util/EventListener.html) implementations (used in all over Swing)
* [javax.servlet.http.HttpSessionBindingListener](http://docs.oracle.com/javaee/5/api/javax/servlet/http/HttpSessionBindingListener.html)
* Java Message Service (JMS) uses Observer pattern along with Mediator pattern to allow applications to subscribe and publish data to other applications. 