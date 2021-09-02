package com.company;

public class PatternD {
    public void printD() {
        System.out.println("        (d)         \n");
        String line = "";
        int n,p,q;
        int size = 8;
        q = 1;
        for (n = 1; n <= size; n++){
            for (p = q; p > 0; p--){
                line += p + " ";
                }
            System.out.println(line);
            line = "";
            q++;
        }
    }
}
