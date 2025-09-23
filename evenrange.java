 import java.util.Scanner;
  class evenrange{
    public static void main(String[]args){
        Scanner range=new Scanner(System.in);
        int start = range.nextInt();
        int end = range.nextInt();
        for(int i=start;i<=end;i++){
            if(i%2==0){
            System.out.print(i+" ");
            }
        }
    }
  }