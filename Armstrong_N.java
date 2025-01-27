import java.util.Scanner;

class  Armstrong_N {
    public static void main (String args [] ) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        int sum = 0, temp, r;
        temp = n;

        while (n > 0) {

            r = n % 10;
            sum = sum + (r*r*r);
            n = n / 10;
        }

        if (temp == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}