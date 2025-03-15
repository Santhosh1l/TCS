import java.util.*;
public class palindrome {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

    if(s.equals(new StringBuilder(s).reverse().toString())){
        System.out.println("palindrome");
    }

    }}




