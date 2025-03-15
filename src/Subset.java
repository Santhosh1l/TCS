import java.util.*;
public class Subset{
    public static void main(String[] args){

        int arr1[]= {1,2,3};
        int arr2[]={1,2,4,3,5,6};
        if(check(arr1,arr2)){
            System.out.println("Subset");

        }
        else{
            System.out.println("Not");
        }

    }

    static boolean check(int arr1[],int arr2[]){

        HashSet<Integer> set= new HashSet<Integer>();
        for(int i:arr2){set.add(i);}


        for(int i=0;i<arr1.length;i++){
            if(!set.contains(arr1[i])){
                return false;
            }

        }
        return true;
    }

}