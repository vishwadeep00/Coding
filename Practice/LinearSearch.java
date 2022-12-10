class LinearSearch{
    public static void main(String[] args) {
      
        int [] arr = {1,2,3,6,3,7,99,45,34,64,23,12,16};
      int search  = 64;
      for(int i=0; i<arr.length; i++){
        if(search==arr[i]){
            System.out.println("Index is : "+ i);
        }
      }
    }
}