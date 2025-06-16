package com.FactoryDesignPattern;

public class OperatingSystemFactory //This is a class which gives an Object thats why it is called FactoryDesignPattern.
{
	public static OS getOS(String input) //Factory generally takes an i/p of string type abstraction.
	{
		if(input.equals("OpenSource")) 
		{
			return new Andriod();
		}
		else if(input.equals("CloseSource")) 
		{
			return new IOS();
		}else 
		{
			return new Windows();
		}	
	}
}
