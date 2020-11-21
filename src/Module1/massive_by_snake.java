package Module1;

import java.util.Locale;
import java.util.Scanner;

public class massive_by_snake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int b = 1, c = 0, d = 0, n, m, check,n1,m1;
        n=in.nextInt();
        m=2*n+1;
        n=2*n+1;
        int [][] a= new int[100][100];
        n1 = n;
        m1 = m;
        check = n * m / (n + m);
        check = 100;
        b=n1*m1-1;
        for (int j = 0; b>0; j++) {
            for (int i = j; i < n; i++) {
                a[i][m - 1] = b;
                b--;
                if (b < 0)
                    break;
            }
            if (b < 0)
                break;
            for (int i = m - 2; i > c-1; i--) {
                a[n - 1][i] = b;
                b--;
                if (b < 0)
                    break;
            }
            if (b < 0)
                break;
            for (int i = n-2; i > d; i--) {
                a[i][j] = b;
                b--;
                if (b < 0)
                    break;
            }
            for (int i = j; i < m-1; i++) {
                a[j][i] = b;
                b--;
                if (b < 0)
                    break;

            }
            if (b < 0)
                break;
            m--;
            n--;
            c++;
            d++;
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
    }
}
