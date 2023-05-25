package HOMEWORK9;

import java.util.ArrayList;

/*9. Write program and add all group names in to array and iterates through for
each loop.

 */
public class QUE_9 {
    public static void main(String[] args) {


        ArrayList<String> group_list = new ArrayList<String>();//declare group name
        group_list.add("Selenium");
        group_list.add("Java");
        group_list.add("Postman");
        System.out.println("Arraylist:" + group_list);
        System.out.println();
        //using for each loop
        System.out.println("Iterating over ArrayList using for-each loop:");
        for (String list : group_list) {
            System.out.print(list);
            System.out.print(", ");


        }
    }
}