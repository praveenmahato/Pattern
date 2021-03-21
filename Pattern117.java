package com.company.pattern;

import java.util.Scanner;

public class Pattern117 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k = 5;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
