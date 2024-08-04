class A {
    void show() {
        System.out.println("This is class A");
    } 
}

class B extends A {
    @Override
    void show() {
        // super.show();
        System.out.println("THis is class B");
    }
}

public class _18methodOverriding {
    public static void main(String[] args) {
        B r = new B();
        r.show();
    }
}
