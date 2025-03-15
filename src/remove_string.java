import java.util.HashSet;
import java.util.Scanner;

public class remove_string {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1= sc.nextLine();
        String s2=sc.nextLine();
        HashSet<Character> set= new HashSet<>();
        StringBuilder s=new StringBuilder();
        for(char c:s2.toCharArray()){
            set.add(c);
        }
        for(char c:s1.toCharArray()){
            if(!set.contains(c)){
                s.append(c);
            }
        }
        System.out.println(s.toString());
    }
}
