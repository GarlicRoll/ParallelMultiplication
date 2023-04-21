package org.example;

public class ThreadGeneric extends Thread {

    public int row;

    ThreadGeneric() {
        this.row = 0;
    }

    ThreadGeneric(int row){
        this.row = row;
    }
    @Override
    public void run() {

        System.out.println("Thread " + this.row + " started");

        for (int i = this.row; i <= this.row; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    Main.result[i][j] = Main.result[i][j] + Main.matrix1[i][k] * Main.matrix2[k][j];
                }
            }
        }
    }
}
