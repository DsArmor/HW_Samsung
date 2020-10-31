import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,k=1,n,b=0;
        a=in.nextInt();
        n=in.nextInt();
        if ((a>>n)%2==0)
            b=1;
        while (n>0){
            k*=2;
            n--;
        }

        System.out.println(a+b*k);

    }
}
