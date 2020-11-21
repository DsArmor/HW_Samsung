package Module1.add_package;

import java.util.Locale;
import java.util.Scanner;

public class add_task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int a=in.nextInt();
        int max=0, sum=1;
        while (a!=0){
            if (a>max){
                max=a;
                sum=1;
            }
            else if (a==max)
                sum++;
            a=in.nextInt();
        }
        System.out.println(sum);
    }
}
