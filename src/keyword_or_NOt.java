import java.util.Scanner;

public class keyword_or_NOt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();

        String arr[]={
                "break","case","continue","default","defer","else"
        };
        int a=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i].equals(s)){
                a=1;
            }

        }
        if(a==0){
            System.out.println("Not");
        }
        else{
            System.out.println("yes");
        }
    }
}
