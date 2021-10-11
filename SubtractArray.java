import java.io.*;
import java.util.*;

public class SubtractArray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n1");
    int n1=sc.nextInt();
    int arr1[]=new int[n1];
    for(int i=0;i<arr1.length;i++){
        arr1[i]=sc.nextInt();
    }
        System.out.println("Enter the value of n2");
    int n2=sc.nextInt();
    int arr2[]=new int[n2];
    for(int i=0;i<arr2.length;i++){
        arr2[i]=sc.nextInt();
    }
    int diff[]=new int[n2];
    int carry=0;
    int i=arr1.length-1;
    int j=arr2.length-1;
    int k=diff.length-1;
    while(k>=0){
        int digit=0;
        int aiv=i>=0?arr1[i]:0;
        if(arr2[j]+carry>=aiv){
            
            digit=arr2[j]+carry-aiv;
            carry=0;
        }
        else{
            digit=arr2[j]+carry+10-aiv;
            carry=-1;
            
            
        }
        diff[k]=digit;
        i--;
        j--;
        k--;
        
        
    }
    int idx=0;
    while(idx<diff.length){
        if(diff[idx]==0){
            idx++;
            
        }
        else{
            break;
        }
    }
    while(idx<diff.length){
        System.out.println(diff[idx++]);
    }
    
    
    
 }

}