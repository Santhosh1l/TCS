

import java.util.*;

public class frequenccy {

    public static void main(String args[]){

        int arr[] ={10,5,10,15,10,5};
        int n = arr.length;
        countFreq(arr, n);
        countHashmapfre(arr,n);
    }

    public  static void countHashmapfre(int arr[], int n){

        HashMap <Integer,Integer> frequency= new HashMap<>();
        for(int i=0;i<n;i++){
            frequency.put(arr[i],frequency.getOrDefault(arr[i],0)+1);

        }

for(int i=0;i<frequency.size();i++){
    if(frequency.get(arr[i])>1){
        System.out.print(arr[i]+" "+frequency.get(arr[i]));}
}
    }
    public static void countFreq(int arr[], int n)
    {
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}
