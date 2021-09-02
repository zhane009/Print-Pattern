package com.company;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Print {
    public void printPattern() {
        System.out.println("Please use only small letters :D");
        System.out.print("Select a letter from a to e : ");
        Scanner input = new Scanner(System.in);
        String category = input.nextLine();
        System.out.println("");

        PatternA a = new PatternA();
        PatternB b = new PatternB();
        PatternC c = new PatternC();
        PatternE e = new PatternE();
        PatternD d = new PatternD();

        try {
            switch (category) {
                case "a":
                    System.out.println("Printing Pattern A below\n");
                    TimeUnit.SECONDS.sleep(3);
                    a.printA();
                    break;
                case "b":
                    System.out.println("Printing Pattern B below\n");
                    TimeUnit.SECONDS.sleep(3);
                    b.printB();
                    break;
                case "c":
                    System.out.println("Printing Pattern C below\n");
                    TimeUnit.SECONDS.sleep(3);
                    c.printC();
                    break;
                case "d":
                    System.out.println("Printing Pattern D below\n");
                    TimeUnit.SECONDS.sleep(3);
                    d.printD();
                    break;
                case "e":
                    System.out.println("Printing Pattern Ea below\n");
                    TimeUnit.SECONDS.sleep(3);
                    e.printE();
                    break;
                default:
                    System.out.println("Please select a valid option :D\n");
                    TimeUnit.SECONDS.sleep(2);
                    printPattern();
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
