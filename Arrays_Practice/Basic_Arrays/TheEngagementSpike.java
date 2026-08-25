/*  Statement: You are looking at daily views on a portfolio piece. 
    A "spike" is defined as a day that has strictly more views than the day immediately before it AND the day immediately after it. 
    You need to count how many spikes occurred.

    Input array: int[] views = {50, 120, 80, 90, 150, 100};
    Expected output: 2 (The spikes are 120 and 150).

    The Challenge: You need to check three elements at once (i - 1, i, and i + 1). 
    To prevent crashing out of bounds, your loop must start at int i = 1 and end strictly at i < views.length - 1. */

package Coding_Challenge.Arrays_Practice.Basic_Arrays;

public class TheEngagementSpike {
    public static void main(String[] args){
        int[] views = {50, 120, 80, 90, 150, 100};
        int count = 0;
        for(int i=1; i<views.length-1; i++){
            if(i>1){
                count++;
            }
        }
    }
}
