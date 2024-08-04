abstract class Programming {
    public abstract void Developer();
    public abstract void Rank();
}

abstract class HTML extends Programming{
    @Override
    public void Developer() {
        System.out.println("Tin Berners Lee");
    }
}

class JAVA extends HTML{
    @Override
    public void Rank() {
        System.out.println("James Gosling");
    }
}

public class _22abstractMethod {
    public static void main(String[] args) {
        // Programming h = new JAVA();
        // h.Developer();
        Programming j = new JAVA();
        j.Developer();
        j.Rank();
    }
}
