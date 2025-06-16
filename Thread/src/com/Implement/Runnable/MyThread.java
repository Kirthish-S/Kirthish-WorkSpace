package com.Implement.Runnable;
/* By Implementing Runnable Interface 
 * Implementing Runnable is the best way of creating Thread,
 * If a class is implementing Runnable that class can also inherit the properties of any other class
 * Syntax: class MyThread extend Demo implements Runnable
*/
 
class A implements Runnable //To make these classes or these object as Threads, just implement it with the help of an Interface called Runnable 
{ //The Runnable Interface will not have the Thread Methods, In that case we need to create a separate thread objects & then we can use these features.
	public void run() 
	{
		for (int i = 0; i <= 10; i++) //
		{
			System.out.println("Hi");
			try {
				Thread.sleep(10); //After printing Hi the A thread will go into wait state and then B Thread will execute Hello
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class B implements Runnable
{
	public void run() 
	{
		for (int i = 0; i <= 10; i++) 
		{
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class MyThread 
{
	public static void main(String[] args) 
	{ 
		Runnable obj1 = new A();//obj1 & obj2 here is actually Runnable Object
		Runnable obj2 = new B();//we can create a reference of the Interface & object of a class. 
		
		/*obj1.start();
		 * start() wont work here, because in Runnable Interface don't have start() method.
		 * start() method before it was comming from Thread class, so to use this we need to create Thread Objects */
		
		Thread t1 = new Thread(obj1);//Thread has multiple constructors one of the constructor takes an Runnable Object.
		Thread t2 = new Thread(obj2);//In this Constructor of Thread we can pass obj1 & obj2, so we can pass Runnable object in the Thread Class or Thread Constructor
		
		t1.start();//start() method belongs to Thread class
		t2.start();//This start() will call the Run of these two classes.
	}
}
