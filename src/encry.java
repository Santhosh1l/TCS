import java.util.Scanner;

public class encry {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3= sc.nextLine();
        StringBuilder s=new StringBuilder();
        s3=s3.toUpperCase();
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(c=='a'|| c=='e'|| c=='i' || c=='o'||c=='u' || c=='A' ||
            c=='E' || c=='I'|| c=='O' || c=='U' ){
                s.append("*");
            }
            else {
                s.append(c);
            }
        }

        for(int i=0;i<s2.length();i++){
            char c=s2.charAt(i);
            if(c=='a'|| c=='e'|| c=='i' || c=='o'||c=='u' || c=='A' ||
                    c=='E' || c=='I'|| c=='O' || c=='U' || Character.isDigit(c)){
                s.append(c);
            }
            else {
                s.append("@");
            }

        }
        s.append(s3);
        System.out.println(s.toString());
    }}


