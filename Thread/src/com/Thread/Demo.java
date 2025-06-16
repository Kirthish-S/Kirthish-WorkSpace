package com.Thread;
/*Thread is an execution instance which as it's own States and Behaviors.
 * States of the thread are thread id, concrete name, thread priority.
 * Behaviors of the thread are start operation, stop operation.
 */
class A 
{
	public void show() //when obj1.show method is called it will execute this 1st
	{
		for (int i = 0; i <= 10; i++) //
		{
			System.out.println("Hi");	
		}
	}
}

class B
{
	public void show() //when obj2.show method is called it will execute this 2nd
	{
		for (int i = 0; i <= 10; i++) 
		{
			System.out.println("Hello");	
		}
	}
}

public class Demo 
{
	public static void main(String[] args) { //JVM will start Executing java code from main method
		A obj1 = new A(); //This will create an object and it is stored in the Heap Memory
		B obj2 = new B(); //After creating A Object it will create B Object Everything goes in sequential order
		
		obj1.show();//Executor Job is to execute this Method or Behavior
		obj2.show();//Main will continue to next statement only when previous statement is done executing
	}
}

//Note: We can't execute normal objects simultaneously, so to execute objects simultaneously we can use Multiple Threads.
