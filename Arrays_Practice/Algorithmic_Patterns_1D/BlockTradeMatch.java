/*  Scenario: A dark pool exchange is looking to match buy and sell orders. You are given a sorted array 
    of order sizes and a target block size. You must find if there are exactly two orders that add up 
    to the target.

    Input Array: int[] orders = {10, 20, 35, 50, 75, 80};
    Target: 70
    Expected Output: 20 and 50 (or their indices)
    
    Constraint: You cannot use nested loops (O(N^2)). Because the array is sorted, you must place one 
    pointer at the start (index 0) and one at the end (index length-1), moving them inward based on 
    whether their sum is too large or too small. */

package Arrays_Practice.Algorithmic_Patterns_1D;

public class BlockTradeMatch {
    public static void main(String[] args){
        int[] orders = {10, 20, 35, 50, 75, 80};
        int target = 70;
        int left = 0;
        int right = orders.length-1;
        while(orders[left]<orders[right]){
            int currentsum = orders[left]+orders[right];
            if(currentsum == target){
                System.out.println(orders[left]+" and "+orders[right]);
                break;
            } else if(currentsum > target){
                right--;
            } else{
                left++;
            }
        }
    }
}


//Two pointers