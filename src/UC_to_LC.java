import java.util.Scanner;

public class UC_to_LC {
    public static void main(String[] args) {


    Scanner sc= new Scanner(System.in);
    String str=sc.nextLine();
    int n=str.length();
    StringBuilder ans= new StringBuilder();
            for (int i = 0; i < n; i++) {
        int ascii = (int) str.charAt(i);

        if (ascii >= 65 && ascii <= 90)
            ans.append((char)(ascii + 32));

        else if (ascii >= 97 && ascii <= 122)
            ans.append((char)(ascii - 32));

        else if (str.charAt(i) == ' ')
            ans.append(' ');

        System.out.println(ans);
    }
}}