public class _33multipleCatch {
    // @SuppressWarnings("unused")
    public static void main(String[] args) {
        try {
            int a = 10, b = 0, c;
            c = a / b;
            System.out.println(c);

            int arr[] = {10, 20, 30, 40};
            System.out.println(arr[10]);
        } catch(ArrayIndexOutOfBoundsException a) {
            System.out.println("Array index error");
        } 
        
        catch (ArithmeticException e) {
            System.out.println("Arithmatic Exception");
        } 
        
        catch (Exception x) {
            System.out.println("All exception");
        }
    }
}
