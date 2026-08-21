/*  Statement: You are auditing a folder of images meant for a 4:5 aspect ratio layout. 
    Assuming all images are correctly 1080px wide, their height must be 1350px. 
    Print out the heights of any images that are incorrect so they can be fixed.

    Input array: int[] heights = {1350, 1080, 1350, 1920, 1350};
    Expected output:
    1080
    1920

    The Challenge: Loop through the array. Use an if statement to check if the value does not equal (!=) 1350. 
    If it doesn't, print it. */

package Coding_Challenge.Arrays_Practice.Basic_Arrays;

public class CropCheck {
    public static void main(String[] args){
        int[] heights = {1350, 1080, 1350, 1920, 1350};
        for(int height : heights){
            if(height != 1350){
                System.out.println(height);
            }
        }
    }
}
