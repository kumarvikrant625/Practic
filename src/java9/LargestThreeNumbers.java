package java9;


import java.util.PriorityQueue;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        int[] arr = {11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45, 233,67,56,767};
        printThreeLargest(arr);



    }

    public static void printThreeLargest(int[] arr) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(3);
        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > 3) {
                minHeap.poll();
            }
        }

        System.out.println("Three largest elements are:");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }
}
