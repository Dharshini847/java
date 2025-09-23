 import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n < 0) {
            System.out.println("Error! Factorial of a negative number doesn't exist.");
        } else {
            long factorial = 1;  // Use long to handle bigger factorials
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }
    }
}
