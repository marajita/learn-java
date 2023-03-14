package org.example;

public class Ch1_MixedMsges {
    public static void main (String[] args){
        int x = 0;
        int y = 0;
        while (x<5){
            y = y + 2;
            if(y>4){
                y=y-1;
            }
            System.out.print(x + " " + y + " " );
            x = x + 1;
        }

    }
}
 /*  if (y <  5){ // This block of code prints out : 0 2 1 4 3 6 4 8
                x = x + 1;
                if (y<3){
                    x = x -1;
                }
            }
            y = y +2;*/

/* y = x-y;*/ // This block code prints out : 0 0 1 1 2 1 3 2 4 2

/*y = y + x;*/ //This block of code prints: 0 0 1 1 2 3 3 6 4 10
/* x = x +1;//THis block code prints: 1 1 3 4 5 9
  y = y + x;
   */
