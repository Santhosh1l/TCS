import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        for(int i=1;i<=a/2;i++){
            if(a%i==0){
                sum+=i;
            }
        }
        System.out.println(sum==a);
    }
    static boolean perfec(int a){
        if(a<0){
            return false;
        }
        int sqrt=(int)Math.sqrt(a);
        return (sqrt==a);
    }
}
