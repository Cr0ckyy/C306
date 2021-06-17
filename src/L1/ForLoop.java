package L1;

import java.util.ArrayList;

public class ForLoop {
    public static void main(String[] args) {

        // Array of Strings
        String[] names = {"John", "May", "Paul", "Peter"};

        // ArrayList of Strings
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("John");
        namesList.add("May");
        namesList.add("Paul");
        namesList.add("Peter");

        /* NORMAL FOR LOOP */
        System.out.println("\n");
        System.out.println("Normal for loop - Array ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        } System.out.println("\n");


        System.out.println("Normal for loop - ArrayList ");
        for (int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i));
        } System.out.println("\n");

        /* ENHANCED FOR LOOP */
        System.out.println("Enhanced for loop - Array ");
        for (String name : names) {
            System.out.println(name);
        } System.out.println("\n");

        System.out.println("Enhanced for loop - ArrayList ");
        for (String name : namesList) {
            System.out.println(name);
        } System.out.println("\n");

    } // main
}
