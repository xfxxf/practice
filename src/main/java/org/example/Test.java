package org.example;

public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(j + "*" + j + "=" + (i*j) + " ");
            }
            System.out.println();
        }
    }
}
