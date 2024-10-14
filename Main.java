import java.util.Scanner;
import java.io.PrintStream;
import java.util.Arrays;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {

        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();

        int[] m = {n1, n2, n3, n4};
        Arrays.sort(m);

        out.print(m[2]);
    }
}
