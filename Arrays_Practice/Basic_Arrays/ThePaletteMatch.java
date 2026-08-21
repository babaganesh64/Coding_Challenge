/* Statement: You are standardizing the branding for your Studio. 
   You have an array of integer color codes used across a website. 
   You need to count exactly how many times the primary brand color (code 8080) appears in the design.

   Input array: int[] colors = {8080, 2121, 9090, 8080, 8080, 1111};
   Expected output: 3
   The Challenge: Write a loop with a counter to find and count the exact matches of the target variable 8080.
*/

package Coding_Challenge.Arrays_Practice.Basic_Arrays;

public class ThePaletteMatch {
    public static void main(String[] args){
        int[] colors = {8080, 2121, 8080, 8080, 1111};
        int count = 0;
        for(int color : colors){
            if(color==8080)
                count++;
        }
        System.out.println(count);
    }
}
