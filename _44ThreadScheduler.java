class A extends Thread {
    public void run() {
        
    }
}

public class _44ThreadScheduler {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.start();
        t2.start();
        t3.start();
    }
}
