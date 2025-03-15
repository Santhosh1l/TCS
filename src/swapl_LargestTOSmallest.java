public class swapl_LargestTOSmallest {
    public static void main(String[] args) {
        int arr[]= {2,3,12,80,45};
        int largest=arr[0];
        int smallest=arr[0];
        int smindex=0;
        int largindex=0;
        for(int i=0;i< arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
                largindex=i;
            }
            if(smallest>arr[i]){
                smallest=arr[i];
                smindex=i;
            }
        }

        int temp=arr[largindex];
        arr[largindex]=arr[smindex];
        arr[smindex]=temp;
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }
}
