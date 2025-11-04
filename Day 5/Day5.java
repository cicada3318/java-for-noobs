public class Day5 {

    // Functions in class are called methods.

    static int myFunction(int a) {
        if (a > 52) { // value check
            a += 10;
        } else {
            a += 50;
        }
        System.out.println(a);
        return 3;
    }

    static int myFunction(int a, int b) {
        System.out.println(a * b); // rect
        return a * b;
    }

    static void myFunction(int pi, int r, int k) {
        System.out.println("Good work!"); // greet
    }

    public static void main(String[] args) {

        int marks[] = { 1, 2, 3, 5, 7 };
        System.out.println(marks[2]);

        int[] value = { 1, 2, 44, 5, 7 };
        System.out.println(value[2]);

        // Arrays are treated as objects.

        // METHODS
        System.out.println("\nMETHODS");
        // int a = 52; // local
        // int man = myFunction(100);
        // System.out.println(man);

        // Day5 myObj = new Day5();
        // myObj.myFunction(20);

        // METHOD OVERLOADING --- Method Overloading is a feature in Java where two or
        // more methods have the same name but differ in their parameter list (number,
        // type, or order of parameters).
        myFunction(100); // value check
        myFunction(50, 30); // rect
        myFunction(50, 30, 30); // greet

    }

} // Activity - write a method calculateShape and use method overloading to
  // calculate three different shapes area.
