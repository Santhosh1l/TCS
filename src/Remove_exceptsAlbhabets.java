import java.util.*;
public class Remove_exceptsAlbhabets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s.replaceAll("[a-zA-Z0-9\\s]",""));
    }
}
