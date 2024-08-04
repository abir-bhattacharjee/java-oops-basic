class A{
    void input() {
        System.out.println("What is your name : ");
    }
}

class B extends A {
    void disp() {
        System.out.println("My name is Abir ");
    }
}

class C extends A {
    void show() {
        System.out.println("My name is Tani");
    }
}

public class _13hieraricalInheritance {
    public static void main(String[] args) {
        B r = new B();
        r.input();
        r.disp();
        C r2 = new C();
        r2.input();
        r2.show();
    }
}
