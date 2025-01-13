import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,arm=0,c,r;
        System.out.print("enter the number=");
        n=sc.nextInt();
        c=n;
        while(n>0){
            r=n%10;
            arm=(r*r*r)+arm;
            n=n/10;
        }
        if(c==arm){
            System.out.print("number is armstrong");
        }
        else{
            System.out.print("not armstrong number");
        }
    }
}