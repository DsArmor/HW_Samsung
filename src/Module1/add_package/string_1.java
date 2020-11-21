package Module1.add_package;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.io.InputStreamReader;

import static java.lang.Character.isDigit;

public class string_1 {
    static boolean IsDigit(char c){
        if (isDigit(c))
            return true;
        else
            return false;

    }

    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        char c= (char)in.read();
        if (IsDigit(c))
            System.out.println("yes");
        else
            System.out.println("no");


    }
}
