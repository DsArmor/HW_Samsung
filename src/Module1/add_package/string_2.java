package Module1.add_package;

import java.util.Locale;
import java.util.Scanner;

public class string_2 {
    static char Up(char a){
        if ((int)a>96 && (int)a<123)
            a=(char)((int)a-32);
        else if ((int)a<91 && (int)a>64)
            a=(char)((int)a+32);
        return a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        String a=in.next();
        System.out.println(Up(a.charAt(0)));

    }
}
