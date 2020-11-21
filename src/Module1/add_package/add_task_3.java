package Module1.add_package;

import java.util.Locale;
import java.util.Scanner;

public class add_task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int n1=in.nextInt();
        int n=in.nextInt();
        boolean flag=false;
        for (int i=n1; i<=n; i++){
            boolean k=true;
            for (int j=2; j<i/2+1; j++){
                if (i%j==0) {
                    k=false;
                    break;
                }
            }
            if (k){
                System.out.print(" "+i);
                flag=true;
            }
        }
        if (!flag){
            System.out.println(0);
        }
    }
}
