package com.Bridgelabz;
import java.util.*;

public class Javaforloop {

    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        //outerloop
        for (int i = 1; i <= m; i++) {
            //inner loop
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}