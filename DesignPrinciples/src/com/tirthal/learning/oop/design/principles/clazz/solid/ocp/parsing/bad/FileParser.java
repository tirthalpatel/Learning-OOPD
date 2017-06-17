package com.tirthal.learning.oop.design.principles.clazz.solid.ocp.parsing.bad;

/**
 * Example file parser implementation. What's wrong?
 * 
 * Well, OCP principle is violated. Why?
 * 
 * In future, if there is a need to extend it for CSV Parsing, then you need to implement new method parseCSV() and change parse() to add conditional
 * logic. That means, more efforts to spend on code review and testing.
 * 
 * @author tirthalp
 * 
 */
public class FileParser {

	private String filePath;
	private String expression;
	
	public FileParser(String filePath, String expression) {
		this.filePath = filePath;
		this.expression = expression;
	}
	
	/**
	 * apply parsing rule based the file based on extension type
	 * 
	 * @param filePath
	 * @param expression
	 * @return
	 */
	public String parse() {

		if (filePath.indexOf(".xml") > 1) { // XML parsing condition

			return parseXML(filePath, expression);

		} else if (filePath.indexOf(".txt") > 1) { // TXT parsing condition

			return parseText(filePath, expression);

		} // ------- Add further conditional logic, if needs to support more type such as CSV parsing
		return null;
	}

	private String parseXML(String filePath, String expression) {
		// TODO: implement xml parsing logic using xpath
		return "this is parsing output of xml file";
	}

	private String parseText(String filePath, String expression) {
		// TODO: implement text parsing logic using regular expression
		return "this is parsing output of text file";
	}
}
