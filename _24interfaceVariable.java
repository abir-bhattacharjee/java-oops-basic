interface customerRaj{
    int amt = 5;
    void purchase();
}

class sellerSanju implements customerRaj{
    @Override
    public void purchase() {
        // amt = 7;
        System.out.println("Raj needs " + amt + "kg rice");
    }
}

public class _24interfaceVariable {
    public static void main(String[] args) {
        customerRaj c = new sellerSanju();
        c.purchase();
    }
}
