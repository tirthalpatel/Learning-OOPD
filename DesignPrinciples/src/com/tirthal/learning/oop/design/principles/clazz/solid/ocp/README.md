*** OCP = Open Closed Principle
-----------------------------------------------

*** Description = http://www.oodesign.com/design-principles.html
	
	- "software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification"; that is, such an entity can allow its behaviour to be extended without modifying its source code.
	 
	- If you have a library containing a set of classes there are many reasons for which you'll prefer to extend it without changing the code 
	  that was already written (backward compatibility, regression testing...). This is why we have to make sure our modules follow Open Closed Principle.

	- When referring to the classes Open Close Principle can be ensured by use of Abstract classes and Concrete classes for implementing their behavior. 
	  This will enforce having Concrete Classes extending Abstract Classes instead of changing them. 
	  Some particular cases of this are Template Pattern and Strategy Pattern.


-----------------------------------------------

*** Examples =

(1) File Parser (package = com.tirthal.learning.oop.design.principles.clazz.solid.ocp.parsing) 

	Requirement - Need to develop file parsing for XML and TXT types.

	------ First let's see "bad" design and implementation
	
		- Refer com.tirthal.learning.oop.design.principles.clazz.solid.ocp.parsing.bad.FileParser
		- parse() contains if-else conditional logic to parse the file based on type
		- In future if you need to extend it to support CSV type, then what will you do? Well you have to change parse() to add one more condition. So OCP is violated.

	------ How to do code-refactoring to make "good" design using OCP?
	
		- Refer com.tirthal.learning.oop.design.principles.clazz.solid.ocp.parsing.good.FileParser
		- FileParser is abstract class. Now to support new type of parsing support, just add new class extending FileParser class  
	

(2) Drawing Shapes (package = com.tirthal.learning.oop.design.principles.clazz.solid.ocp.drawing 

	- Reference: http://www.oodesign.com/open-close-principle.html
	
	------- Bad design - OCP is violated (Refer GraphicEditor)
	
		- package = com.tirthal.learning.oop.design.principles.clazz.solid.ocp.drawing.bad
	
	------- Good design - OCP is followed
	
		- package = com.tirthal.learning.oop.design.principles.clazz.solid.ocp.drawing.good

 -----------------------------------------------
 
 Feel free to contribute code for more examples in similar fashion... :-)