

import java.util.Scanner;

public class Fibaninch02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        int d = 0;
        int e = 0;
        while (c < x) {
            a = b;
            b = c;
            c = a + b;
            d++;
            e++;
        }
        if (x == c) {
            System.out.println(1 + " " + e);
        } else {
            System.out.println(0);
        }
    }
}