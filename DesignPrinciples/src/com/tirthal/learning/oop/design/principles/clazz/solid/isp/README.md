*** ISP = Interface segregation principle
-----------------------------------------------

*** Description = 

	- The Interface Segregation Principle (ISP) states that clients should not be forced to depend upon interface members they do not use. 
	  When we have non-cohesive interfaces, the ISP guides us to create multiple, smaller, cohesive interfaces.
	
	- Don’t depend on things you don’t need. Interfaces containing methods that are not specific to it are called polluted or fat interfaces. We should avoid them.
	
	- Basically, the lesson here is “Don’t depend on things you don’t need”.

-----------------------------------------------

*** Examples =

(1) Order Service (package = com.tirthal.learning.oop.design.principles.clazz.solid.isp.order)

	Requirement - The users (one of client) would create, amend, submit and cancel order. There is one integration job (another client) would process order. 
				  For such requirements, there is requirement of exposing order services. 
	
	------ First let's see "bad" design and implementation (package = com.tirthal.learning.oop.design.principles.clazz.solid.isp.order.bad)
		
		- Refer OrderService.java
	
	------ How to do code-refactoring to make "good" design using ISP? (package = com.tirthal.learning.oop.design.principles.clazz.solid.isp.order.good)
	
		- Refer OrderService.java and OrderProcessingService.java 
	
		
 -----------------------------------------------
 
 Feel free to contribute code for more examples in similar fashion... :-)