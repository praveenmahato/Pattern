package com.company.pattern;

import java.util.Scanner;

public class PatternPyramid {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int n= scn.nextInt();
         for (int i=1;i<=n;i++){
             for(int j=n-1;j>=i;j--){
                 System.out.print(" ");
             }
             for(int k=1 ;k<=(i*2)-1;k++){
                 System.out.print("*");
             }
             System.out.println();
         }
    }
}
