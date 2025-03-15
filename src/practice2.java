import java.util.Arrays;
import java.util.HashSet;

public class practice2 {
        public static void main(String[] args) {
                String s="hello world";
                StringBuilder res= new StringBuilder();
                String[]arr= s.split("\\s+");
                for(String c:arr){
                        int n=c.length();
                        res.append(Character.toUpperCase(c.charAt(0)));
                        res.append(c.substring(1,n-1).toLowerCase()).append(Character.toUpperCase(c.charAt(n-1)));
                        res.append(" ");
                }
                System.out.println(res);
        }
}