import java.util.HashMap;
import java.util.Scanner;

public class sunday_countdown {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashMap<String,Integer> da=new HashMap<>();
        da.put("Sunday",0);
        da.put("Monday",1);

        da.put("Tuesday",2);
        da.put("Wednesday",3);
        da.put("Thrusday",4);
        da.put("Friday",5);
        da.put("Saturday",6);


        String day= sc.nextLine();
        int days=sc.nextInt();
        while(days>10){
            int d=days%7;
            days=days/7;
        }
        System.out.println(days);
    }

}
