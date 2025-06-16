package com.Thread.Safety;

class SharedResource //The process of allowing one thread to access the resource is known as Thread Safety.
{                    //Thread Safety can be achieved by using a keyword synchronized
	int count;
	public synchronized void increment() //Synchronized will make sure that this increment will be called only by one method at a time, so if t1 is working with increment t2 has to wait
	{
		count++;
	}
	
}

public class Demo //LambdaExpression works whenever we have FunctionalInterface & Runnable is actually a FunctionalInterface.
{ 
	public static void main(String[] args) throws InterruptedException //Main is also a Thread in java executed by JVM
	{ 
		SharedResource src = new SharedResource();
		
		Runnable obj1 = () -> 
		{
			for (int i = 1; i <= 1000; i++) //
			{
				src.increment();
			}
		};
		
		Runnable obj2 = () -> 
		{
			for (int i = 1; i <= 1000; i++) //
			{
				src.increment();
			}
		};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
		t1.join();//Join() method allows main thread to wait for the other two threads to come back and join (means it will wait for obj1 1000 + obj2 1000 to combine the counts and make total 2000)
		t2.join();//When t1 is working with increment t2 cannot work with increment, so t2 has to wait. to do that we should use keyword synchronized()
		
		System.out.println(src.count);
		
		
	}
}