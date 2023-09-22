package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        if(cathetusLength == 0){
            return;
        }
        StringBuilder pyramid = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < cathetusLength; i++) {
            if (i + 1 == 1){
                temp.append(1);
                pyramid.append(" ".repeat(cathetusLength - i - 1)).append(temp).append("\n");
            }
            else{
                temp.insert(0, i + 1).append(i + 1);
                pyramid.append(" ".repeat(cathetusLength - i - 1)).append(temp).append("\n");
            }
        }
        System.out.println(pyramid.deleteCharAt(pyramid.length()-1));
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
