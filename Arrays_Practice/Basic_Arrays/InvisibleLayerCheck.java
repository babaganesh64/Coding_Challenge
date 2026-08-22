/*  Statement : You are cleaning up a massive project file for a Sinister Night cinematic poster. 
    You have an array representing the opacity percentage of your layers (from 0 to 100). 
    You need to know if you accidentally left any completely hidden layers in the file so you can delete them later.
    
    Input array: int[] opacities = {100, 80, 45, 0, 90, 10};
    Expected output: Hidden layers detected: true

    The Goal: Create a boolean variable called hasHiddenLayer and set it to false. Loop through the array. 
    If you find a layer where the opacity is exactly 0, change your boolean to true and break the loop immediately. 
    Print the boolean at the end. */

package Coding_Challenge.Arrays_Practice.Basic_Arrays;

public class InvisibleLayerCheck {
    public static void main(String[] args){
        int[] opacities = {100, 80, 45, 0, 90, 10};
        boolean hasHiddenlayer = false;
        for(int opacity : opacities){
            if(opacity==0){
                hasHiddenlayer = true;
                System.out.println("Hidden variables detected : "+hasHiddenlayer);
                break;
            }
        }
    }
}
