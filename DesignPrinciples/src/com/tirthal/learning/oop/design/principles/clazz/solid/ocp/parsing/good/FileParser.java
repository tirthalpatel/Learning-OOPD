package com.tirthal.learning.oop.design.principles.clazz.solid.ocp.parsing.good;

// NOTE - For simplicity I kept all classes in same file, but you can have separate file for each class

/**
 * Abstract class to define parse() specification, which follows OCP. Why?
 * 
 * Well if you need to extend support for more types like CSV, then you don't need to change existing class/method. Just add new class called
 * CsvParser extending FileParser. That means, you just need code review and testing of new CsvParser class. This is the beauty of OCP.
 * 
 * @author tirthalp
 * 
 */
abstract class FileParser {
	abstract String parse(String filePath, String expression);
}

/**
 * Implementation class for XML Parser
 * 
 * @author tirthalp
 * 
 */
class XMLParser extends FileParser {

	@Override
	String parse(String filePath, String expression) {
		// TODO: implement xml parsing logic using xpath
		return "";
	}
}

/**
 * Implementation class for TXT Parser
 * 
 * @author tirthalp
 * 
 */
class TextParser extends FileParser {

	@Override
	String parse(String filePath, String expression) {
		// TODO: implement text parsing logic using regular expression
		return "";
	}
}
