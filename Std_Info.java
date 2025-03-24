import java.util.Scanner;
public class Std_Info {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Number of Students : ");
        int n = sc.nextInt();

        int[] rollno = new int[n];
        String[] name = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter Roll No. : ");
            rollno[i] = sc.nextInt();

            sc.nextLine();

            System.out.println("Enter Name : ");
            name[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {

            System.out.println("Roll No. = "+ rollno[i]);
            System.out.println("Name = "+ name[i]);
        }
    }
}
