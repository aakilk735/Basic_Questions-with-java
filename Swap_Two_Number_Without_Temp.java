import java.util.Scanner;

public class Swap_Two_Number_Without_Temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a=");
        int a=sc.nextInt();
        System.out.print("Enter the value of b=");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
}
