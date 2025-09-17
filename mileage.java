import java.util.Scanner;
public class mileage{
    public static void main(String[]args){
        Scanner name = new Scanner(System.in);
        int num =name.nextInt();
        double num1 = name.nextInt();
        double num2 = name.nextInt();
        System.out.println(num*(num2-num1));
    }
}