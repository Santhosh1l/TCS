public class factroical {
    public static void main(String[] args) {
        int n=5;
        System.out.println( fact(5));
    }
    static int fact(int n ){
        int fact=1;
        if(n==0){
            return 1;
        }
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}
