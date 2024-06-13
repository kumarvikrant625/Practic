package binarysearch;

public class checkTest {

    public static void main(String[] args) {
        String str = "Hello World";

        String[] arr = str.split(" ");

        StringBuilder finalStr = new StringBuilder();
        for(int i = 0; i<arr.length; i++){
            System.out.println("Picking " + arr[i]);
            String[] arr2 = arr[i].split("");
            StringBuilder sb = new StringBuilder();
            for(int j = arr2.length-1; j>=0; j--){
                sb.append(arr2[j]);
            }
            finalStr.append(sb);
            finalStr.append(" ");
        }

        System.out.println(finalStr.toString());

    }
}
