package HOMEWORK9;
/*4. Write a Java program to iterate through all elements in an array list using
Iterator.

 */

import java.util.ArrayList;
import java.util.Iterator;

public class QUE_4 {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        Iterator I = numbers.iterator();//Using iterator
        System.out.println("The ArrayList numbers are:");
        while (I.hasNext()) {
            System.out.println(I.next());
        }


    }
}