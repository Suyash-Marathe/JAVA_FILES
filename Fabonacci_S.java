import java.util.Scanner;

class Fabonacci_S {

    public static void main (String args[]) {

        Scanner sc = new Scanner (System.in);
        int a = 0, b = 1, c;

        System.out.println("Enter Level : ");
        int level = sc.nextInt();

        System.out.println(a);
        System.out.println(b);

        for (int i=2; i<=level; i++) {

            c = a + b;

            System.out.println(c);

            a = b;
            b = c;
            c = a;
        }
    }
}