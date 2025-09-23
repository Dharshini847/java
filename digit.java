 import java.util.Scanner;
    class digit{
        public static void main(String[]args){
            Scanner name = new Scanner(System.in);
            char letter =name.next().charAt(0);
            if(letter>=48 && letter<=57){
                System.out.print("digit");
            }
            else if((letter>=65 && letter<=90)||(letter>=97 && letter>=122)){
                System.out.print("alphabet");
            }
            else{
                System.out.print("Special");
            }
        }
    }