import java.util.Scanner;

public class remove_vowels_from_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ne = s.replaceAll("[aeiouAEIOU]", "");
        System.out.println(ne.trim());

        if (ispali(ne)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    public static boolean ispali(String ne) {
        int i = 0, j = ne.length() - 1;
        while (i <= j) {
            if (ne.charAt(i) != ne.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

