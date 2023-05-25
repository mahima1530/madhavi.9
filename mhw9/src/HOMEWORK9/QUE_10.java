package HOMEWORK9;

import java.util.ArrayList;

/*10. Write program and add all group members names in to array and iterates
through for each loop and print your name.

 */
public class QUE_10 {
    public static void main(String[] args) {
        ArrayList<String> name_list = new ArrayList<String>();//declare group name Arraylist
        name_list.add("Falguni");
        name_list.add("Madhavi");
        name_list.add("Punam");
        name_list.add("Hemi");
        name_list.add("kruti");
        System.out.println("Arraylist:" + name_list);
        System.out.println();

        //using for each loop
        System.out.println("Iterating over ArrayList using for-each loop:");
        for (String list : name_list) {
            System.out.print(list);
            System.out.print(", ");
            System.out.println("Madhavi");

        }
    }
}