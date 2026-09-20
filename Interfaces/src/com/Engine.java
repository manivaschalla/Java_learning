package com;

/*
 * 	Interface
 * 
 * 	100% abstraction - Java7
 * 
 * 	public interface Test{
 * 
 * }
 * 
 * 	By default all methods are public abstract
 * 	Abstract keyword is not mandatory
 * 	All variables are by default --> public static final
 * 	We cannot create object or Constructor for interface
 * 	We use implements keyword to archive inheritance from parent interface to child class
 * 		
 * 		Parent class -> Child class ==> extends
 * 		Parent Interface -> Child  class ==> implements
 * 		Parent Interface -> Child interface ==> extends
 * 
 * 
 * 
 * 
 * 
 */

public interface Engine {
	
	void start();
	
	void stop();
	

}
