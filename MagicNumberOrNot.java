import java.util.Scanner;
public class MagicNumberOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,temp,sum=0,rev=0;
        System.out.print("enter the number=");
        n=sc.nextInt();
        temp=n;
        while(temp>0){
            sum=sum+temp%10;
            temp/=10;
        }
        temp=sum;
        System.out.print("Sum= "+temp);
        while(temp>0){
            rev=rev*10+temp%10;
            temp/=10;
        }
        System.out.println();
        System.out.print("Reverse of sum= "+rev);
        System.out.println();
        System.out.print("Product= "+sum*rev);
        System.out.println();
        if(sum*rev==n){
            System.out.print(n+" is a magic number");
        }
        else{
            System.out.print("%d is not a magic number");
        }
    }
}
