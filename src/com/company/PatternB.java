package com.company;

public class PatternB {
    public void printB() {
        System.out.println("        (b)         \n");
        String a = "# ";
        String line = "";

        int n,m,p;
        p = 8;

        for (n = 0; n < 8; n++){
            for (m = 0; m < p; m++){
                line += a;
            }
            System.out.println(line);
            line = "";
            p--;
        }
    }

}
