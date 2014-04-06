package com.tirthal.learning.oop.concepts;

//---------------------------------------
//--- STEP 00 - WHAT IS HIGH COHESION? 
//---------------------------------------

///**
// * High Cohesion = The responsibilities/methods are highly related to class/module.
// * 
// * The term cohesion is used to indicate the degree to which a class has a single, well-focused. Cohesion is a measure of how the methods of a class 
// * or a module are meaningfully and strongly related and how focused they are in providing a well-defined purpose to the system. The more focused a 
// * class is, the higher its cohesiveness - a good thing.
// * 
// * A class is identified as a low cohesive class, when it contains many unrelated functions within it. And that what we need to avoid, because big
// * classes with unrelated functions hamper their maintaining. Always make your class small and with precise purpose and highly related functions.
// */

//---------------------------------------
//--- STEP 01 - EXAMPLE OF LOW COHESIVE CLASS
//---------------------------------------

/**
 * The purpose of "MyReader" is to read the resource. But it contains some unrelated functions such as validateLocation(), checkFTP(), ping(). Hence
 * it is low cohesive.
 * 
 * @author tirthalp
 * 
 */
class MyReader_LowCohesive {

	// -------------- unrelated functions

	public boolean validateLocation(String pathIP) {
		return ping(pathIP) && checkFTP(pathIP);
	}

	private boolean checkFTP(String pathIP) {
		// TODO Add logic
		return true;
	}

	private boolean ping(String pathIP) {
		// TODO Add logic
		return true;
	}

	// -------------- functions related to read resource

	// read the resource from disk
	public String readFromDisk(String fileName) {
		return "data of " + fileName;
	}

	// read the resource from web
	public String readFromWeb(String url) {
		return "data of " + url;
	}

	// read the resource from network
	public String readFromNetwork(String networkAddress) {
		return "data of " + networkAddress;
	}

}

// ---------------------------------------
// --- STEP 02 - EXAMPLE OF HIGH COHESIVE CLASS
// ---------------------------------------

/**
 * The purpose of "MyReader" is to read the resource and it does that only. It does not implement other unrelated things. Hence it is highly cohesive.
 * 
 * @author tirthalp
 * 
 */
class MyReader_HighCohesive {
	// -------------- functions related to read resource

	// read the resource from disk
	public String readFromDisk(String fileName) {
		return "reading data of " + fileName;
	}

	// read the resource from web
	public String readFromWeb(String url) {
		return "reading data of " + url;
	}

	// read the resource from network
	public String readFromNetwork(String networkAddress) {
		return "reading data of " + networkAddress;
	}
}
