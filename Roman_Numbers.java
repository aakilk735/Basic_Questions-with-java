import java.util.Scanner;
public class Roman_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ones,tens,hundreds,thousand,number;
        System.out.print("enter the numbers= ");
        number=sc.nextInt();
        if(number==0){
            System.out.print("Invalid number");
        }

        thousand=number/1000;
        hundreds=((number/100)%10);
        tens=((number/10)%10);
        ones=((number/1)%10);

        if(thousand==1)
            System.out.print("M");
        else if(thousand==2)
            System.out.print("MM");
        else if(thousand==3)
            System.out.print("MMM");

        if(hundreds==1)
            System.out.print("C");
        else if(hundreds==2)
            System.out.print("CC");
        else if(hundreds==3)
            System.out.print("CCC");
        else if(hundreds==4)
            System.out.print("CD");
        else if(hundreds==5)
            System.out.print("D");
        else if(hundreds==6)
            System.out.print("DC");
        else if(hundreds==7)
            System.out.print("DCC");
        else if(hundreds==8)
            System.out.print("DCCC");
        else if(hundreds==9)
            System.out.print("CM");

        if(tens==1)
            System.out.print("X");
        else if(tens==2)
            System.out.print("XX");
        else if(tens==3)
            System.out.print("XXX");
        else if(tens==4)
            System.out.print("XL");
        else if(tens==5)
            System.out.print("L");
        else if(tens==6)
            System.out.print("LX");
        else if(tens==7)
            System.out.print("LXX");
        else if(tens==8)
            System.out.print("LXXX");
        else if(tens==9)
            System.out.print("XC");

        if(ones==1)
            System.out.print("I");
        else if(ones==2)
            System.out.print("II");
        else if(ones==3)
            System.out.print("III");
        else if(ones==4)
            System.out.print("IV");
        else if(ones==5)
            System.out.print("V");
        else if(ones==6)
            System.out.print("VI");
        else if(ones==7)
            System.out.print("VII");
        else if(ones==8)
            System.out.print("VIII");
        else if(ones==9)
            System.out.print("IX");
    }
}
