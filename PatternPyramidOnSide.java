package com.company.pattern;

import java.util.Scanner;

public class PatternPyramidOnSide {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=n;i>=-n;i--){
            for(int j=n;j>=Math.abs(i);j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
