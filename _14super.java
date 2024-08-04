class A {
    int a = 10;
    void show() {
        System.out.println("super class");
    }
}

class B extends A {
    int a = 20;
    void show(){
        // System.out.println(a);
        // System.out.println(super.a);

        super.show();
        System.out.println("sub class");
    }
}

public class _14super {
    public static void main(String[] args) {
        B r = new B();
        r.show();
        
    }
}
