class A {
    int a;
    double b;
    String c;

    A() {
        a = 100;
        b = 10.12;
        c = "abir";
    }

    A(int x) {
        a = x;
    }

    A(double y, String z) {
        b = y;
        c = z;
    }
}

public class _07constructorOverloading {
    public static void main(String[] args) {
        A r = new A();
        A r2 = new A(10);
        A r3 = new A(20.20, "tani");

        System.out.println(r.a + " " + r.b + " " + r.c);
        System.out.println(r2.a);
        System.out.println(r3.b + " " + r3.c);
    }
}
