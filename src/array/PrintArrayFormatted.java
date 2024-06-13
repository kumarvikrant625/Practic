package array;

public class PrintArrayFormatted {

    private static int maxDigit(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return getDigitCount(max);
    }

    public static int getDigitCount(int num){
        return (int) Math.log10(num) + 1;
    }

    public static void printArray(int[] arr, int col){
        int maxDigit = maxDigit(arr);
        System.out.println("Max digit: " + maxDigit);
        int row = (int) Math.ceil((double)arr.length/col);
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                int index = i*col + j;
                if(index < arr.length){
                    int digitCount = getDigitCount(arr[index]);
                    for(int k=0; k<maxDigit - digitCount; k++){
                        System.out.print(" ");
                    }
                    System.out.print(arr[index] + "| ");
                }
            }
            System.out.println();
            for (int k = 0; k < ((col+1)*maxDigit); k++) {
                if(k % (maxDigit+1) == 0){
                    System.out.print("+");
                    continue;
                }

                System.out.print("-");
            }
            System.out.println();
        }
    }

    public static void main(String... args){
        //array of 25 elements with having values having upto 5 digits
        int[] arr = { 8, 29, 10,111,12 , 1, 2, 343, 4,  15, 9286, 7, 8, 9, 10,13488321,12 , 11, 24, 37, 467,  5, 6666, 77, 8};
        int col = 3;
        printArray(arr, col);

    }
}
