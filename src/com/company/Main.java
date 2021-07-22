package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Add
        System.out.println("Type in first number: ");
        int firstAdd = sc.nextInt();
        System.out.println("Type in second number: ");
        int secondAdd = sc.nextInt();
        Operator add = new Add(firstAdd, secondAdd);
        add.answer();

        //Subtract
        System.out.println("Type in minuend: ");
        int minuend = sc.nextInt();
        System.out.println("Type in subtrahend: ");
        int subtrahend = sc.nextInt();
        Operator subtract = new Subtract(minuend, subtrahend);
        subtract.answer();

        //Multiplication
        System.out.println("Type in multiplicand: ");
        int multiplicand = sc.nextInt();
        System.out.println("Type in multiplicator: ");
        int multiplicator = sc.nextInt();
        Operator multiply = new Multiplication(multiplicand, multiplicator);
        multiply.answer();

        //Square
        System.out.println("Enter the number you want to square: ");
        Operator square = new Square(sc.nextFloat());
        square.answer();

        //Square root
        System.out.println("Enter number you want to find square root: ");
        Operator sqrt = new SquareRoot(sc.nextFloat());
        sqrt.answer();
    }
}
