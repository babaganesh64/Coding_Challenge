/*  Scenario: A load balancer holds a queue of server response times (in milliseconds). 
    Any response time greater than 100 is classified as a "lag spike". 
    Your algorithm must extract all lag spikes from the primary queue and move them into a separate "Quarantine" queue.
   
    Input Primary Vector: [45, 120, 88, 205, 15, 99, 101]
    Expected Primary Vector State: [45, 88, 15, 99]
    Expected Quarantine Vector State: [120, 205, 101]
    
    Constraint: When a lag spike is found, you must dynamically .add() it to the Quarantine Vector and immediately .remove() it from the Primary Vector. */

package Vectors;

import java.util.Vector;

public class ThresholdQuarantine {
    public static void main(String[] args){
        int[] primaryarray = {45, 120, 88, 205, 15, 99, 101};
        Vector<Integer> Primary = new Vector<>();
        Vector<Integer> Quarantine = new Vector<>();

        for(int i=0; i<primaryarray.length; i++){
            if(primaryarray[i]>100){
                Quarantine.add(primaryarray[i]);
            } else {
                Primary.add(primaryarray[i]);
            }
        }
        System.out.println("Primary Vector State "+Primary);
        System.out.println("Quarantine Vector State "+Quarantine);
    }

}
