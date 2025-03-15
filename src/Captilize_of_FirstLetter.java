import java.util.Scanner;

public class Captilize_of_FirstLetter {
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        String word[]=str.split("\\s+");
        StringBuilder s=new StringBuilder();
        for(String words:word){
            int n= words.length();
            if(words.length()>0){
                s.append(Character.toUpperCase(words.charAt(0))).append(words.substring(1).toLowerCase()).append(" ");


            }
        }


        System.out.println(s.toString());}
}
