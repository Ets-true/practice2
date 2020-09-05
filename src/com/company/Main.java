package com.company;
import java.util.Random;
import java.lang.Math;
import java.util.Arrays;

public class Main {

    public static int factorial(int x) {
        int res = 1;
        for (int i = 2; i <= x; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {

        // ============================== TASK 1 BEGIN ===================================================

        Random randomGen = new Random();

        int arraySize = randomGen.nextInt(21) + 5;
        int[] array = new int[arraySize];

        System.out.print("ARRAY: ");

        for (int i = 0; i < arraySize; i++) {
            array[i] = randomGen.nextInt(100) + 1;
            System.out.print(array[i] + " ");
        }

        System.out.print("\n");

        int sum = 0;

        for (int element: array) {
            sum += element;
        }

        System.out.println("SUM: " + sum);

        // ============================= TASK 1 END ==================================================

        // ============================ TASK 2 BEGIN =================================================

        System.out.println("\nCOMMAND LINE ARGS: ");

        for (String arg : args) {
            System.out.print(arg + " ");
        }

        System.out.print("\n");

        // ============================ TASK 2 END ====================================================

        // ============================ TASK 3 BEGIN ==================================================

        int seriesSize = 10;
        double seriesElement;
        String seriesElementFormatter;

        System.out.print("HARMONIC SERIES: ");

        for (int i = 1; i <= seriesSize; i++) {
            seriesElement = 1.0/i;
            seriesElementFormatter = String.format("%.6f",seriesElement);
            System.out.print(seriesElementFormatter + " ");
        }

        System.out.print("\n");

        // ========================== TASK 3 END =======================================================

        // ========================== TASK 4 BEGIN =====================================================

        int randArrSize = randomGen.nextInt(21) + 5;
        int[] randArr = new int[randArrSize];

        for (int i = 0; i < randArrSize; i++) {
            randArr[i] = 1 + (int)(Math.random() * 100);
        }

        System.out.print("\nINITIAL RANDOM ARRAY: ");

        for (int element : randArr) {
            System.out.print(element + " ");
        }

        Arrays.sort(randArr);

        System.out.print("\nSORTED RANDOM ARRAY: ");

        for (int element : randArr) {
            System.out.print(element + " ");
        }

        // ========================== TASK 4 END =======================================================

        // ========================== TASK 5 BEGIN =====================================================

        int randNum = randomGen.nextInt(24) + 1;
        int fact = factorial(randNum);

        System.out.println("\n\nGENERATED NUM: " + randNum + "\nFACTORIAL: " + fact);

        // ========================== TASK 5 END =======================================================

    }

}
