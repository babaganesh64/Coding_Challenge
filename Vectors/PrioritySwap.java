/*  Topic be Learnt : In-Place Swapping
    Scenario: A digital ticketing queue contains standard user IDs and VIP user IDs (designated 
    by the ID 999). A business rule states that any VIP currently in the queue is allowed to skip exactly 
    one person ahead of them.
    
    Input Vector: [10, 999, 20, 30, 999, 40]
    Expected Vector State: [999, 10, 20, 999, 30, 40]
    
    Constraint: You must traverse the Vector. When you find a 999, you must swap it with the element immediately to its left. You may not use .add() or .remove(). You must achieve this strictly using .get() and .set() to overwrite the memory slots. Watch your index boundaries (a VIP at index 0 cannot move forward!). */

package Vectors;
import java.util.Vector;
import java.util.List;
public class PrioritySwap {
    public static void main(String[] args){
        Vector<Integer> v = new Vector<Integer>(List.of(10, 999, 20, 30, 999, 40));
    }
}
