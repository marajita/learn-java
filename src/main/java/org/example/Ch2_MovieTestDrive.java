package org.example;

class Ch2_Movie {
    String title;
    String genre;
    int rating;
    void playIt(){
        System.out.println("Playing the movie");
    }
}
public class Ch2_MovieTestDrive{
    public static void main (String[]args){
        Ch2_Movie one = new Ch2_Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;
        Ch2_Movie two = new Ch2_Movie();
        two.title = "Lost in the cubical Space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();
        Ch2_Movie three = new Ch2_Movie();
        three.title = "Byte Club";
        three.genre = "Romance";
        three.rating = 123;
    }
}