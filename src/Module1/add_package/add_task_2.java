package Module1.add_package;

import java.util.Locale;
import java.util.Scanner;

public class add_task_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int a=in.nextInt();
        int b= in.nextInt();
        int score=0;
        while (a!=b){
            if (a>b)
                a=a-b;
            else
                b=b-a;
            score++;
        }
        System.out.println(a + " " +(score+1));
    }

}
