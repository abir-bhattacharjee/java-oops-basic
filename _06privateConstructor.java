class _06privateConstructor {
    int a; double b; String c;
    private _06privateConstructor() {
        a = 10; b = 30.56; c = "Abir"; 
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        _06privateConstructor r = new _06privateConstructor();
    }
}


