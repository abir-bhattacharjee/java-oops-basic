 class _37throw {

    void division(int a, int b) throws ArithmeticException  {
        if(b==0) {
            throw new ArithmeticException();
        }
        else {
            int c = a/b;
            System.out.println(c);
        }
    }
    
    public static void main(String[] args) throws ArithmeticException {
        _37throw r = new _37throw();
        try {
            r.division(10, 0);
            
        } catch (Exception e) {
            System.out.println("Value of b is zero");
        }       
    }
}
