class A {
    int a, b;
    A(){
        a = 30; b = 40;
        System.out.println(a+ " " +b);
    }
    {
        a = 10; b = 20;
        System.out.println(a+ " " +b);
    }
}

public class _09instanceBlock {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        A r = new A();
    }
}
