import java.util.Scanner;
public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y;
        System.out.print("enter the number=");
        y=sc.nextInt();
        if(y%400==0||y%4==0 && y!=100){
            System.out.println("year is leap year");
        }
        else{
            System.out.println("not leap yaer");
        }
    }
}