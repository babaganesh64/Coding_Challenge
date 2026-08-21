/*  Statement: You are applying a high-contrast threshold to a digital poster. 
    You want to calculate the total combined brightness of only the pixels that are already bright (value greater than 50).
    
    Input array: int[] pixels = {10, 60, 20, 90, 45, 100};
    Expected output: 250 (which is 60 + 90 + 100)

    The Challenge: Create a counter variable. Loop through the array, 
    check if the value is > 50, and if so, add it to your total. */

package Coding_Challenge.Arrays_Practice.Basic_Arrays;

public class HighContrastFilter {
    public static void main(String[] args){
        int[] pixels = {10, 60, 20, 90, 45, 100};
        int total = 0;
        for(int pixel : pixels){
            if(pixel > 50){
                total = total + pixel;
            }
        }
    System.out.println(total);
    }
}
