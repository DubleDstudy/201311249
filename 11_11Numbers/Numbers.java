import java.util.ArrayList;

class Numbers{
  
  public int setList(ArrayList<Integer> arr) {
	  
	  
	  int i=1;
    	 while(i<1001){
    		 	 
    	i++;
    	if(i % 4==0  && i%5!= 0){
    		  arr.add(i);
    				
    		}
    	
    	
    		
    		  
    	  }
    	 System.out.println(arr);
		return i;
    	 
    }
  
    
   
  
  public static  int sumList(ArrayList<Integer> arr){
	  int sum=0;
	  int maxiter =arr.size();
	  
	  for(int i=0; i<maxiter; i++){
		  sum+=arr.get(i);
		  
	  }
	  
	return sum;
  }
  public static void main(String[] args) {
	  ArrayList<Integer> arr = new ArrayList<Integer>();
	  	Numbers dy = new Numbers();
	 	dy.setList(arr);
	 	System.out.println("sum :" + sumList(arr));
  	}  
 }