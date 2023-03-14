package org.example;

class Ch2_Dog {

    int size;
    String breed;
    String name;

    void bark(){ // it doesn't have a return statement
        System.out.println("Ruff Ruff");

    }
}
 class Chr_DogTestDrive{
    public static void main(String[] args){
        Ch2_Dog d = new Ch2_Dog();
        d.size = 40;
        d.name ="Bella";
        d.bark();
    }
}
