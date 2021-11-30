package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner cave = new Scanner(System.in);
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight");
        System.out.println("Which cave will you go into? (1 or 2)");
        int choice = cave.nextInt();
        try {
            int arr[] = {1,2};
            int opt = arr[choice-1];
            System.out.println("You approach the cave... \nIt is dark and spooky...");
            System.out.println("A large dragon jumps in front of you! He opens his jaws and...");
            if(choice == 1) {
                System.out.println("Gobbles you down in one bite!");
            }else if(choice ==2){
                System.out.println("says \"Hello\"! Welcome to my cave.");
                System.out.println("He shares some of his treasure with you, and you leave safely.");
            }
        } catch (Exception e){
            System.out.println("Caught exception, input is neither 1 or 2.");
        }
    }
}
