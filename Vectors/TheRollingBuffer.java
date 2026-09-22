/*  Learning Concept with this problem : Capacity Management of a Vector

    Scenario: A server metrics dashboard keeps a rolling log of recent connection ping times. 
    The UI can only display a maximum of 5 entries. When a new ping comes in, if the Vector is already at capacity (5), 
    your algorithm must drop the oldest entry (the first one) before appending the new entry to the end.
    
    Input Vector (Current State): [42, 45, 48, 51, 49]
    Incoming Data Stream: int[] newPings = {55, 60};
   
    Expected Final Vector State: [48, 51, 49, 55, 60]
    Constraint: You must loop through the newPings array. For each ping, enforce the capacity limit dynamically using .size(), .remove(), and .add(). */

package Vectors;
import java.util.Vector;
import java.util.List;

public class TheRollingBuffer {
    public static void main(String[] args){
        int size = 5;
        Vector<Integer> v = new Vector<>(List.of(42, 45, 48, 51, 49));
        int[] newPings = {55, 60};
        for(int i=0; i<newPings.length; i++){
            if(v.size() == size){
                v.remove(0);
                v.add(newPings[i]);
            }
        }
        System.out.println(v);
    }
}
