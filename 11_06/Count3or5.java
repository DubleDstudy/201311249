
class Count3or5 {
	
	static int sum=0;
	static int i=0;
	static void count3or5(){
		
		while(i<1000){
			if(i%3==0 || i%5==0){
				sum= sum+i;
				
			}
			
			
			i++;
			
		}	
		System.out.println("Á¤´äÀº:"+sum);
	}
	

	public static void main(String[] args) {
		
		
		count3or5();
	}

}
