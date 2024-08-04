public class _35nestedCatch {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }
        catch(Exception e) {
            try {
                String a = null;
                System.out.println(a.toLowerCase());
                
            } catch (Exception a) {
                System.out.println(a);
            }
        }
        System.out.println("Main method ended");
    }
}
