import java.util.Arrays;

public class secondlargest {
    public static void main(String[] args) {
        int arr[]={10,10,10};
        Arrays.sort(arr);
        int largest=arr[arr.length-1];
        int secondla=-1;
        for(int i= arr.length-2;i>=0;i--){
            if(largest>secondla && largest!=arr[i]){
                secondla=arr[i];
                break;
            }

        }
        System.out.println(secondla);
    }
}
