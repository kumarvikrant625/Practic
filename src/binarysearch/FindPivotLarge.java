package binarysearch;

public class FindPivotLarge {

        public static int getPivot(int[] arr){
            int s= 0, e = arr.length - 1;
            int mid = s+(e-s)/2;
            while (s<e){
                if(arr[mid] >= arr[0]){
                    s = mid + 1;
                }else{
                    e= mid;
                }
                mid = s+(e-s)/2;
            }
            return s-1;

        }
        public static void main(String[] args) {
            int[] arr = { 8, 9, 10,11,12 , 1, 2, 3, 4,  5, 6, 7};
            int pivot = getPivot(arr);
            System.out.println("Pivot element index: " + pivot + " Pivot element: " + arr[pivot]);
        }
}
