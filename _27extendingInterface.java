interface Gill {
    void add();
}

interface Raj extends Gill{
    // void add();
    void sub();
}

class Abir implements Raj {
    @Override
    public void add() {
        System.out.println("addition");
    }
    @Override
    public void sub() {
        System.out.println("substraction");
    }
}

public class _27extendingInterface{
    public static void main(String[] args) {
       Raj r = new Abir();
        r.add();
        r.sub();
    }
}
