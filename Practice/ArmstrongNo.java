public class ArmstrongNo {
    public static void main(String[] args) {
        int no=152;
        int temp1 =no;
        int leng=0;
        while(temp1 !=0){
            
            leng = leng+1;
            temp1 = temp1/10;
        }
      
       //  System.out.println(leng);
        
        int temp2 = no;
        int rem;
        int Arm = 0;
        while(temp2 !=0){
          rem =temp2%10;
          int mul =1;
       for(int i=1;i<=leng;i++){
           mul=rem*mul;
       }
           Arm=Arm+mul;
           temp2=temp2/10;
       
    }
        if(Arm==no){
            System.out.println("yes it is Armstrong number "+ Arm);
        }else{
            System.out.println("No it is not Armstrong number"+ Arm);
        }

    }
}
    
