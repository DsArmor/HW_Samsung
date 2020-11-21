package Module1.add_package;

import java.util.Locale;
import java.util.Scanner;

public class string_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        String s = in.nextLine();
        outer:
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    System.out.println(s.charAt(i));
                    break outer;
                }
            }
        }
    }
}
