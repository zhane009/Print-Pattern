package com.company;

public class PatternE {
    public void printE() {
        System.out.println("        (e)         \n");
        int i, n, q, m = 1, p = 1, size = 8;
        String line = "";
        for (i = 8; i > 0; i--){
            for (n = m; n < 8; n++){
                line += "  ";
            }
            for (q = size; q < 9; q++){
                line += p + " ";
                p++;
            }
            System.out.println(line);
            m++;
            size--;
            p = 1;
            line = "";
        }
    }
}
