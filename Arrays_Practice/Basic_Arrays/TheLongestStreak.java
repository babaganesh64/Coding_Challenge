/*  Statement: You are tracking a player's stealth takedowns in Sinister Night. 
    The array contains a 1 for a successful takedown and a 0 for getting caught. 
    You need to find the longest uninterrupted streak of successes.

    Input array: int[] takedowns = {1, 1, 0, 1, 1, 1, 0, 1};
    Expected output: 3

    The Challenge: You need two tracking variables: currentStreak and maxStreak. Loop through the array. 
    If the value is 1, increment currentStreak and immediately check if it's bigger than maxStreak. 
    If the value is 0, reset currentStreak back to 0. */

package Coding_Challenge.Arrays_Practice.Basic_Arrays;

public class TheLongestStreak {
    public static void main(String[] args){
        int[] takedowns = {1, 1, 0, 1, 1, 1, 0, 1};
        int currentStreak = 0; int maxStreak = 0;
        for(int i=0; i<takedowns.length; i++){
            if(takedowns[i] == 1){
                currentStreak = currentStreak+1;
                if(currentStreak > maxStreak){
                    maxStreak = maxStreak+1;
                }
            } else {
                currentStreak = 0;
            }
        }
        System.out.println(maxStreak);
    }
}
