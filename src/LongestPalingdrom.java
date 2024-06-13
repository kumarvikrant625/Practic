public class LongestPalingdrom {

    private static boolean checkPalingdrom(char[] arr, int start, int end){

        while(start <= end){
            if(arr[start] != arr[end]){
                return Boolean.FALSE;
            }
            start++;
            end--;
        }
        return Boolean.TRUE;
    }
    public static void main(String[] args) {

        String str = "abacdfgdcaba";
        int[] data = new int[2];

        char[] arr = str.toCharArray();
        int maxpalSize =0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(checkPalingdrom(arr, i, j)){
                    if(maxpalSize < (j-i+1)) {
                        maxpalSize = j - i + 1;
                        data[0] = i;
                        data[1] = j;
                    }
                }
            }
        }

        System.out.println("maxpalSize"+ maxpalSize);

        for(int i = data[0]; i <= data[1]; i++){
            System.out.print(arr[i]);
        }

    }
}
