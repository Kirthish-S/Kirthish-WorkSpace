package com.Extend.Thread;
/* Thread can be Created in  2 Ways
 * By Extending Thread Class
 * By Implementing Runnable Interface */

class A extends Thread //To make these classes or these object as Threads just extend with a class called Thread 
{ //The movement we extend this class with Thread, Now this class is not a ordinary class this is a Thread.
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

class B extends Thread
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
	public static void main(String[] args) { 
		A obj1 = new A(); //Now this both objects are Threads
		B obj2 = new B(); 
		
		obj1.start();//The Movement Executor Job will call start() it will execute run()
		try {
			Thread.sleep(2); //I want to give gap b/w this two methods so i am calling sleep
		} catch (Exception e) {
			e.printStackTrace();
		}
		obj2.start();
	}
}

/*Note: 
* We can't execute normal objects simultaneously, so to execute objects simultaneously we can use Multiple Threads.
* Just by mentioning class is Thread, we will not get new Thread. We can do that with the help of start(). we need to call this method.
* start is a method belong to Thread class, it will create a new Thread. 
* start method will not call show(), it will call run() because in every Thread we need to have run() method that's how it works.

* Two Methods are actually running at the same time with the help of Scheduler in OS. 
* The Scheduler job is to schedule a job to allow which thread to execute on the OS.
* The Process of executing multiple threads at the same time is known as MultiThreading.*/
