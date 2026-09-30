/*  Topic be learnt : Circular Shift of indexes
    Scenario: A CPU task scheduler uses a round-robin protocol. After a designated time cycle, 
    the scheduler must take a specific number of active tasks from the absolute front of the queue 
    and cycle them to the absolute back of the queue to give other tasks processing time.
    
    Input Vector: [101, 102, 103, 104, 105]
    Cycle Count: int rotations = 2;
    Expected Vector State: [103, 104, 105, 101, 102]
    
    Constraint: You must use a loop that runs exactly rotations times. In each iteration, 
    extract the task at index 0 and append it to the end of the Vector. */

package Vectors;
import java.util.List;
import java.util.Vector;
public class RoundRobinRotations {
    public static void main(String[] args){
        Vector<Integer> v = new Vector<>(List.of(101, 102, 103, 104, 105));
        int rotations = 2;
        for(int i=0; i<rotations; i++){
            v.addLast(v.elementAt(i));
            v.remove(i);
        }
        System.out.println(v);
    }
}
