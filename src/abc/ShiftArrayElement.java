package abc;

public class ShiftArrayElement {

    public static void main(String... args){

        int[] arr = {1,2,3,4,5,6,7,8};

        int rotate = 3;

        int [] arrnew = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            int shiftVal = i-rotate;
            if(shiftVal < 0){
                shiftVal+= arr.length;
            }
            arrnew[shiftVal] = arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arrnew[i]  +" ");
        }

    }
}
