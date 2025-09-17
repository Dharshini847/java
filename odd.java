import java.util.Scanner;
public class odd{
    public static void main(String[]args){
        Scanner name = new Scanner(System.in);
        int a=name.nextInt();
        if(a%2==0){
            System.out.println("the number is even");

        }
        else{
            System.out.println("the number is odd");
        }
    }
}