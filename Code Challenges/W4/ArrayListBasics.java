import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasics {
    
    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(45);
        intList.add(6);
        intList.add(71);
        intList.add(8);
        intList.add(29);
        intList.add(10);
        intList.add(121);
        intList.add(42);
        intList.add(13);
        intList.add(124);
        intList.add(152);

        System.out.println(intList);

        // find min value in ArrayList using Collections
        int min = Collections.min(intList);
        System.out.println("Min value: " + min);
        // find max value in ArrayList
        int max = Collections.max(intList);
        System.out.println("Max value: " + max);


        

    }
}
