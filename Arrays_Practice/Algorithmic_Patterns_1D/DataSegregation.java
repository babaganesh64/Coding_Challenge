/*  Scenario: A memory controller must segregate memory addresses, moving all even-numbered addresses to the front of 
    the array and all odd-numbered addresses to the back. Order within the evens/odds does not matter.
    
    Input Array: int[] memory = {3, 1, 2, 4, 7, 6, 9, 8};
    Expected Array State: [8, 6, 2, 4, 7, 1, 9, 3] (exact order may vary based on swap logic)
    
    Constraint: Use a left pointer and a right pointer. Move them toward the center, swapping an odd on the left with 
    an even on the right whenever they stall. */

package Arrays_Practice.Algorithmic_Patterns_1D;

public class DataSegregation {
    
}
