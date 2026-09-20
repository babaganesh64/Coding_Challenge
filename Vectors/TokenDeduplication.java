/*  Scenario: A session management system receives a list of user authentication tokens. 
    Due to a network glitch, some tokens were recorded multiple times in a row. 
    You must parse the data structure and remove any consecutive duplicates, modifying the memory in-place.
    
    Input Vector: [101, 101, 102, 103, 103, 103, 104]
    Expected Vector State: [101, 102, 103, 104]
    
    Constraint: You must evaluate and remove the duplicates directly within the original Vector. 
    Do not create a second Vector to hold the unique values. Watch out for the index-shifting trap. */

package Vectors;

import java.util.Vector;

public class TokenDeduplication {
    public static void main(String[] args){
        int[] inputs = {101, 101, 102, 103, 103, 104};
        Vector<Integer> v = new Vector<>();
        for(int i=0; i<inputs.length; i++){
            v.add(inputs[i]);
        }
        for(int i=0; i<v.size()-1;){
            if(v.elementAt(i).equals(v.elementAt(i+1))){
                v.remove(i);
            } else{
                i++;
            }
        }
        System.out.println(v);
    }
}
