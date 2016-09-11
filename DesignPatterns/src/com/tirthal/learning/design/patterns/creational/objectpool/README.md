# Object Pool Pattern

To reuse the object that are expensive to create. Although the object pool is handling the object instantiation, it's main purpose is to provide a way for the clients to reuse the objects like they are new objects, without being shared.

## Usage / Concepts

* When an application requires objects which are expensive to create. For example, there is a need of opening too many connections for the database then it takes too longer to create a new one and the database server will be overloaded.
* When there are several clients who need the same resource at different times.

## See it in Action / Sample Code Snippet

* [Creating Object Pool using Apache Commons Pool](https://dzone.com/articles/creating-object-pool-java)

## Key Design Considerations

* An Object pool is a container which contains a specified amount of objects. When an object is taken from the pool, it is not available in the pool until it is put back. 
* Objects in the pool have a lifecycle: creation, validation and destroy.

## Hot Spots

* When the Object Pool pattern is used the objects should be marked as available(released) by the client after they are used, so the pool will be aware about this. This is the main drawback because the client should do this and it's a common situation when database connection are not released after they are used. To overcome this a mechanism can be implemented to release resources, if they are not used for a period of time.
* Creating the resources might fail and this case should be treated carefully. When there is no available resource (because the number is limited or creating a new one failed) the client should be notified about it.

## Real World Examples

* Java supports thread pooling via java.util.concurrent.ExecutorService and other related classes
* The data source pools and thread pools in application servers