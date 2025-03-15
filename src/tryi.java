import java.util.ArrayList;
import java.util.Scanner;

public class tryi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // Read the input as a string


       input = input.replaceAll("[\\[\\]]", "");
        //input = input.replaceAll("[{}]","");
        System.out.println(input);
        String[] numbers = input.split(",\\s*");

        // Convert to ArrayList<Integer>
        ArrayList<Integer> arr = new ArrayList<>();
        for (String num : numbers) {
            arr.add(Integer.parseInt(num));
        }

        // Print the ArrayList to verify
        System.out.println(arr);

        for(int i= 2;i<arr.size();i+=3){

            System.out.println(arr.get(i));
        }
}}
