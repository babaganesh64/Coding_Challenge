/*. Statement: You are analyzing the difficulty curve for a level in Sinister Night. 
    An array holds the number of enemies that spawn in each successive room. 
    You need to calculate the total number of enemies a player will face in the entire level.

    Input array: int[] spawns = {5, 12, 8, 20, 15};
    Expected output: 60
    The Challenge: Create a total variable starting at 0. Loop through the array and add every single element to your total.
*/

package Coding_Challenge.Arrays_Practice;

public class SinisterNightSpawns {
    public static void main(String[] args){
        int[] spawns = {5, 12, 8, 20, 15};
        int total = 0;
        for(int i=0; i<spawns.length; i++){
            total = total+spawns[i];
        }
        System.out.println(total);
    }
}
