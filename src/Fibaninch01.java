import java.util.Scanner;

public class Fibaninch01{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a;
        int b = 1;
        int c = 0;
        int d = 0;
        while (d < n) {
            a = b;
            b = c;
            c = a + b;
            d++;
        }
        System.out.println(c);
    }
}