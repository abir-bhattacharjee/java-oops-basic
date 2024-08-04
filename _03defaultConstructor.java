class A {
    int a;
    String b;
    boolean c;

    A() {

    }

    void show() {
        System.out.println(a + " " + b);
    }
}

public class _03defaultConstructor {
    public static void main(String[] args) {
        A r = new A();
        r.show();
    }
}
