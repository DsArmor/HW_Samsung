package Module1.add_package;

import java.util.Locale;
import java.util.Scanner;

public class add_task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int a=in.nextInt(), b;
        int score1=0,score2=0, max=0;
        if (a!=0){
            b=in.nextInt();
            while (b!=0){
                if (a>b){
                    score2=0;
                    score1++;
                }
                else if(a<b){
                    score1=0;
                    score2++;
                }
                else{
                    score1=0;
                    score2 = 0;
                }
                if (score1>max)
                    max=score1;
                if (score2>max)
                    max=score2;
                a=b;
                b=in.nextInt();
            }
        }
        System.out.println(max+1);


    }
}
