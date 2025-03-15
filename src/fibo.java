public class fibo {

    public static void main(String[] args) {
        int n=5;

        int first=0;
        int second=1;
        if(n==0){
            System.out.println(0);
        }
        else {
            for(int i=1;i<=n;i++){
            int next=first+second;
            first=second;
            second=next;

        }
        }
        System.out.println(first);




    }
}
