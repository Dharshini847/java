 import java.util.Scanner;
  class triangle{
    public static void main(String[]args){
        Scanner triangle=new Scanner(System.in);
        int side1=triangle.nextInt();
        int side2=triangle.nextInt();
        int side3=triangle.nextInt();
        if(side1==side2&&side2==side3){
            System.out.print("Equivalent Triangle");
        }
        else if(side1==side2||side2==side3||side1==side3){
            System.out.print("Isosceles Triangle");
        }
        else{
            System.out.print("Scalene Triangle");
        }

    }
  }