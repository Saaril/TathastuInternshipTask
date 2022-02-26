package com.company;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        int n , firstTerm = 0, secondTerm = 1;
        System.out.println("Enter The Number : ");
        Scanner number = new Scanner(System.in);
        n = number.nextInt();
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

