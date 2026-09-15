package Vectors;

import java.util.Vector;
class Sample{
    public static void main(String[] args){
        Vector<String> v = new Vector<String>();
        v.add("Apple");
        v.add("Mango");
        v.add("Grapes");
        v.add("Kiwi");
        System.out.println("Values of Vector: "+v);
        v.remove(1);
        v.remove("Kiwi");
        System.out.println("Values of Vector after removing: "+v);
        System.out.println("Size of Vector: "+v.size());
        System.out.println("Capacity of the Vector: "+v.capacity());
    }
}