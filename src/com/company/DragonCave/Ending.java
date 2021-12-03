package com.company;
public class Ending {
    public static void ending(int choice) {
        try {
            System.out.println("You approach the cave... \nIt is dark and spooky...");
            System.out.println("A large dragon jumps in front of you! He opens his jaws and...");
            if (choice == 1) {
                System.out.println("Gobbles you down in one bite!");
            } else if (choice == 2) {
                System.out.println("says \"Hello\"! Welcome to my cave.");
                System.out.println("He shares some of his treasure with you, and you leave safely.");
            }
        } catch (Exception e) {
            System.out.println("Caught exception, input is neither 1 or 2.");
        }
    }
}