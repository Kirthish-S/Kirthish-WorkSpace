package com.FactoryDesignPattern; 

import java.util.Scanner;

public class ClientFactoryMain 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input to acess operating system.");
		String userinput = sc.next();
		//The process of hiding implementation and providing functionalities to the user with the help of interface is known as Abstraction
		//Interface referenceObject = Factoryhelpercalss Factoryhelpermethod
		OS obj = OperatingSystemFactory.getOS(userinput);//Even if we have extra class in future it will not change in client application.
		obj.spec();                                      //it will change in OperatingSystemFactory class but not in client application.
	}                                                    //thats the amazing thing about FactoryDesignPattern.
}
