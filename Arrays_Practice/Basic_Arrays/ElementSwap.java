/*  Statement: A rendering engine loads the background and foreground layers in the wrong order. 
    You need to swap only the very first element (index 0) and the very last element of the array, 
    regardless of how long the array is.

    Input array: int[] layers = {99, 45, 67, 88, 12};
    Expected array state: {12, 45, 67, 88, 99}

    The Challenge: Do not use a loop. Use a temporary variable to swap layers[0] with layers[layers.length - 1]. 
    Then, print the first and last elements to prove it worked. */

package Coding_Challenge.Arrays_Practice.Basic_Arrays;

public class ElementSwap {
    public static void main(String[] args){
        int[] layers = {99, 45, 67, 88, 12};
        int temp = layers[0];
        layers[0] = layers[layers.length-1];
        layers[layers.length-1] = temp;
        for(int layer : layers){
            System.out.print(layer+" ");
        }
    }
}
