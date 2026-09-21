/*  Scenario: A server metrics dashboard keeps a rolling log of recent connection ping times. 
    The UI can only display a maximum of 5 entries. When a new ping comes in, if the Vector is already at capacity (5), 
    your algorithm must drop the oldest entry (the first one) before appending the new entry to the end.
    
    Input Vector (Current State): [42, 45, 48, 51, 49]
    Incoming Data Stream: int[] newPings = {55, 60};
   
    Expected Final Vector State: [48, 51, 49, 55, 60]
    Constraint: You must loop through the newPings array. For each ping, enforce the capacity limit dynamically using .size(), .remove(), and .add(). */

package Vectors;

public class TheRollingBuffer {
    public static void main(String[] args){
        
    }
}
