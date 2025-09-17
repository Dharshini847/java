import java.util.Scanner;
public class days{
    public static void main(String[]args){
        Scanner name = new Scanner(System.in);
        int num =name.nextInt();
        int year = (num/365);
        int month = ((num%365)/30);
        int days = ((num%365)%30);
        System.out.println("Year:" + year);
        System.out.println("Month:" + month);
        System.out.println("Days:"+ days);
    }
}

