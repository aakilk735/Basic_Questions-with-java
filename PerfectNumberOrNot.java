import java.util.Scanner;

public class PerfectNumberOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,add=0;
        System.out.print("enter the number=");
        n=sc.nextInt();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                add+=i;
            }
        }
        if(add==n && n>0){
            System.out.print(n+" is a perfect number");
        }
        else{
            System.out.print(n+" is not a perfect number");
        }
    }
}
