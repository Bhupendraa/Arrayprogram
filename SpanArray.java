import java.util.Scanner;
public class SpanArray{

    public static void span(int arr[]){
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
         
            }
             if(arr[i]<min){
              min=arr[i];
                
            }
           
            
          

        }
         System.out.println("The value of max"+max);
            System.out.println("The value of min"+min);
           int span1=max-min;
        System.out.println(span1);
       
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value ");
        int n=sc.nextInt();
        System.out.println("Enter the value of n ");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        span(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
    }
} 