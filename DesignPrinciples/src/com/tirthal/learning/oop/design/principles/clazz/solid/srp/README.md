*** SRP = Single Responsibility Principle
-----------------------------------------------

*** Description =

- There should never be more than one reason for a class to change. In this context a responsibility is considered to be one reason to change a class.
 
- This principle states that if we have 2 reasons to change for a class, we have to split the functionality in two classes. 
  Each class will handle only one responsibility and in future if we need to make one change we are going to make it in the class which handle it.
   
- When we need to make a change in a class having more responsibilities the change might affect the other functionality of the classes.
  When a class has more than one responsibility, there are also more triggers and reasons to change that class.
   
- In short if we go ahead and introduce any change to given class then the change should only be limited to that class. 
  None of the dependent classes or consumers should have to be modified to adjust to this change.

-----------------------------------------------

*** Examples =


(1) Design of Modem (package = com.tirthal.learning.oop.design.principles.clazz.solid.srp.modem)

	------ First understand what can be "bad" design of Modem (why SRP is violated)?
	
	Package = com.tirthal.learning.oop.design.principles.clazz.solid.srp.modem.bad

	Problems = 
	  (1) IModem doesn't indicate clearly its responsibilities (sign of bad smell)
	  (2) Single IModem has two responsibilities - connection management + data management. That means, it has more than one reasons to change. 
	  (3) Difficult to understand and maintain as it grows.
	  
	Are you still wondering, what's problem in that??? Let's understand by code example,
	
	  (1) First develop "SLOW" modem and understand code as below.
	  	  - Refer IModem interface (violating SRP)
	  	  - Refer ModemSlow class implements IModem interface (violating SRP)
	  	  - Refer ModemSlowClient class which is consumer of ModemSlow class
	
	  (2) Now understand impact, if there is a need to add "FAST" modem type.
	      - Refer ModemFast class implements IModem interface (violating SRP)
	      - Refer ModemFastClient class which is consumer of ModemFast class
	      
	      PROBLEM IS,
	      
	      - The connection management responsibility (dial and disconnected) is duplicated in both ModemSlow and ModemFast classes
	      - Also in future if modem requires to dial with password logic, then it would require to change both ModemFast and ModemSlow.   
	  
	  (3) Now just think, how can you add "SUPER FAST" modem in similar way and how more complexity will increase?
	  
	
	------ Now follow SRP (along with delegation principle) for "good" design of Modem:
	
	 Package = com.tirthal.learning.oop.design.principles.clazz.solid.srp.modem.good
	
	 Solution =
	  
	  (1) Follow SRP - IConnection interface is responsible for connection management. IDataChannel interface is responsible for data exchange.
	  
	  (2) Each interface or corresponding class is focused to single responsibility.
	  		- class ConnectionManager implements IConnection (for connection management responsibilities)
	  		- class DataChannelSlowMode implements IDataChannel (for data exchange using "SLOW" modem type)
	  
	  (3) Model class - implemented using Delegation design principle.
	  
	  (4) How does it give better control for incorporating future changes or maintenance?
	  		- Let's see how to add "FAST" modem type? We'll, just add class DataChannelFastMode which implements IDataChannel.
	  		- Also in future if modem requires to dial with password logic, then it just requires to change logic in dial() of ConnectionManager class. No impact in other classes.
	  
	  (5) Now just think, how can you add "SUPER FAST" type of modem in similar way?



	
 (2) Sample code is not implemented yet for below example requirement. You can try, if you really understood SRP!
 
 	- Download file from given path 
 	- Apply parsing rules on given file
 	- Store parsing output  
 
 	Thoughts:
 	
 	- Bad design by violating SRP:
 		- Put all responsibilities in single interface and class 
 		- For example, 
 			- IDataProcessing.java (interface), FileProcessor.java (class implements IDataProcessing.java)
 	
 	- Better design by following SRP:
 		- Each interface/class to focus on single responsibility and the name is enough to express its single responsibility
 		- For example, 
 			- IDownloader.java (interface), FileDownloader.java (class implements IDownloader.java)
 			- IParser.java (interface), CsvFileParser.java (class implements IParser.java), may be in future there can be XmlFileParser.java (class implements IParser.java)
 			- IDataStore.java (interface), DatabaseStore (class implements IDataStore.java)
 
 -----------------------------------------------
 
 Feel free to contribute code for more examples in similar fashion... :-)