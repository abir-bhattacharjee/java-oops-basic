class A extends Thread {
    @Override
    public void run() {

        try {
            for(int i=1;i<=5;i++){
                System.out.println("Abir");
                Thread.sleep(1000);
            }
            
        } catch (InterruptedException e) {

        }

    }
}

public class _42ExtendingThreadClass  {
    public static void main(String[] args) throws InterruptedException {
        A t = new A();
        t.start();

        for(int i=1;i<=5;i++){
            System.out.println("Tani");
            Thread.sleep(1000);
        }
    }
}
