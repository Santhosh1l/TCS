import java.util.Scanner;

public class largest_word {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine().trim();
        String res="";
        String [] arr=s1.split("\\s+");
        for(String word:arr){
            int n=word.length();
            if(n>res.length()){
                res=word;
            }
        }
        System.out.println(res);

    }
}
