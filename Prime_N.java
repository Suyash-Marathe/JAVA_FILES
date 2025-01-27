import java.util.Scanner;

public class Prime_N {

    public static void main(String args[]) {

        int flag = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        if (n == 1) {

            flag = 1;

        } else {

            for (int i = 2; i < n; i++) {

                if (n % i == 0) {

                    flag = 0;
                }
            }
        }

        if (flag == 1) {

            System.out.println("Prime Number");
        } else {

            System.out.println("Not Prime Number");
        }
    }
}
