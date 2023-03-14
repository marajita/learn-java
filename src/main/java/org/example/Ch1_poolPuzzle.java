package org.example;

public class Ch1_poolPuzzle {
    public static void main(String[]args){
        int x = 0;
        while(x<1){
            x = x + 2;
            if (x<1){
                x = x-1;
            }
            System.out.print("an");
            x = x - 1;

        }
    }
}
