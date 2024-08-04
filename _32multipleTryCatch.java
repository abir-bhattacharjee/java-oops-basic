public class _32multipleTryCatch {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        try {
            int a = 10, b = 0, c;
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        try {
            int a[] = {10, 20, 30, 40};
            System.out.println(a[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Beyond array limit");
        }

        finally {
            System.out.println("Done");
        }

        System.out.println("Main block ended");
    }
}
