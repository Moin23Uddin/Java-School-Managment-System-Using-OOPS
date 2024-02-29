//import java.util.Scanner;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");
//        String mo= "python ";
//        String v="Java";
//        String txt= "We are the best \"vikings\" from the north";
//        String txt2= "We are the best \"viking\'s\" from the north";
//
//        System.out.println(txt);
////        int randomNum = (int)(Math.random() * 101);  // 0 to 100
//        System.out.println(txt2);
//        System.out.println(mo.concat(v));
//
//        int moin= 5436;
//        moin=45;
////        long myNum = 15000000000L;
//        int x=67, z=34, p=45;
//        char mygrade='A';
//        char asciibhai=80;
//        String txt1 = "Please locate where 'locate' occurs!";
//        System.out.println(txt1.indexOf("t"));
////        float f1 = 35e3f;
////        double d1 = 12E4d;
////        System.out.println(f1);
////        System.out.println(d1);
////        Scanner S=new Scanner(System.in);
////        int a=S.nextInt();
////        String a=S.nextLine();
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("Okay we are the best" + mo.length());
//            System.out.println("hello" + mo + " " + x + z + p +mygrade+ asciibhai);
//
//            //we are
//            /*  edsfewgesgheoi
//            gergeriughorf
//            geroigjerig
//*/
//        }
////        int io=4;
////        while(io<=10){
////            System.out.println(io);
////            io++;
////        }
////        for (int i = 0; i < 10; i++) {
////            if (i == 4) {
////                continue;
////            }
////            System.out.println(i);
////        }
//
//        String[] trucks={"volvo","BMW","Joss"};
//        int[] trucks2={4,7,44444444};
//        for (int i : trucks2) {
//            System.out.println(i);
//        }
//        for (int i = 0; i < trucks.length; i++) {
//
//            System.out.println(trucks[i]);
//        }
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        cars[0] = "Opel";
//        System.out.println(cars[0]);
//// Now outputs Opel instead of Volvo

//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (String i : cars) {
//            System.out.println(i);
//        }
//        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
//        for (int i = 0; i < myNumbers.length; ++i) {
//            for(int j = 0; j < myNumbers[i].length; ++j) {
//                System.out.println(myNumbers[i][j]);
//            }
//        }


public class Main {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

}