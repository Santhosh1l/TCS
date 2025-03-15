
import java.io.BufferedReader;
import java.util.*;
public class Majority_Element{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();
        input = input.replaceAll("[\\[\\]]","");
        input=input.replaceAll("\"","");
        String [] str= input.split(",\\s+");
        int arr[]= new int[str.length];
        for(int i=0;i< arr.length;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        System.out.println(majorityele(arr));
    }
    static int majorityele(int arr[]){
        HashMap<Integer, Integer> count= new HashMap<>();
        int n=arr.length;
        for(int num:arr){
            count.put(num,count.getOrDefault(num,0)+1);
            if(count.get(num)>n/2){
                return num;
            }
        }
        return -1;
    }
}
