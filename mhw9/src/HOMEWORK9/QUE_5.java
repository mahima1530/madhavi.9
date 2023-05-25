package HOMEWORK9;

import java.util.ArrayList;

/*5. Write a Java program to test an array list is empty or not. Define array list with
underground tube names

 */
public class QUE_5 {
    public static void main(String[] args) {
        //declare arraylist with underground tube names
        ArrayList<String> tube= new ArrayList<String>();
        tube.add("Piccadilly");
        tube.add("Bakerloo");
        tube.add("metropolitan");
        tube.add("jubilee");
        tube.add("central");
        //checking the test an array list
        System.out.println("Original array list: " + tube);
        System.out.println("Checking the above array list is empty or not! "+tube.isEmpty());
        tube.removeAll(tube);
        System.out.println("Array list after remove all elements "+tube);
        System.out.println("Checking the above array list is empty or not! "+tube.isEmpty());
    }
}




