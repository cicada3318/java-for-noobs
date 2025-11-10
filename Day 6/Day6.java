class Register {

    // Properties
    String name;
    short roll;
    int phone;

    // Behaviour
    public void printDetails() {
        System.out.println("The name is: " + name);
        System.out.println("The roll is: " + roll);
        System.out.println("The phone is: " + phone);
    }
}

// One file can contain only one public class.

public class Day6 {

    public static void main(String[] args) {
        Register reg = new Register(); // object instanciation

        reg.name = "Rabees Jamal";
        reg.roll = 2145;
        reg.phone = 12345678;

        reg.printDetails();

        Register reg1 = new Register(); // object instanciation
        reg1.name = "Saad";
        reg1.roll = 10014;
        reg1.phone = 454545454;

        reg1.printDetails();

    }
}

// ACTIVITY: Create a class of hospital, give properties like patientName,
// number and disease. Call a mehtod to assign a medicine (panadol, brufen,
// stepsils)