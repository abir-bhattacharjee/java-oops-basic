public class _28arithmeticException {
    public static void main(String[] args) {
        try {
            int c = 10/0;
            System.out.println(c);
            
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("program executed");
    }
}
