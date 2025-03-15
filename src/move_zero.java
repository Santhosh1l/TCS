import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class move_zero {


 static void endtozero(int arr[]){
     int i=0;
     int j=0;
     int n=arr.length;
     while(i<n){
         if(arr[i]!=0){
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             j++;
         }
         i++;
     }


 }
    public static void main(String[] args) {
       ArrayList<Integer> arr= new ArrayList<>();
       Scanner sc= new Scanner(System.in);
       String input=sc.nextLine();
       input =input.replaceAll("[\\[\\]]","");
       input= input.replaceAll("\"","");
       String []str= input.split(",");
       int []arr1=new int[str.length];

     for(int i=0;i< str.length;i++){
         arr1[i]=Integer.parseInt(str[i]);
     }

     endtozero(arr1);
        for(int i=0;i< arr1.length;i++){
            System.out.print(arr1[i]);
            if(i<arr1.length-1){
                System.out.print(",");

            }
        }



    }
}
