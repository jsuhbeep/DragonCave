package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(Intro.printIntro());
        Scanner cave = new Scanner(System.in);
        int choice = cave.nextInt();
        Ending.ending(choice);
    }
}