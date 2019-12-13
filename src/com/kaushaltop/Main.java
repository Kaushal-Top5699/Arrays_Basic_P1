package com.kaushaltop;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        //Give the size or set how many values you are storing in an array
//        int[] myArray = new int[15];
//
//        myArray[5] = 50; //here we storing 50 in 6th position inside array
//
//        assignAndPrintArray(myArray);

        System.out.println("Define the size of array: \r");

        int arraySize = scanner.nextInt();
        scanner.nextLine();

        int[] myArray = getIntegersUsingWhile(arraySize);

        for (int i=0; i<myArray.length; i++) {

            System.out.println("Value at "+i+" position is = "+myArray[i]);

        }

    }

    //Assigning and printing the array values
    public static void assignAndPrintArray(int[] array) {

        for (int i=0; i<array.length; i++) {

            array[i] = i+1;
            System.out.println(array[i]);

        }

    }

    //method returning int[] array type and excepting user values using for loop
    public static int[] getIntegers(int number) {

        int[] values = new int[number];

        System.out.println("Enter "+number+" integer values: \r");

        for (int i=0; i<values.length; i++) {

            System.out.println("Enter value you want to place at "+i+" position: \r");

            values[i] = scanner.nextInt();

        }

        return values;
    }

    //method returning int[] array type and excepting user values using while loop
    public static int[] getIntegersUsingWhile(int number) {

        int[] values = new int[number];

        System.out.println("Enter "+number+" integer values: \r");

        int start = 0;

        while (start < values.length) {

            System.out.println("Enter value you want to place at "+start+" position: \r");

            values[start] = scanner.nextInt();

            start++;

        }
        return values;
    }
}
