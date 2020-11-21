package Module1.add_package;

import java.util.Locale;
import java.util.Scanner;

public class add_task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int sum=in.nextInt();
        int score=0;
        for (int i=0; i*a<=sum; i++){
            for (int j=0; j*b<=sum; j++){
                for (int k=0; k*c<=sum; k++){
                    if (i*a+j*b+k*c==sum){
                        score++;
                    }
                }
            }
        }
        System.out.println(score);
        for (int i=0; i*a<=sum; i++){
            for (int j=0; j*b<=sum; j++){
                for (int k=0; k*c<=sum; k++){
                    if (i*a+j*b+k*c==sum){
                        System.out.println(i+" "+j+" "+k);
                    }
                }
            }
        }
    }
}
