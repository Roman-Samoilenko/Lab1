import java.util.Scanner;
import java.io.PrintStream;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args)
    {
        long n1 = in.nextLong();
        long n2 = in.nextLong();
        long n3 = in.nextLong();
        long n4 = in.nextLong();

        if ((n1 > n2 && n1 > n3 && n1 < n4) || (n1 > n4 && n1 > n3 && n1 < n2) || (n1 > n4 && n1 > n2 && n1 < n3)) {
            out.println(n1);
        } else if ((n2 > n1 && n2 > n3 && n2 < n4) || (n2 > n4 && n2 > n3 && n2 < n1) || (n2 > n4 && n2 > n1 && n2 < n3)) {
            out.println(n2);
        } else if ((n3 < n1 && n3 > n2 && n3 > n4) || (n3 < n4 && n3 > n2 && n3 > n1) || (n3 < n2 && n3 > n1 && n3 > n4)) {
            out.println(n3);
        } else{
            out.println(n4);
        }
    }
}
