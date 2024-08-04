interface A {
    void show();
}

interface B {
    void show();
}

public class _26multipleInheritance implements A,B{
    public void show() {
        System.out.println("Interface A and B");
    }
    public static void main(String[] args) {
        _26multipleInheritance r = new _26multipleInheritance();
        r.show();
    }
}
