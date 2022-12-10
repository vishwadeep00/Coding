

public class MargeSort {

    public static void  conqure(int arr[],int si,int midd,int ei){

        int Marged[] = new int[ei-si+1];
         int idx1=si;
         int idx2=midd+1;
         int x =0;
         while(idx1<=midd && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                Marged[x++]=arr[idx1++];
                
            }else{
                Marged[x++]=arr[idx2++];

            } }

            while(idx1<=midd){
                Marged[x++]=arr[idx1++]; 
            }
            while(idx2<=ei){
                Marged[x++]=arr[idx2++]; 
         }
            for(int i=0,j=si;i<Marged.length;i++,j++){
                arr[j]=Marged[i];

            }

    }


    public static void divide(int arr[],int si,int ei){
if(si>=ei){
    return;
}
       int midd = si +(ei-si)/2;
       divide(arr, si, midd);
       divide(arr, midd+1, ei);
       conqure(arr,si,midd,ei);

    }  
    public static void main(String[] args) {
        int arr[]={1,5,7,6,2,4,8,3};
        int n =arr.length;

        divide(arr, 0, n-1);

        for(int i=0;i<n;i++){

            System.out.print(arr[i] +" ");
        }

    }

    
}
