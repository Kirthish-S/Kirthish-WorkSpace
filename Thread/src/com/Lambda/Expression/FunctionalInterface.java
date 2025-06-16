package com.Lambda.Expression;
/* Reduce the code by Lambda Expressions*/
public class FunctionalInterface //LambdaExpression works whenever we have FunctionalInterface & Runnable is actually a FunctionalInterface.
{ 
	public static void main(String[] args) 
	{ 
		Runnable obj1 = () -> // -> This is Lambda Expression 
		{
			for (int i = 0; i <= 5; i++) //
			{
				System.out.println("Hi");
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable obj2 = () -> 
		{
			for (int i = 0; i <= 5; i++) //
			{
				System.out.println("Hello");
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(obj1);//Thread has multiple constructors one of the constructor takes an Runnable Object.
		Thread t2 = new Thread(obj2);//In this Constructor of Thread we can pass obj1 & obj2, so we can pass Runnable object in the Thread Class or Thread Constructor
		
		t1.start();//start() method belongs to Thread class
		t2.start();//This start() will call the Run of these two classes.
		
		
	}
}

