import java.util.Scanner;

class Palindrome_N {
    public static void main(String [] args) {

        System.out.print("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n, sum = 0, r;

        while (n > 0) {

            r = n % 10;
            sum = sum * 10;
            n = n / 10;
        }

        if (n == sum) {

            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}