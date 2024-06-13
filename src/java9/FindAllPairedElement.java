package java9;

/**
 * FindUniqueElementInArray
 */

public class FindAllPairedElement {


    public static void main(String[] args) {
        int[] num1 = {1,2,3,5,5,3,2,1,2}; // First number
        int distinct = 0;
       for(int i=0;i<num1.length;i++) {
            distinct = distinct ^ num1[i];
       }
        System.out.println(" Unique Element in array is : "  + distinct);
    }
}
