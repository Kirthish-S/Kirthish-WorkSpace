package com.Thread.Deadlock;

/*Deadlock occurs in a situtaion, when thread is waiting for an object lock, that is acquired by another thread and
second thread is waiting for an object lock that is acquired by first thread. 
since, both threads are waiting for each other to release the lock, this condition is called Deadlock.*/

public class Deadlock {
    final Object s1 = "Resource One"; // Synchronization works on Object, so i want Object to lock
    final Object s2 = "Resource Two";

    // t1 tries to lock s1 then s2
    Thread t1 = new Thread() {
        public void run() {
            while (true) {
                synchronized (s1) {
                    System.out.println(Thread.currentThread().getName() + " locked " + s1);
                    try {
                        Thread.sleep(100); // Wait after locking s1
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (s2) {
                        System.out.println(Thread.currentThread().getName() + " locked " + s2);
                    }
                }
            }
        }
    };

    // t2 tries to lock s2 then s1
    Thread t2 = new Thread() {
        public void run() {
            while (true) {
                synchronized (s2) {
                    System.out.println(Thread.currentThread().getName() + " locked " + s2);
                    try {
                        Thread.sleep(100); // Wait after locking s2
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (s1) {
                        System.out.println(Thread.currentThread().getName() + " locked " + s1);
                    }
                }
            }
        }
    };

    public static void main(String[] args) {
        Deadlock dl = new Deadlock();
        dl.t1.start();
        dl.t2.start();
    }
}

/*
 * The deadlock occurs because:
 * 
 * Thread t1 locks s1 and then tries to lock s2
 * 
 * Thread t2 locks s2 and then tries to lock s1
 * 
 * Both threads wait indefinitely for each other to release the locks
 */
