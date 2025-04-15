package cie;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();

        System.out.println("Enter second number : ");
        int n2 = sc.nextInt();

        System.out.println("Addition = "+(n1+n2));

        System.out.println("Subtraction = "+(n1-n2));

        System.out.println("Multiplication = "+(n1*n2));

        System.out.println("Division = "+(n1/n2));

        System.out.println("This is the master branch");

        System.out.println("Modulo = "+(n1%n2));

        System.out.println("New line added ");

        System.out.println("One more line added from GitHub");

        sc.close();
    }
}
