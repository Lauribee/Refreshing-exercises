package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number:   ");
        square(sc.nextInt());

        System.out.println("Now enter a symbol of your liking");
        printSymbol(sc.next());

    }

    public static void square(int number) {
        for(int row=0; row<number;row++)
        {
            for (int colum = 0; colum < number ; colum++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void printSymbol(String symbol) {
        System.out.println(symbol);
    }

}
