import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.print("enter the two numbers=");
        n1=sc.nextInt();
        n2=sc.nextInt();
        while(n1!=n2){
            if(n1>n2)
                n1-=n2;
            else
                n2-=n1;
        }
        System.out.print("GCD = "+n1);
    }
}