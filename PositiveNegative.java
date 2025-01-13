import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter the number=");
        n=sc.nextInt();
        if(n>0){
            System.out.println("positive");
        }
        else if(n==0){
            System.out.println("equal to zero");

        }
        else{
            System.out.println("Negative");
        }
    }
}