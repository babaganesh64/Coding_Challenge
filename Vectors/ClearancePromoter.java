/*  Concept be learnt by this Problem : Forward Injection of element

    Scenario: An e-commerce platform has a queue of product IDs. Any product ID ending in 99 
    (e.g., 299, 599) is flagged as a clearance item. To boost visibility, the marketing engine requires 
    you to duplicate every clearance item so it appears twice in a row in the feed.
    
    Input Vector: [150, 299, 350, 499, 500]
    Expected Vector State: [150, 299, 299, 350, 499, 499, 500]
    
    Constraint: You must use .add(index, element) to mutate the list in-place.
    Architectural Warning: Think very carefully about the index-shifting trap when you inject a duplicate. If you inject 299 right next to the original 299, and then your loop naturally marches forward i++, what value will it evaluate next? */

package Vectors;

public class ClearancePromoter {
    public static void main(String[] args){

    }
}
