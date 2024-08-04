abstract class Animal {
    Animal() {
        System.out.println("All animals");
    }
    public abstract void sound();
}

class Dog extends Animal{
    Dog() {
        super();
    }
    public void sound() {
        System.out.println("Dog is Barking");
    }
}

class Lion extends Animal{
    public void sound() {
        System.out.println("Lion is Barking");
    }
}

public class _21abstractClass {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        Lion l  = new Lion();
        l.sound();
    }
}
