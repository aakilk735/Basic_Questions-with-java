import java.util.*;
public class LargeNumber {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first number=");
        num1=sc.nextInt();
        System.out.print("enter the second number=");
        num2=sc.nextInt();
        if(num1>num2){
            System.out.print("Large="+num1);
        }
        else{
            System.out.print("Large="+num2);
        }
    }
}