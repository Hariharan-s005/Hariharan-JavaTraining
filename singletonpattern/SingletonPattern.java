/**
 * This program demonstrates singleton pattern
 *  @author Hariharan Shakthivel 
 */
package singletonpattern;

public class SingletonPattern {
 public static void main(String[] args) {
	Earth earth1=Earth.createObject();
	Earth earth2=Earth.createObject();   //Even though we try to create two objects, the constructor is called only once and only one object is creates.
	
}
}
