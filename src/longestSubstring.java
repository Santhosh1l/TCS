import java.util.HashSet;
import java.util.Scanner;

public class longestSubstring {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        HashSet<Character> se= new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            se.add(c);
        }
        System.out.println(se.size());
    }
}
