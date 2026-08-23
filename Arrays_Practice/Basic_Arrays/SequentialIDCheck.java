/*  Statement: BondCraft Studios requires asset files to be imported in perfectly sequential order (smallest ID to largest). 
    You need to write an algorithm to verify if an array of IDs is sorted correctly.

    Input array: int[] assetIDs = {1001, 1005, 1008, 1012, 1020};
    Expected output: true (If an ID was out of place, like 1015 appearing before 1012, it would print false).

    The Challenge: Create a boolean isSorted = true;. Loop through the array and compare each element to the next element (assetIDs[i] > assetIDs[i + 1]). 
    If the current one is bigger, it's out of order! Change isSorted to false and break.

    Crucial Hint: If you loop all the way to the end, checking i + 1 will cause an ArrayIndexOutOfBoundsException. 
    Your loop condition needs to stop one step early: i < assetIDs.length - 1. */

package Coding_Challenge.Arrays_Practice.Basic_Arrays;

public class SequentialIDCheck {
    public static void main(String[] args){
        int[] assetIDs = {1001, 1005, 1008, 1012, 1020};
        boolean isSorted = true;
        for(int i =0; i < assetIDs.length-1; i++){
            if(assetIDs[i+1] > assetIDs[i]){
                isSorted = true;
            } else {
                isSorted = false;
            }
        }
        System.out.println(isSorted);
    }
}
