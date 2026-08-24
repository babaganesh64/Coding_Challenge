/*  Statement: You are coding a custom two-column gallery layout for the BondCraft Studios website. 
    You have an array of image ID numbers. The layout logic is simple: images at even index numbers (0, 2, 4...) go in the left column, 
    and odd indices go in the right column. You need to print out just the IDs destined for the left column.
    
    Input array: int[] imageIDs = {101, 102, 103, 104, 105, 106};
    Expected output:
    101
    103
    105

    The Goal: There are two ways to solve this. You can either use a standard loop and an if statement to check if the index i is even (i % 2 == 0), 
    OR you can change the way your loop increments so it skips by 2 every time instead of by 1. Try to figure out either way! */

package Coding_Challenge.Arrays_Practice.Basic_Arrays;

public class TheLeftcolumnsorter {
    public static void main(String[] args){
        int[] imageIDs = {101, 102, 103, 104, 105, 106};
        for(int i=0; i<imageIDs.length; i++){
            if(i%2==0){
                System.out.println(imageIDs[i]);
            }
        }
    }
}
