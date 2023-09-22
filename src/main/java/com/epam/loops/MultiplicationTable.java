package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d x %d = %d%n",i+1, numberTableToPrint, (i+1) * numberTableToPrint);
        }
    }

}
