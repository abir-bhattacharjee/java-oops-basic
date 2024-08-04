interface client {
    void webDesign();    // public + abstract
    void webDevelop();
}

abstract class RajTech implements client {
    @Override
    public void webDesign() {
        System.out.println("Green, Menu");
    }
}

class RahulTech extends RajTech {
    @Override
    public void webDevelop() {
        System.out.println("HTML, CSS, JS");
    }
}

public class _25interfaceMethod {
    public static void main(String[] args) {
        RahulTech r = new RahulTech();
        r.webDesign();
        r.webDevelop();
    }
}
