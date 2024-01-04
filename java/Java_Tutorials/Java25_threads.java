/*
 * Threads are subprocess with lightweight with the smallest unit of processes 
 * and also has separate paths of execution.
 * 
 * Threads allows a program to operate more efficiently by doing multiple 
 * things at the same time.
 */

 /*
  * Life Cycle Of Thread
  * - New State
  * - Active State
  * - Waiting/Blocked State
  * - Timed Waiting State
  * - Terminated State
  */

class A extends Thread {
    public void run() {
        for(int i = 0; i<10; i++) {
            System.out.println("in show A");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for(int i = 0; i<10; i++) {
            System.out.println("in show B ..........");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Java25_threads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        // priority of thread 
        // priority can range from 1 to 10 
        // 1 has the least and 10 has the highest priority
        // 5 is the default priority
        System.out.println(obj1.getPriority());
        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();
    }
}
