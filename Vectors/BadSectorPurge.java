/*  Concept be learnt by this problem : Range Deletion
    Scenario: A file downloading client receives data packets. A parity check reveals that a sector 
    of memory got corrupted during transmission. You must write an algorithm that deletes a specific 
    range of indices—specifically, you must purge exactly three elements starting from index 2.
   
    Input Vector: [10, 20, 999, 999, 999, 60, 70]
    Expected Vector State: [10, 20, 60, 70]
    Constraint: You must write a loop that executes exactly 3 times, using .remove() to slice out 
    the bad sector. Watch the shifting trap! */

package Vectors;
import java.util.Vector;
import java.util.List;
public class BadSectorPurge {
    public static void main(String[] args){
        Vector<Integer> v = new Vector<>(List.of(10, 20, 999, 999, 999, 60, 70));
        for(int i = 0; i<3; i++){
            v.remove(2);
        }
        System.out.println(v);
    }
}
