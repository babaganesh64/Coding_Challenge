/*  Statement: You are analyzing the engagement scores of recent TheDawnOriginals poster designs. 
    You already know how to find the highest score, but now you need to find the second highest score to see which design is the true runner-up.
    
    Input array: int[] scores = {45, 90, 20, 75, 100, 85};
    Expected output: 90

    The Challenge: You will need two variables (e.g., highest and secondHighest), both starting at 0. 
    As you loop through the array, if you find a number bigger than highest, you must do a hand-off: 
    your old highest drops down to become your new secondHighest, and the new number becomes the highest. */

package Coding_Challenge.Arrays_Practice.Basic_Arrays;

public class TheRunnerUp {
    public static void main(String[] args){
        int[] scores = {45, 90, 20, 75, 100, 85};
        int highest=0, secondHighest=0;
        for(int i=0; i<scores.length; i++){
            if(scores[i] > highest){
                highest = scores[i];
            }
        }
        for(int j=0; j<scores.length; j++){
            if(scores[j] > secondHighest && scores[j] < highest){
                secondHighest = scores[j];
            }
        }
        System.out.println(secondHighest);
    }
}
