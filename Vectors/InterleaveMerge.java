/*  Scenario: A video processing engine needs to interleave two separate streams of frame IDs. 
    Stream A contains the primary frames, and Stream B contains the transition frames. 
    You must inject the transition frames from Stream B exactly between the primary frames inside Stream A.
    
    Input Stream A (Vector): [10, 20, 30]
    Input Stream B (Array): int[] streamB = {15, 25};
    Expected Stream A State: [10, 15, 20, 25, 30]
    
    Constraint: You must use the overloaded .add(index, element) method to mutate Stream A. You may assume Stream B will always have exactly one less element than Stream A. */

package Vectors;
import java.io.IOException;
import java.util.Vector;
public class InterleaveMerge {
    public static void main(String[] args) throws IOException{
        Vector<Integer> StreamA = new Vector<>();
        int[] Stream = {10, 20, 30};
        int[] StreamB = {15, 25};
        for(int i=0; i<StreamA.length; i++){
            int index = i;
            StreamA.add(index, StreamB[i]);
        }
        for(int i=0; i<StreamB.length; i++){
            StreamA.add(i, StreamB[i]);
        }
        System.out.println("Vector State after injecting frame IDs: "+ StreamA);
    }
}
