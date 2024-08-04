class A {
    int x, y;
    String z;

    A(int a, int b) {
        x = a;
        y = b;
    }

    void show() {
        System.out.println(x + " " + y);
    }

}

public class _04parameterizedConstructor {
    public static void main(String[] args) {
        A r = new A(10, 5);
        r.show();
    }
}
