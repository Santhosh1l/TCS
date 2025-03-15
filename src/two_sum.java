import java.util.ArrayList;
import java.util.Scanner;

public class two_sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> arr= new ArrayList<>();
        String input=sc.nextLine();
        for(char c : input.toCharArray()){
            arr.add(Character.getNumericValue(c));
        }

    }
}
