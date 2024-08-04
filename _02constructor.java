class A {
    int a;
    String name;

    // A() {
    //     a = 0;
    //     name = null;
    // }

    void show() {
        System.out.println(a + " " + name);
    }
}

public class _02constructor {
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}
