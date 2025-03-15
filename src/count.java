import java.util.*;
public class count {
    public static void main(String[] args) {

int count=1;
int arr[]={2,3,2,6};
int max=arr[0];
for(int i=1;i< arr.length;i++){
   if(arr[i]>max){
            count++;
            max=arr[i];
        }
    }

        System.out.println(count);
        System.out.println(max);

}
}