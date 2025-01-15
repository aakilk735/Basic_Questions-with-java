import java.util.Scanner;
public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int temp,n;
        System.out.print("enter the number=");
            n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++){

                    if(arr[j]>arr[j+1]){
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        System.out.println("bubbel shrt is acending oder");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");

            }
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++){

                    if(arr[j]<arr[j+1]){
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        System.out.print("\n bubbel shrt is Dacending oder \n");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");

            }

        }
}
