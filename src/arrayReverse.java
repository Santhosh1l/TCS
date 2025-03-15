import java.util.Arrays;

public class arrayReverse {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        int n=arr.length-1;
        int i=0;
        while(i<n){
           int temp=arr[i];
           arr[i]=arr[n];
           arr[n]=temp;
           i++;
           n--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
