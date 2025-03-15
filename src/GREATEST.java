import java.util.ArrayList;
import java.util.Scanner;

public class GREATEST {
    public static void main(String[] args) {
       // int arr[]={7,4,8,2,9};

        ArrayList<Integer>arr =new ArrayList<>();
        arr.add(7);
        arr.add(4);
        arr.add(8);
        arr.add(2);
        arr.add(9);
    int count=1;
        int i=0;
        int n=arr.size()-1;
        while(i<n){
            if(arr.get(i)>arr.get(i+1)){
                count++;


            }i++;
        }
        System.out.println(arr.size());
        System.out.println(count);
    }
}
