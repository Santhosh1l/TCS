import java.util.*;
public class max_product_array {
    static int product(ArrayList<Integer> arr){
        int max=arr.get(0);
        for(int i=0;i<arr.size();i++){
            int product=arr.get(i);
            for(int j=i;j< arr.size();j++){
                product*=arr.get(j);
                max=  Math.max(product,max);

            }

        }

        return max;
    }



    public static void main(String[] args) {
       // int [] arr={};
        Scanner sc= new Scanner(System.in);

        String str= sc.nextLine();
        str=str.replaceAll("[\\[\\]]","");
        str=str.replaceAll("\"","");
// \\s+

        String arr1[]=str.split("\\s+");
      //  int arr2[]=new int[arr1.length];

        ArrayList<Integer> arr2= new ArrayList<>();
        for(String s:arr1){
            arr2.add(Integer.parseInt(s));
        }
        System.out.println(arr2);
        int k= product(arr2);

    }


}
