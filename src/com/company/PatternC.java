package com.company;

public class PatternC {
    public void printC() {
        System.out.println("        (c)         \n");
        String a = " #";
        String b = "  ";
        String line = "";

        int n,m,p,q;
        int size = 8;
        q = 8;

        for (n = 8; n > 0; n--){
            for (m = n; m < size; m++){
                line += b;
            }
            for (p = 0; p < q; p++){
                line += a;
            }
            System.out.println(line);
            line = "";
            q--;
        }
    }

}
