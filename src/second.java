public class second {
    public static void main(String[] args) {
        moin myObj = new moin();
        System.out.println(myObj.poo);
    }
}
//public class Main {
//    // Static method
//    static void myStaticMethod() {
//        System.out.println("Static methods can be called without creating objects");
//    }
//
//    // Public method
//    public void myPublicMethod() {
//        System.out.println("Public methods must be called by creating objects");
//    }
//
//    // Main method
//    public static void main(String[] args) {
//        myStaticMethod(); // Call the static method
//        // myPublicMethod(); This would compile an error
//
//        Main myObj = new Main(); // Create an object of Main
//        myObj.myPublicMethod(); // Call the public method on the object
//    }
//}
// Create a Main class
//public class Main {
//    int x;  // Create a class attribute
//
//    // Create a class constructor for the Main class
//    public Main() {
//        x = 5;  // Set the initial value for the class attribute x
//    }
//
//    public static void main(String[] args) {
//        Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
//        System.out.println(myObj.x); // Print the value of x
//    }
//}
enum Level {
    LOW,
    MEDIUM,
    HIGH
}

//public class Main {
//    public static void main(String[] args) {
//        Level myVar = Level.MEDIUM;
//
//        switch(myVar) {
//            case LOW:
//                System.out.println("Low level");
//                break;
//            case MEDIUM:
//                System.out.println("Medium level");
//                break;
//            case HIGH:
//                System.out.println("High level");
//                break;
//        }
//    }
//}
// Outputs 5