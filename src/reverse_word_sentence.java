
import java.util.*;

public class reverse_word_sentence
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String s[]= str.split("\\s+");

        System.out.println(revese(s));}
    static String revese(String s[]) {
        Collections.reverse(Arrays.asList(s));
     return String.join(" ",s);
    }
}
