import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {

    public static long power(int n, int m) {
        // write your code here
        long out = (long) Math.pow(n, m);
        return out;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}