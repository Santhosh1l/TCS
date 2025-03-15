import java.util.Scanner;

public class max_sum_array {
static int sum(int arr[]){
    int max=arr[0];
    for(int i=1;i< arr.length;i++){
        int sum=0;
        for(int j=i;j< arr.length;j++){
            sum+=arr[j];
        max= Math.max(sum,max);
        }
    }
    return max;
}
















    public static void main(String[] args) {
        // int [] arr={};
        Scanner sc= new Scanner(System.in);

        String str= sc.nextLine();
      str=str.replaceAll("[\\[\\]]","");
      // double quotes:

      str=str.replaceAll("\"","");

        String arr1[]=str.split(",");
        int arr2[]=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            char c= str.charAt(i);
            if(Character.isDigit(c)){
                arr2[i]=Integer.parseInt(arr1[i]);
            }
        }

        int k= sum(arr2);
        System.out.println(k);

    }
}
