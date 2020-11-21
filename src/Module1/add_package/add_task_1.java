package Module1.add_package;

import java.util.Locale;
import java.util.Scanner;

public class add_task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int n = in.nextInt();
        outer:
        while (n>0){
            int temp=n/10;
            int check=n%10;
            while(temp>0){
                if (temp%10==check){
                    System.out.println("YES");
                    break outer;
                }
                temp/=10;
            }
            n/=10;
            if (n==0)
                System.out.println("NO");
        }
    }
}
