package org.example;

public class Thread1 extends Thread {
    @Override
    public void run() {

        int row = 0;
        System.out.println("Thread 1 started");

        for (int i = row; i <= row; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    Main.result[i][j] = Main.result[i][j] + Main.matrix1[i][k] * Main.matrix2[k][j];
                }
            }
        }
    }
}
