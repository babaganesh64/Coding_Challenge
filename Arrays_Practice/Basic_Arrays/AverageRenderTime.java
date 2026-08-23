/*  Statement: You are benchmarking a new rendering engine for your 3D models. 
    You have an array tracking how many seconds it took to render each frame. 
    You need to find the exact average render time.

    Input array: int[] renderTimes = {10, 15, 12, 18, 14};
    Expected output: 13.8

    The Challenge: First, find the sum of all elements. Then, divide by the array's length. 
    Hint: Because you are dealing with integers, Java will chop off the decimal and just say 13. 
    To get 13.8, you need to make either the sum or the length a double before you divide! */

package Coding_Challenge.Arrays_Practice.Basic_Arrays;

public class AverageRenderTime {
    public static void main(String[] args){
        int[] renderTimes = {10, 15, 12, 18, 14};
        double sum = 0;
        for(int i=0; i<renderTimes.length; i++){
            sum = sum+renderTimes[i];
        }
        double total = sum/renderTimes.length;
        System.out.println(total);
    }
}
