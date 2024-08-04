class A {
    A(){
        System.out.println("default constructor");
    }
    {
        System.out.println("Instance block");
    }
    static {
        System.out.println("static block");
    }
}

public class _10instanceStatic {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        A r = new A();
    }
}
