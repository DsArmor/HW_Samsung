package Module1.add_package;

import java.util.Locale;
import java.util.Scanner;

public class string_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int y=0, x=0;
        String s = in.nextLine();
        while(!s.equals("")){

            int i=s.length(), sum=0,k=1;
            while (s.charAt(i-1)!=' '){
                sum+=((int)s.charAt(i-1)-48)*k;
                k*=10;
                i--;
            }
            switch(s.charAt(0)){
                case('N'):
                    y+=sum;
                    break;
                case('S'):
                    y-=sum;
                    break;
                case('E'):
                    x+=sum;
                    break;
                case('W'):
                    x-=sum;
            }
            s = in.nextLine();
        }
        System.out.println(x+" "+y);
    }
}
