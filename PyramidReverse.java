package com.company.pattern;

import java.util.Scanner;

public class PyramidReverse {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        int maxStars = n*2-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=maxStars;k++){
                System.out.print("*");
            }
            maxStars-=2;
            System.out.println();
        }
    }
}
