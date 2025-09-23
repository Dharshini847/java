 import java.util.Scanner;
  class positive{
    public static void main(String[]args){
        Scanner positive= new Scanner(System.in);
        int num = positive.nextInt();
        if(num>0){
            System.out.print(num+" is positive");
        }
        else if(num<0){
            System.out.print( num + " is negative");
        }
    }
  }