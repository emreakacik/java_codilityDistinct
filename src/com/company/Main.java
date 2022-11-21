package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int A[]=new int[] {1,2,3,4,4,5};
        System.out.println(solutions(A));

    }

    public static int solutions(int[] A){
        Arrays.sort(A);
        int sayac=0;
        for (int i =1;i<A.length;i++){
            if(A[i]==A[i-1]){
                sayac++;
            }
        }
        return A.length-sayac;

    }
}
