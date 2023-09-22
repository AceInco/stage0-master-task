package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            System.out.println(" ".repeat(cathetusLength - i - 1) + "*".repeat(i+1));
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
