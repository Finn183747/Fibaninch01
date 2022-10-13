import java.util.Scanner;

public class Work02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int a = 1;
        while (a*a<= x) {
            System.out.println(a*a);
            a++;
        }
        if (a==1){

        }
    }
}