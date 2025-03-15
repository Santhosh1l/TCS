import java.util.Scanner;

public class tcs_cdde
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int sum=add(n);

        if(r!=0){

            sum*=r;
            sum=reducetosingle(sum);
            System.out.println(sum);}

        else{
            System.out.println("0");
        }
    }
    static int add(int n){
        int l=0;
        while(n>0){
            l+=n%10;
            n=n/10;
        }
        return l;

    }
    static  int reducetosingle(int num){
        while(num>=10){
            num=add(num);
        }
        return num;
    }
}
