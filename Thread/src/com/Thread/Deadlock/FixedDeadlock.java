package com.Thread.Deadlock;

/*Lock ordering is the simplest and most reliable way to prevent deadlocks.
If lock ordering isn't possible, use tryLock() with timeouts.
Always release locks in a finally block to avoid leaks.*/

public class FixedDeadlock {
    final Object s1 = "Resource one"; 
    final Object s2 = "Resource two";

    // Thread 1: Locks s1 -> s2 (same order as Thread 2)
    Thread t1 = new Thread() {
        public void run() {
            for (int i = 0; i < 1; i++) {  // Runs 1 times only
                synchronized (s1) {  // Lock s1 first
                    System.out.println(Thread.currentThread().getName() + " locked " + s1);
                    try {
                        Thread.sleep(100);  // Simulate work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (s2) {  // Then lock s2
                        System.out.println(Thread.currentThread().getName() + " locked " + s2);
                    }
                }
            }
        }
    };

    // Thread 2: Also locks s1 -> s2 (same order as Thread 1)
    Thread t2 = new Thread() {
        public void run() {
            for (int i = 0; i < 1; i++) {  // Runs 1 times only
                synchronized (s1) {  // Lock s1 first
                    System.out.println(Thread.currentThread().getName() + " locked " + s1);
                    try {
                        Thread.sleep(100);  // Simulate work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (s2) {  // Then lock s2
                        System.out.println(Thread.currentThread().getName() + " locked " + s2);
                    }
                }
            }
        }
    };

    public static void main(String[] args) {
        FixedDeadlock dl = new FixedDeadlock();
        dl.t1.start();
        dl.t2.start();
    }
}