public class AdditionOfBinary {
    public static void main(String[] args) {
        String a="111";
        String b="11";
        int num1=Integer.parseInt(a,2);
        int num2=Integer.parseInt(b,2);
        int sum=num1+num2;
        String restul=Integer.toBinaryString(sum);
        System.out.println(restul);
    }
}
