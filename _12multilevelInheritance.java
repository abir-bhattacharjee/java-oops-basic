class A {
    int a; String b; double c;
    void disp(){
        a = 10; 
        b = "abir";
        c = 10.10;
        System.out.println(a+" "+b+" "+c);
    }
}

class B extends A {
    void show(){
        a = 100; 
        b = "abir";
        c = 100.10;
        System.out.println(a+" "+b+" "+c);
    }
}

class C extends B {
    void live(){
        a = 1000; 
        b = "abir";
        c = 1000.10;
        System.out.println(a+" "+b+" "+c);
    }
}

public class _12multilevelInheritance {
    public static void main(String[] args) {
        C r = new C();
        r.disp();
        r.show();
        r.live();
    }
}
