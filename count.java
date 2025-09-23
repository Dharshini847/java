 import java.util.Scanner;
   class count{
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.print(count);
    }
   }