package Module1.add_package;

import java.util.Locale;
import java.util.Scanner;

public class string_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        String s= in.nextLine();
        int sum=0;
        s+=" ";
        for (char i:s.toCharArray()){
            if (i==' '){
                sum++;
            }
        }
        System.out.println(sum);

        }

}
