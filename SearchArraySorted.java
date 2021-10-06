// public class SearchArraySorted{
//     public static void main(String args[]){
//         int arr[]={4,5,6,77,89,99};
//         int data=6;
//         int low=0;
//         int high=arr.length-1;
//         while(low<=high){
//             int mid=(low+high)/2;
//             if(data>arr[mid]){
//                 high=mid-1;
//             }
//             else if(data<arr[mid]){
//                 low=mid+1;
                
//             }
//             else{
//                System.out.println(mid);
//                return;
//             }
//         }
//      System.out.println(-1);
//     }
// }



// with function how to solve this type of problem
public class SearchArraySorted{
    static int binarySearch(int arr[],int low,int high,int data){
        while(low<=high){
            int mid=(low+high)/2;
            if(data>arr[mid]){
                mid=high-1;
            }
            else if(data<arr[mid]){
                mid=low+1;
            }
            else{
                System.out.println(mid);
              
            }
        }
          System.out.println(-1);


    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,8,9,33,44,55,66,77,445,775};
        int n=arr.length-1;
        int data=77;
      
        System.out.println("Index: " + binarySearch(arr, 0, n, data));

    }
}