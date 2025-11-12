// class AM {
//     private int x;
//     private String name;

//     public void setId(int p) {
//         x = p;
//     }

//     public void getId() {
//         System.out.println(x);
//     }

// }
class Saad {
    int num;
    String name;
    int cnic;

    // Do not give return type in constructor
    // name is same as the class name.
    public Saad(String str, int id) {
        name = str;
        num = id;
        System.out.println("Hellow!");
    }

    public Saad(String str, int id, int card) {
        name = str;
        num = id;
        cnic = card;

        System.out.println("Pakistani!");
    }

    public void printDetails() {
        System.out.println(name);
        System.out.println(num);
        System.out.println(cnic);
    }

}

public class Day7 {
    public static void main(String[] args) {
        // AM demo = new AM();
        // demo.setId(40);
        // demo.getId();

        Saad person = new Saad("Saad", 74510);

        person.printDetails();

        Saad person2 = new Saad("Fahad", 10000, 784510);
        person2.printDetails();
    }

}

// Write a class with constructor overloading of user data in hospital. check if
// he is pakistani take cnic, so give him discount on meds, else charge him 100.
// hide patient disease via private keyword, use getters and setters.
// make copies of 5 patients.
