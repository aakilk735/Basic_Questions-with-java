import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c;
        System.out.print("enter the number=");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
