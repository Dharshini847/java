import java.util.Scanner;
public class positive{
    public static void main(String[]args){
        Scanner Scan = new Scanner(System.in);
        int num = Scan.nextInt();
        if(num>0){
            System.out.println("the number is positive");
        }
        else if(num<0){
        System.out.print("the number is negative");
        }
        else
        System.out.println("the number is zero");
    }
}