public class _31finally {
    public static void main(String[] args) {
        try {
            System.out.println("Abir");
            int a = 20/0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
        }
        finally  {
            System.out.println("try_catch ended");
        }
        System.out.println("main method ended");
    }
}
