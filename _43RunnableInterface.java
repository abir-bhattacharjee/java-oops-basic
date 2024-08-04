class A implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("A");
        }
    }
}

public class _43RunnableInterface {
    // @SuppressWarnings("unused")
    public static void main(String[] args) {
        A r = new A();
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("B");
        }
    }
}
