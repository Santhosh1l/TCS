import java.util.Scanner;

public class Strong_number {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum+=fact(r);
            n=n/10;
        }
        if(temp==sum){
            System.out.println("strong");
        }
    }
static int fact(int n){
        int facte=1;
        for(int i=1;i<n;i++){
      facte+=facte*i;
        }
        return facte;
}
}
