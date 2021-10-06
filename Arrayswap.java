import java. util.Scanner;
public class Arrayswap{

    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value ");
        int n=sc.nextInt();
            System.out.println("Enter the value of n");

        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before swapping");
        swap(arr,0,n-1);
         System.out.println("After swapping");
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}