import java.util.*;

public class Findelements {
  


	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int size = sc.nextInt();
			 int number[]=new int [size];
			 int x = sc.nextInt();
			for(int i=0;i<size;i++){
			    number[i]=sc.nextInt();
			}
   
			   
			  
			    
			
			for(int i=0;i<number.length;i++){
			    if(number[i]==x){
			        System.out.print("x found at index :" + i);
			    }
			}
		}
    }
}
	


