 import java.util.Scanner;
  class sumeven{
    public static void main(String[]args){
        Scanner even=new Scanner(System.in);
        int num=even.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {  // Check if even
                sum = sum + i;  // Add to sum
            }
        }

        System.out.println(sum);
    }
}
    