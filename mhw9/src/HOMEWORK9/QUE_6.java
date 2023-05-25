package HOMEWORK9;

import java.util.HashSet;

/*6. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
and if else)

 */
public class QUE_6 {
    public static void main(String[] args) {

        // Create a HashSet object called numbers
        HashSet<Integer> num = new HashSet<Integer>();

        // Add values to the set
        num.add(4);
        num.add(7);
        num.add(8);

        // Show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++) {
            if(num.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}

