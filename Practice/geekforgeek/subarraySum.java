package geekforgeek;

public class subarraySum{
    public static void main(String[] args) {
        int arr[]={ 15,2,4,8,9,10,23 };
        int n = arr.length;
        int sum =21;
        int current_sum=0;
        for(int i=0;i<n;i++){
           for (int j=i+1;j<n;i++){
            current_sum=arr[i]+arr[j+1];
           }
           if(current_sum==sum){
               System.out.println("Index");
           }
        }
        
    }
    
}
