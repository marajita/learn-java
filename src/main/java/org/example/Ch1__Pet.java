package org.example;

public class Ch1__Pet {
    public static void main (String[] args) {
        String [] pets = {"Bella", "Essie ", "Ripley"};
        int x = pets.length;
        //System.out.println(x);
        x = (int) 24.6;
        String s = pets [2]; //s is the String "Ripley"
        s = s + " " + "is a dog"; // s is no "Fido is a dog"
        System.out.println(s);
    }
}
