import java.util.LinkedList;

public class CracketTest {

    public static void mergeLinkedList(LinkedList linkedList1, LinkedList linkedList2){
        LinkedList mergedLinkedList = new LinkedList();
        int min = Math.min(linkedList1.size(), linkedList2.size());
        int i =0;
        while (i < min){
            mergedLinkedList.add(linkedList1.remove(0));
            mergedLinkedList.add(linkedList2.remove(0));
            i++;
        }
        System.out.println(mergedLinkedList);
        System.out.println(linkedList2);
    }


    public static void main(String... arg){

    LinkedList<Integer> linkedList = new LinkedList();
    linkedList.add(1);
    linkedList.add(2);

    LinkedList<Integer> linkedList2 = new LinkedList();

        linkedList2.add(3);
        linkedList2.add(4);
        linkedList2.add(5);


        mergeLinkedList(linkedList, linkedList2);

    }
}
