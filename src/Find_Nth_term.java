import java.util.Scanner;

public class Find_Nth_term {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        if(n%2==0){
            int output=(int) Math.pow(3,(n-1)/2);
            System.out.println(output);
        }
        else{
            System.out.println((int)Math.pow(2,(n-1)/2));
        }
    }
}
