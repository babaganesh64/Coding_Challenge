/*  Statement: A file system utility is running a cleanup operation on a list of memory pointers. 
    The algorithm must locate and remove any pointer in the data structure that evaluates to 0 
    (indicating a dead or corrupted link).

    Input Vector State: [10, 0, 20, 0, 0, 30]
    Expected Vector State: [10, 20, 30]

    The Challenge: Use v.remove(i) to delete the zeros.
    Architectural Warning: In a dynamic array, when you remove the item at index 1, 
    the item at index 2 instantly slides left to become the new index 1. If your loop blindly 
    marches forward (i++), you will skip evaluating the element that just slid into your current spot! */

package Vectors;

import java.util.Vector;

public class CorruptedPointer {
    public static void main(String[] args){
        int[] inputs = {10, 0, 20, 0, 0, 30};
        Vector<Integer> v = new Vector<>();
        for(int input : inputs){
            v.add(input);
        }
        for(int i=v.size()-1; i>=0; i--){
            if(inputs[i] == 0){
                v.remove(i);
            }
        }
        System.out.println(v);
    }
}
