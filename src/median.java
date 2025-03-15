import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class median {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input=input.replaceAll("\"","");
        input=input.replaceAll("[\\[\\]]","");
        String str[] = input.split("\\s+");
        int arr[]= new int[str.length];
        for(int i=0;i< str.length;i++){
           arr[i]= Integer.parseInt(str[i]);
        }
for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");}
        }



    }

