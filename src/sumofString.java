import java.util.Scanner;

public  class sumofString{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int sum=0;
        String temp="";
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                temp+=c;
            }
            else{
                if(!temp.isEmpty()){
                sum+=Integer.parseInt(temp);
                temp="";}
            }
        }
        if (!temp.isEmpty()) {
            sum += Integer.parseInt(temp);
        }

        System.out.println(sum);

    }
}