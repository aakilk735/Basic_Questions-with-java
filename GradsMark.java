import java.util.Scanner;
public class GradsMark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks;
        System.out.print("enter the Marks =");
        marks=sc.nextInt();
        if(marks<=30)
            System.out.println("C");
        else if(30<=marks && marks<70)
            System.out.println("B");
        else if(70<=marks && marks<90)
            System.out.println("A");
        else if(90<=marks && marks<=100)
            System.out.println("A+");
        else
            System.out.println("invalid number");
    }
}