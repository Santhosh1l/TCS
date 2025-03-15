import java.util.Arrays;
import java.util.HashSet;

public class remove_duplicate {
    public static void main(String[] args) {
        int arr[]={2,3,4,77,99,11,2,3};
        Arrays.sort(arr);
        duplicate(arr);

    }
    static void duplicate(int arr[]){
        HashSet<Integer> du=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            du.add(arr[i]);
        }
        System.out.println(du);
    }
}

