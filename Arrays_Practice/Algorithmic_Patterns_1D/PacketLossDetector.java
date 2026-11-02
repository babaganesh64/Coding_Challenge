/*  Scenario: A server was supposed to receive a sequential stream of packets numbered exactly from 0 to N. 
    One packet was dropped during transmission. Find the missing packet ID without sorting the array.
    
    Input Array: int[] packets = {3, 0, 1, 4, 6, 2}; (N = 6, meaning it should have 0 through 6)
    Expected Output: 5
    
    Constraint: Do not use nested loops to search. Use Gauss's formula for the sum of a sequence: 
    (N * (N + 1)) / 2. Calculate what the sum should be, then subtract the actual numbers in the array. */
package Arrays_Practice.Algorithmic_Patterns_1D;

public class PacketLossDetector {
    
}
