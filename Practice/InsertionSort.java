import java.util.*;


public class InsertionSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
        }
        }
   
     public static void   InsertionSort(int []arr,int n) {

            for(int i=0;i<n;i++){
                int key = arr[i];
                int j = i-1;
                while(i>=0 && arr[i]>key){
                    arr[j+1]=arr[i];
                    i=i-1;
                }
                arr[j+1]=key;
            }
           InsertionSort(arr, n);
           System.out.println( );
        }
    }
