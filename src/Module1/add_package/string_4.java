package Module1.add_package;

import java.util.Locale;
import java.util.Scanner;

public class string_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        String s= in.nextLine();
        String check="", max_s="";
        int sum=0, max=0;
        s+=" ";
        s=" "+s;
        for (char i:s.toCharArray()){
            if (i==' '){
                if (sum-1>max){
                    max=sum-1;
                    max_s=check;
                }
                check="";
                sum=0;

            }
            else
                check+=i;
                sum++;
        }
        System.out.println(max_s);
        System.out.println(max);

}

}
