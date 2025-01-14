import java.util.Scanner;
public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, count=0;
        System.out.print("enter the number=");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.print("NUMBER Is A PRIME");
        }
        else{
            System.out.print("NUMBER IS NOT PRIME");
        }
    }
}
