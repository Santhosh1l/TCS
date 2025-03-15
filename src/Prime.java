import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();;
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isprime(int a){
        if(a<2){
            return false;
        }
        for(int i=2;i<Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return  true;
    }
}
