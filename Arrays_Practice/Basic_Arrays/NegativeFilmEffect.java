/*  Statement: You are creating a creepy, inverted negative effect for a Sinister Night asset. 
    You need to invert the grayscale values (which range from 0 to 255) by subtracting the current value from 255.

    Input array: int[] grayscale = {0, 100, 255, 55};
    Expected array state: {255, 155, 0, 200}

    The Challenge: Loop through the array and modify it in-place. Set grayscale[i] equal to 255 - grayscale[i]. 
    Print the array afterward to verify.*/

package Coding_Challenge.Arrays_Practice.Basic_Arrays;

public class NegativeFilmEffect {
    public static void main(String[] args){
        int[] grayscale = {0, 100, 255, 55};
        for(int i=0; i < grayscale.length; i++){
            if(grayscale[i] != 255){
                grayscale[i] = (255 - grayscale[i]);
            } else {
                grayscale[i] = 0;
            }
        }
        for(int j=0; j<grayscale.length; j++){
            System.out.print(grayscale[j] + " ");
        }
    }
}
