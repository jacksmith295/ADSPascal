package com.company;

import java.util.*;

public class Sol1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //in order to test this program we need to make sure it works for any number of rows
        System.out.println("How many rows do you want to print: ");
        int numLines = input.nextInt();

        printOutput(numLines);
    }

    public static void printOutput(int numLines) {
        for(int line = 1; line <= numLines; line++) {

            int n=1;
            for(int i = 1; i <= line; i++) {

                //by printing before the calculation the first value will always be 1
                System.out.print(n+" ");
                //since (line - i) will always end up equalling 1, and i will always end up equalling n,
                //n * (line - 1) / i = 1 at the end of the inner for loop, completing the line.
                n = n * (line - i) / i;

            }
            System.out.println();
        }
    }
}
