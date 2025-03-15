import java.util.Scanner;

public class root {

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int a= sc.nextInt();

            for(int i=1;i<=Math.sqrt(a);i++){
                if(a%i==0){

                    System.out.print(i+"*"+(a/i));
                }
                System.out.println();
            }
        }
    }

