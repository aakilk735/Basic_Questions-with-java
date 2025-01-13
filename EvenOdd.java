import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number=");
        n=sc.nextInt();
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.print("odd");
        }
    }
}