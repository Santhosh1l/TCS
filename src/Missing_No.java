import java.util.Scanner;

public class Missing_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        miss(arr,n);
    for(int i=0;i< arr.length-1;i++){
        int first=arr[i];
        int second=arr[i+1];
        if(second-first>1){
            for(int j=first+1;j<second;j++){
                System.out.println(j);
            }
        }
    }


        }
    static void miss(int arr[],int n) {
    int sum=0;
    int total= (n+1)*(n+2)/2;
    for(int i:arr){
        sum+=i;
    }
        System.out.println(total-sum);
    }
}
