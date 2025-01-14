import java.util.Scanner;

public class BinaryOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,r;
        System.out.print("enter the number=");
        n=sc.nextInt();
        while(n>0){
            r=n%10;
            if(r!=0 && r!=1){
                System.out.print("Number is not a biary");
                break;
            }
            n=n/10;
            if(n==0){
                System.out.print("Number is a binary");
            }
        }
    }
}
