 import java.util.Scanner;
   class group{
    public static void main(String[]args){
        Scanner group = new Scanner(System.in);
        int age= group.nextInt();
        int gender = group.nextInt();
        if(gender==1){
            if(age<25){
               System.out.print("group 1 ");
            }
            else if(age<=45){
                System.out.print("group 3");
            }
            else{
                System.out.print("group 5");
            }
        }
        else if(gender==2){
            if(age<25){
                System.out.print("group 2");
            }
            else if(age<=45){
                System.out.print("group 4");
            }
            else{
                System.out.print("group 5");
            }
        }
        else{
            System.out.print("invalid");
        }
        
    }
   }