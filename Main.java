import java.util.Scanner;
import java.io.PrintStream;
import java.util.Arrays;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {

        long n1 = in.nextLong();
        long n2 = in.nextLong();
        long n3 = in.nextLong();
        long n4 = in.nextLong();

        Long[] m = {n1, n2, n3, n4};
        Arrays.sort(m);

        out.print(m[2]);
    }
}
