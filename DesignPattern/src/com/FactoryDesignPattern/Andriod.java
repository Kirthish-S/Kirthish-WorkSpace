package com.FactoryDesignPattern;

public class Andriod implements OS { // Declare implementation class and

	@Override //The process of Inheriting method from superclass and changing its implementation in the subclass is known as MethodOverriding.
	public void spec() 
	{
		System.out.println("Android OS is Running"); //Provide implentation for all the abstarct methods in the implementation class
	}

}
