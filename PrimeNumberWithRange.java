import java.util.Scanner;
public class PrimeNumberWithRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,count;
        System.out.print("Enter the starting number=");
        a=sc.nextInt();
        System.out.print("Enter the ending number=");
        b=sc.nextInt();
        for(int i=a;i<=b;i++){
            count=0;
            for(int j=1;j<=i;j++){
                if (i%j == 0) {
                    count=count+1;
                }
            }
            if(count==2){
                System.out.print(i+"\t");
            }
        }
    }
}
