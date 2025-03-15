import java.util.Arrays;
import java.util.HashSet;

public class Merge {

    public static void main(String[] args) {
        int arr1[]={1,3,5,7};
        int arr2[]={0,1,2,3,5,6,7};
        int arr3[]= new int[arr1.length+arr2.length];
        int n=arr1.length;
        int m=arr2.length;
        int i=0;
        int j=0;
        int ind3=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                arr3[ind3++]=arr1[i++];
            }
            else{
                arr3[ind3++]=arr2[j++];
            }
        }
        while(i<n){
            arr3[ind3++]=arr1[i++];
        }
        while(j<m){
            arr3[ind3++]=arr2[j++];
        }
        HashSet<Integer> dup= new HashSet<Integer>();
        for(int z:arr3){
            dup.add(arr3[z]);

        }

     System.out.println("Main function:"+ Arrays.toString(arr3));
        //System.out.println(dup);
        withoutextraspace(arr1,arr2);
    }
    static void withoutextraspace(int arr1[],int arr2[]){

        int i=arr1.length-1;
        int j=0;
        while(i>=0 && j< arr2.length){
            if(arr1[i]<arr2[j]){
                i--;
            }
            else{
                int temp=arr2[j];
                arr2[j]=arr1[i];
                arr1[i]=temp;
                i--;
                j++;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
