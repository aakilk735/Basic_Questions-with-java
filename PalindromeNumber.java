import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,pali=0,c,r;
        System.out.print("enter the number=");
        n=sc.nextInt();
        c=n;
        while(n>0){
            r=n%10;
            pali=r+(pali*10);
            n=n/10;
        }
        if(c==pali){
            System.out.println("number is  palidrome");
        }
        else{
            System.out.println("not  palidrome number");
        }
    }
}