import java.util.*;
import java.lang.*;
import java.io.*;

class PrepInsta_1
{
    public static void main (String[] args) throws java.lang.Exception {

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        getdistanc(n);

    }
    static void getdistanc(int num){
        int x=0;
        int y=0;
        int distance=10;
        char c='R';
        while(num>0)
        {
            switch (c){
                case 'R':
                    x+=distance;
                    c='U';
                    distance=distance+10;
                    break;
                case 'U':
                    y+=distance;
                    c='L';
                    distance=distance+10;
                    break;
                case 'L':
                    x-=distance;
                    c='D';
                    distance+=10;
                    break;
                case 'D':
                    y-=distance;
                    c='A';
                    distance+=10;
                    break;
                case 'A':
                    x+=distance;
                    c='R';
                    distance+=10;
                    break;
            }num--;


        }

        System.out.println(x+" "+y);
    }


}
