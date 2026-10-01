/*  Concept be learnt : Backward Traversal
    Scenario: A session manager holds active user IDs. Due to an upstream timeout, several sessions 
    have gone stale, represented by negative ID numbers. You must locate and destroy all negative 
    numbers in the queue.
    
    Input Vector: [15, -1, -2, 44, 88, -9, 100]
    Expected Vector State: [15, 44, 88, 100]
    
    Constraint: You must solve the index-shifting trap by using Approach A: The Backwards Loop. 
    Your for loop must start at v.size() - 1 and decrement (i--) down to 0. Use .remove(i) when a 
    negative number is found. */

package Vectors;

public class StaleSessionPurge {
    
}
