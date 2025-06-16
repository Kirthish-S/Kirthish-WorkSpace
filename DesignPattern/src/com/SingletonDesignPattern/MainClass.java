package com.SingletonDesignPattern;

public class MainClass {

	public static void main(String[] args) {
		
		// Correct way to get the singleton instance
		SingletonClass singletonObj = SingletonClass.getInstance();
		singletonObj.simpleMethod();
		
		// Verify it's the same instance
        SingletonClass anotherInstance = SingletonClass.getInstance();
        anotherInstance.simpleMethod();
        
        //No matter how many n no of times we create Singleton Objects, The Memory is given only once to all the Singleton Objects.

	}

}
