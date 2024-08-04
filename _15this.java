
// public class _15this {
//     int a;
//     _15this(int a) {
//         this.a = a;
//     }

//     void show() {
//         System.out.println(a);
//     }
//     public static void main(String[] args) {
//         _15this r = new _15this(100);
//         r.show();
//     }
// }

public class _15this {
    _15this() {
        System.out.println("Abir");
    }
    _15this(int a) {
        this();
        System.out.println(a);
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        _15this r = new _15this(100);
    }
}
