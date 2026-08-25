/*  Statement: You are writing an algorithm to check the visual balance of a cinematic poster. 
    You want to see if the sum of all the even brightness values in your array is exactly equal to the sum of all 
    the odd brightness values.

    Input array: int[] brightness = {10, 15, 20, 5, 10};
    Expected output: false (Because evens = 40, odds = 20).

    The Challenge: Create evenTotal and oddTotal. Inside your loop, check if the value (not the index) is even 
    using modulo (if (brightness[i] % 2 == 0)). Add to the correct total, and then compare the two totals outside the loop. */

package Coding_Challenge.Arrays_Practice.Basic_Arrays;

public class OddEvenBalance {
    public static void main(String[] args){
        int[] brightness = {10, 15, 20, 5, 10};
        int evenTotal = 0; int oddTotal = 0;
        for(int i=0; i<brightness.length; i++){
            if(brightness[i] % 2 ==0){
                evenTotal = evenTotal+brightness[i];
            } else{
                oddTotal = oddTotal+brightness[i];
            }
        }
        boolean total = (evenTotal==oddTotal)? true : false;
        System.out.println(total);
    }
}
