package HOMEWORK9;

import java.util.ArrayList;

/*3. Write a Java program to create a new array list, add some colours(string) and
printout the collection using for each loop.

 */
public class QUE_3 {
    public static void main(String[] args) {
           ArrayList <String> colour_list = new ArrayList<String>();//declare colours name Arraylist
            colour_list.add("Red");
            colour_list.add("Green");
            colour_list.add("Orange");
            colour_list.add("White");
            colour_list.add("Black");
            System.out.println("Arraylist:" + colour_list);
            System.out.println();
            //using for each loop
        System.out.println("Iterating over ArrayList using for-each loop:");
        for(String list : colour_list) {
            System.out.print(list);
            System.out.print(", ");

        }

        }
    }

