import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum+=r*r*r;
            n=n/10;

        }
        if(sum==temp){
            System.out.println("amstrong");
        }
    }
}
