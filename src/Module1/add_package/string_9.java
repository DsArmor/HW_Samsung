package Module1.add_package;

import java.util.Locale;
import java.util.Scanner;

public class string_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        String s=in.nextLine();
        int k = in.nextInt();
        for (char i:s.toCharArray()){
            char a;
            if ((int)i-k<65)
                a =(char)(26+((int)i-k));
            else
                a=(char)((int)i-k);
            System.out.print(a);
        }
    }
}
