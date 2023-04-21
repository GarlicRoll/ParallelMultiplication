package org.example;

import java.util.Random;

public class Main {
    
    public static int[][] matrix1 = new int[3][3];
    public static int[][] matrix2 = new int[3][3];
    public static int[][] result = new int[3][3];

    // Filling matrix by random values
    public static void fillMatrix(int[][] matrix) {
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
    }

    // Printing the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Parallel multiplication by Gleb Pimenov.");

        // Creating on thread per row
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        Thread3 thread3 = new Thread3();

        // Filling matrix
        fillMatrix(matrix1);
        fillMatrix(matrix2);

        // Printing matrix
        printMatrix(matrix1);
        printMatrix(matrix2);

        // Starting threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Waiting for completing threads
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Printing result
        printMatrix(result);
    }
}