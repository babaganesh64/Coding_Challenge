/*  Statement: A data processing pipeline is receiving a stream of incoming telemetry IDs from a server cluster, 
    but the analytics engine only requires the even-numbered IDs to be stored in dynamic memory for further evaluation.
    
    Incoming Data: int[] incoming = {101, 102, 103, 104, 105};
    Expected Vector State: [102, 104]

    The Challenge: Instantiate a Vector<Integer> v = new Vector<>();. Loop through the primitive incoming array. 
    When you find an even number, expand the Vector and store the value dynamically. */

package Arrays_Practice.Vectors;
import java.util.Vector;

public class TheTelemetryFilter {
    public static void main(String[] args){
        int[] incoming = {101, 102, 103, 104, 105};
        Vector<Integer> v = new Vector<Integer>();
        for(int i=0; i<incoming.length; i++){
            if(incoming[i]% 2 == 0){
                v.add(incoming[i]);
            }
        }
        System.out.println(v);
    }
}
