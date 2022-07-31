package com.Bridgelabz;
public class Javaforloop {

    public static void main(String[] args) {
        int n = 4;

        //outerloop
        for(int i=1; i<=n; i++) {
            //inner loop
            for(int j=1; j<=i; j++) {
                //cell-> (i,j)
                    System.out.print("*");
                }
                System.out.println();
            }
        }


    }