import java.util.Scanner;

public class LCM_GCD {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(LCM(a,b));
        System.out.println(gcd(a,b));
    }

    static int LCM(int a,int b){
     return a*b/gcd(a,b);
    }
    static int gcd(int a,int b){
        if (b == 0) {

            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
}
