class A implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("in show A");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("in show B ..........");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Java26_runnable {
    public static void main(String[] args) {
        // Runnable obj1 = new A();
        // Runnable obj2 = new B();

        Runnable obj1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("in show A");
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
