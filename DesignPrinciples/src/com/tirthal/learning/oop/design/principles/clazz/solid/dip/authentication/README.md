*** DIP = Dependency Inversion Principle
-----------------------------------------------

*** Description = 

	- The Dependency Inversion Principle (DIP) states that high-level modules should not depend upon low-level modules; they should depend on abstractions. 
	
	- Secondly, abstractions should not depend upon details; details should depend upon abstractions. The idea is that we isolate our class behind a boundary 
	  formed by the abstractions it depends on. If all the details behind those abstractions change, then our class is still safe. This helps keep coupling 
	  low and makes our design easier to change. DIP also allows us to test things in isolation, details like database are plugins to our system.

-----------------------------------------------

*** Examples =

(1) Authenticate (package = com.tirthal.learning.oop.design.principles.clazz.solid.dip.authentication)

	Requirement - Provide login by authenticating using Simple DB logic. In future, there may require adding more options such as LDAP based authentication.
	
	------ First let's see "bad" design and implementation (package = com.tirthal.learning.oop.design.principles.clazz.solid.dip.authentication.bad)
		
		- Refer LoginManager.java and SimpleAuthenticator.java
	
	------ How to do code-refactoring to make "good" design using DIP? (package = com.tirthal.learning.oop.design.principles.clazz.solid.dip.authentication.good)
	
		- Refer LoginManager.java
		- Refer SimpleAuthenticator.java and LDAPAuthenticator.java, which implements Authenticator.java interface
	
 -----------------------------------------------
 
 Feel free to contribute code for more examples in similar fashion... :-)