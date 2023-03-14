package org.example;

//Exercise A
//public class Compiler {
//    public static void main (String[] args){
//        int x = 1;
//        while (x < 10) {
//        x = x +1; //This is the fix
//
//            if (x > 3){
//                System.out.println("big x");
//            }
//        }
//    }
//}
////Exercise B
/*public class Compiler {
    public static void main (String[] args){
        int x = 5;
        while (x > 1) {
            x = x -1;

            if (x < 3){
                System.out.println("small x");
            }
        }
    }
}*/

public class Ch1_Compiler {
    public static void main (String[] args){//This is the fix
        int x = 5;
        while (x > 1) {
            x = x -1;

            if (x < 3){
                System.out.println("small x");
            }
        }
    }
}

