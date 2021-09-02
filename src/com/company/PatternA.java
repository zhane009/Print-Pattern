package com.company;

public class PatternA {
    public void printA() {
        System.out.println("        (a)         \n");
        String a = " # *";
        String b = "# * ";
        String firstLine = "";
        String secondLine = "";

        int p,q;

        for (p = 0; p <= 4; p++){
                firstLine += a;
                secondLine += b;
            }

        for (q = 0; q < 4; q++){
                System.out.println(firstLine);
                System.out.println(secondLine);
            }
    }
}
