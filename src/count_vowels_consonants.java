import java.util.Scanner;

public class count_vowels_consonants {
    public static void main(String[] args) {

        int no=0;
        int vo=0;
        int space=0;
        int co=0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s=s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') { // Check if 'c' is a vowel
                vo++;
            }else if (Character.isDigit(c)) { // Check if 'c' is a digit
                no++;
            }

            else if(Character.isLetter(c)){
                co++;
            }
            else if(Character.isSpace(c)){
                space++;
            }
        }
        System.out.println(co+""+no+""+vo);
        System.out.println(space);
       }
    }

