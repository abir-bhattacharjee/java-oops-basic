import java.util.Scanner;

interface client {
    void input();
    void output();
}

class _23interface implements client {
    String name; double salary;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        name = sc.nextLine();
        System.out.println("Enter salary : ");
        salary = sc.nextDouble();
        sc.close();
    }

    public void output() {
        System.out.println(name + " " + salary);
    }

    public static void main(String[] args) {
        client c = new _23interface();
        c.input();
        c.output();
    }

}


