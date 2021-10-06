public class SearchArrayUnsorted{
    public static void main(String args[]){
        int arr[]={4,5,2,3,8,9};
        int n=arr.length;
        int key=4;
        int positon=search(arr,n,key);
        if(positon==-1){
            System.out.println("Element is not found");
        }
        else{
             System.out.println("Element is  found="+(positon+1));
        }
    }
    public static int search(int arr[],int n,int key){
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return i;
            }
            
        }
        return -1;
    }
}