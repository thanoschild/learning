class Counter {
    static int count;

    public synchronized void increment() {
        ++count;
    }
}

public class Demo {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        Counter.count = 0;

        Runnable obj1 = new Runnable() {
            public void run() {
                for(int i = 0; i<1000; i++) {
                    counter.increment();
                }
            }
        };

        Runnable obj2 = () -> {
                for(int i = 0; i<1000; i++) {
                    counter.increment();
                }
            };
        

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("value: " + Counter.count);
    }
}
