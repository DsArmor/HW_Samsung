package Module1.add_package;

import java.util.Locale;
import java.util.Scanner;

public class string_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        String s = in.nextLine();
        s = s.replaceAll("\\ ", "");
        int score=0;
        for (int i=0; i<s.length()/2; i++){
            if (s.charAt(i)==s.charAt(s.length()-i-1)){
                score++;
            }
        }
        if(score == s.length()/2){
            System.out.println("yes");
        }
        else
            System.out.println("no");
    }
}
