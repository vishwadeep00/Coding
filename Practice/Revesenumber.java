public class Revesenumber {
    public static void main(String[] args){
        int a = 11211;
      int temp=a;
     
    

        int x = 0;
     
        while(a>0){
       int  b=a%10;  
        x= x*10+b;
         a= a /10; 
        }
        if(temp==x){
            System.out.print("palindram number");
        }else{
            System.out.println("Not palindram number ");
        }
        
       
      
        
    }
}    
         
       
        
       
       
      

