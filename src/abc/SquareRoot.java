package abc;

public class SquareRoot {

    public static void main(String... args){
        int [] arr = {10,15,17,16,20};
        for(int i =0; i< arr.length; i++){
            int val = arr[i];
            for(int j =1 ; j < val/2; j++){
                if(j*j == val){
                    System.out.println("square root of "+ val +" is " +j);
                    break;
                }else if (j*j > val) {
                    System.out.println("square root of "+ val +" is " + (j -1));
                    break;
                }
            }
        }
    }

}