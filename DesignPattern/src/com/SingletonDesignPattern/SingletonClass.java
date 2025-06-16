package com.SingletonDesignPattern;

public class SingletonClass { //The process of creating only one object for the class throughout it's life cycle is known as Singleton.

//There are three steps to make the class as singleton
	
	//Step1: Create a singleton instance
	private static SingletonClass SingletonInstance = new SingletonClass(); //This particular singleton instance will be loaded & will get memory as soon as class will get loaded in the memory
	//Since it is static only one time SingletonInstance will be loaded & will get the memory & making it private to make sure it cannot be accessed directly.
	
	//Step2: Make the Constructor as private
	private SingletonClass() { //so that cannot instantiate SingletonClass object using the new keyword.
		
	}

	//Step3: Access it using getInstance
	public static SingletonClass getInstance() { // it will get only object available. NoSetter() only getter().
		return SingletonInstance;
	}
	
	public void simpleMethod() {
		System.out.println("Hashcode of Singleton Object is : " + SingletonInstance);
	}

}
