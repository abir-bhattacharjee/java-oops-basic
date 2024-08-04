
class Student {
    int roll, marks;
    String name;

    void input() {
        System.out.println("Enter roll and marks: ");
    }
}

class Abir extends Student {
    void disp() {
        roll = 1;
        marks = 89;
        name = "Abir";
        System.out.println(roll + " " + name + " " + marks);
    }
}

public class _11simpleInheritance {
    public static void main(String[] args) {
        Abir r = new Abir();
        r.input(); r.disp();
    }
}
