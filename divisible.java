 import java.util.Scanner;
   class divisible{
    public static void main(String[]args){
        Scanner divisible=new Scanner(System.in);
        int num = divisible.nextInt();
        if(num%3==0&&num%5==0){
            System.out.print(num + "the both number is divizible");
        }
        else{
            System.out.print(num + "the number is not divisible");
        }
    }
   }