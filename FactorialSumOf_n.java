public class FactorialSumOf_n {
    public int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public int sum(int n){
        int s=0;
        for(int j=1;j<=n;j++){
            s=s+factorial(j);
        }
        return s;
    }
    public static void main(String[] args) {
        FactorialSumOf_n f=new FactorialSumOf_n();
       // int z=f.factorial(5);

        int z=f.sum(5);
        System.out.println(z);

    }
}
