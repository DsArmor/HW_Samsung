package Module1.add_package;

import java.util.Locale;
import java.util.Scanner;

public class string_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        String s=in.nextLine();
        for (int i=0; i<s.length()-1; i++){
            if (s.charAt(i)==' ' && s.charAt(i)==s.charAt(i+1)){
                s=s.substring(0,i)+s.substring(i+1,s.length());
                i--;
            }
        }
        System.out.println(s);
    }

}
