

public class _29nullPointerException {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        String str = null;
        System.out.println(str);
        try {
            System.out.println(str.toUpperCase());
            
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Program ended");
    }
}
