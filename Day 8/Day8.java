// Inheritance and Inheritance in constructors
class Base {
    int x;

    public void Demo() {
        System.out.println("I am in base!!!");
    }

    Base() {
        System.out.println("Base Constructor!");
    }

    Base(int x) {
        System.out.println("Base Constructor with X=" + x);
    }

    Base(int x, int y) {
        System.out.println("Base Constructor with X=" + x + "and Y=" + y);
    }
}

class Derived extends Base {
    // imports all properties & methods of parent class.
    int y;

    Derived() {
        super(5);
        System.out.println("Derived Constructor!");
    }

    Derived(int x) {
        super(5, 41);
        System.out.println("Derived overloaded Constructor!");
    }

}

public class Day8 {
    public static void main(String[] args) {
        // Base b = new Base();
        // b.Demo();
        //////
        Derived d = new Derived(50);
        // d.Demo();
        // d.x = 45;

        // System.out.println(d.x);

    }
}
