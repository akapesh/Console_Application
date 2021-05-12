package com.company;

public class Main {

    public static void main(String[] args) {

        int [] A = {10, 11, 10, 11, 10, 15};
        for (int i = A.length - 1; i >= 3; i--) {
            if (i < -1_000_000 && i >= 1_000_000 ){
                i++;
            }
            System.out.println(A[i]);
        }
    }
}
