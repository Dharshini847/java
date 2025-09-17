import java.util.Scanner;
public class minmax{
    public static void main(String[]args){
        Scanner minmax= new Scanner(System.in);
        int num1=minmax.nextInt();
        int num2=minmax.nextInt();
        int num3=minmax.nextInt();
        if(num1>num2) {
            System.out.println("the num1 is maximum");
            }
        else if (num2>num3) {
            System.out.println("the num2 is maximum");
         }
         else if(num3>num1){
            System.out.println("the num3 is maximum");
        }
         }
    }