/*  Statement: A cloud-based rendering engine maintains a queue of active jobs. 
    A critical priority render task (ID 999) has just been submitted and must be injected exactly into the second position (index 1) 
    of the queue, pushing all subsequent jobs back without deleting any existing data.
    
    Input Vector State: [100, 200, 300]
    Expected Vector State: [100, 999, 200, 300]

    The Challenge: Use the overloaded .add(index, element) method to force a value into a specific slot. 
    Afterward, loop through the Vector using v.size() and v.get(i) to print the contents and prove the memory shifted correctly. */

package Vectors;
import java.util.Vector;

public class PriorityInject {
    public static void main(String[] args){
        int[] ids = {100, 200, 300};
        Vector<Integer> v = new Vector<>();
        v.add(1, 999);
    }
}
