public class Sum_of_contiguous {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-2};

        int current=arr[0];
        int max= arr[0];
        for(int i=1;i<arr.length;i++){
            current=Math.max(current+arr[i],arr[i]);

            max= Math.max(current,max);
        }
        System.out.println(max);
    }
}
