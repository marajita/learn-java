package org.example;

public class Ch1_PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"23/7", "multie-vitamin", "30,000 foot", "win-win", "front-end", "web-based", "pervasive"};
        String[] wordListTwo = {"emowered", "sticky", "runny", "oriented", "centric", "shared", "target", "focused", "aligned"};
        String[] wordListThree = {"process", "tipping", "space", "mindshare", "portal", "mission", "value", "subject", "object"};
        //find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        //generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        //Building a phrase
        String phrase = wordListOne [rand1] + " " + wordListTwo [rand2] + " " + wordListThree [rand3];
        //Print out the phrase
        System.out.println("What we need is a " + phrase);
    }


}
