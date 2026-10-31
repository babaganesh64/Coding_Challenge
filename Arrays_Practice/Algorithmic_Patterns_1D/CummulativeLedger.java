/*  Scenario: A trading engine needs to visualize the running balance of an account after a 
    series of daily transactions. You must transform the array so that each index contains the 
    sum of all previous transactions up to that point.
    
    Input Array: int[] transactions = {10, -5, 20, -10, 5};
    Expected Array State: [10, 5, 25, 15, 20]
    
    Constraint: Do this in a single pass (O(N)). Modify the array in-place by adding the 
    previous index's value to the current index. 
*/
package Arrays_Practice.Algorithmic_Patterns_1D;
class CummulativeLedger{
    public static void main(String[] args){
        int[] transactions = {10, -5, 20, -10, 5};
        for(int i=1; i<transactions.length; i++){
            transactions[i] = transactions[i]+transactions[i-1];
        }
        for(int transaction : transactions){
            System.out.print(transaction+" ");
        }
    }
}



//Prefix Sum