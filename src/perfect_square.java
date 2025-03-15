public class perfect_square {

    public static void main(String[] args) {
        int a = 16;
        int b= (int) Math.sqrt(a);
        int c= b+1;
        if (isPerfectSquare(a)) {
             b=(int) Math.sqrt(a);
             c= b;
        }
        System.out.println(b);
        System.out.println(c);
    }

    public static boolean isPerfectSquare(int number) {
        if (number < 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(number);
        return (sqrt * sqrt == number);
    }
}