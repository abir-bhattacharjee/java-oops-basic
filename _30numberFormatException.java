public class _30numberFormatException {
    public static void main(String[] args) {
        String str = "123";
        try {
            int a = Integer.parseInt(str);
            System.out.println(a);
    
        }
        catch(NumberFormatException n){
            System.out.println("can't converted to str");
        }
        System.out.println("Done");
    }
}
