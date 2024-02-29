//import java.time.LocalDateTime;
//public class time {
//    public static void main(String[] args) {
//        LocalDateTime myObj = LocalDateTime.now();
//        System.out.println(myObj);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(cars.get(i));
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        for (String i : cars) {
//            System.out.println(i);
//        }
//    }
//}
//Elements in an ArrayList are actually objects. In the examples above, we created elements (objects) of type "String". Remember that a String in Java is an object (not a primitive type). To use other types, such as int, you must specify an equivalent wrapper class: Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
//import java.util.ArrayList;
//import java.util.Collections;  // Import the Collections class

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        Collections.sort(cars);  // Sort cars
//        for (String i : cars) {
//            System.out.println(i);
//        }
//    }
//}
//import java.util.ArrayList;
//import java.util.Collections;  // Import the Collections class
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(33);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(34);
//        myNumbers.add(8);
//        myNumbers.add(12);
//
//        Collections.sort(myNumbers);  // Sort myNumbers
//
//        for (int i : myNumbers) {
//            System.out.println(i);
//        }
//    }
//}
// Import the HashMap class
//import java.util.HashMap;
//
//public class time {
//    public static void main(String[] args) {
//        // Create a HashMap object called capitalCities
//        HashMap<String, String> capitalCities = new HashMap<String, String>();
//
//        // Add keys and values (Country, City)
//        capitalCities.put("England", "London");
//        capitalCities.put("Germany", "Berlin");
//        capitalCities.put("Norway", "Oslo");
//        capitalCities.put("USA", "Washington DC");
//        System.out.println(capitalCities);
//        String poi=capitalCities.get("Norway");
//        System.out.println(poi);
//    }
    // Print keys
//for (String i : capitalCities.keySet()) {
//        System.out.println(i);
//    }
    // Print values
//for (String i : capitalCities.values()) {
//        System.out.println(i);
//    }
//import java.util.HashMap;
//
//public class time {
//    public static void main(String[] args) {
//
//        // Create a HashMap object called people
//        HashMap<String, Integer> people = new HashMap<String, Integer>();
//
//
//        // Add keys and values (Name, Age)
//        people.put("John", 32);
//        people.put("Steve", 30);
//        people.put("Angie", 33);
//
//        for (String i : people.keySet()) {
//            System.out.println("key: " + i + " value: " + people.get(i));
//        }
//    }
//}
//import java.util.HashSet;
//
//public class time {
//    public static void main(String[] args) {
//
//        // Create a HashSet object called numbers
//        HashSet<Integer> numbers = new HashSet<Integer>();
//
//        // Add values to the set
//        numbers.add(4);
//        numbers.add(7);
//        numbers.add(8);
//
//        // Show which numbers between 1 and 10 are in the set
//        for(int i = 1; i <= 10; i++) {
//            if(numbers.contains(i)) {
//                System.out.println(i + " was found in the set.");
//            } else {
//                System.out.println(i + " was not found in the set.");
//            }
//        }
//    }
//}

import java.util.ArrayList;
import java.util.Iterator;

public class time {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 10) {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}