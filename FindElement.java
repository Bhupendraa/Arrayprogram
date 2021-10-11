import java.util.Scanner;
public class FindElement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
         System.out.println("Enter the value of data which you want to give you");
        int data=sc.nextInt();
        int Index=-1;
        int i=0;
        while(i<n){
            if(arr[i]==data){
                Index=i;
                break;
            }
            i++;
        }
        System.out.println(Index);
    }
    
}