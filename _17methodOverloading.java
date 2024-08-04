class A {
    void add() {
        int a = 10, b = 20, c;
        c = a + b;
        System.out.println(c);
    }
    void add(int x, int y) {
        int c = x + y;
        System.out.println(c);
    }
}

public class _17methodOverloading {
    public static void main(String[] args) {
        A r = new A();
        r.add();
        r.add(10, 5);
    }
}

