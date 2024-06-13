package dsa;

public class IntegerReverse {

    public static int reverse(int x) {
        if(x < 10 && x >= 0)
            return x;
        if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
            return 0;
        int len = String.valueOf(x).length();
        int y = 0;
        while(x != 0){
            if(Math.abs((long)(y*10) + (x%10)) > Integer.MAX_VALUE)
                return 0;
            y = ((y*10)+(x%10));
            x = x/10;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534200079));
    }
}
