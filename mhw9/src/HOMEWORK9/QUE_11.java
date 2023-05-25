package HOMEWORK9;

import java.util.ArrayList;

/*
11. Declare global variables of your name, Add all your group names in list, using
for each loop iterate and print ONLY your name.
 */
public class QUE_11 {
    String name = "Madhavi";

    public static void main(String[] args) {


        ArrayList<String> name_list = new ArrayList<String>();//declare group name Arraylist
        name_list.add("Falguni");
        name_list.add("Madhavi");
        name_list.add("Punam");
        name_list.add("Hemi");
        name_list.add("kruti");


        //using for each loop
        System.out.println("Iterating over ArrayList using for-each loop:");
        for (String list : name_list) {}

        System.out.println();
    }
}