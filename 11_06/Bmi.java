
 class Bmi {
	static double weight;
	static double height;
	static double bmi;
	
	static void bmi(double weight,double height){
	  bmi=weight/(height*height);
	  	System.out.print("당신의 BMI 단계는: ");
		 if(bmi<18.5){
			 
			 System.out.println(bmi);
			 
		 }
		 else if(bmi<23 && bmi>=18.5){
			 System.out.println("nomal");
			 
		 }
		 else if(bmi<25 && bmi>=23){
			 System.out.println("risky");
			 
		 }
		 else if(bmi<30 && bmi>=25){
			 System.out.println("obesity1");
			 
		 }
		 else if(bmi<40 && bmi>=30){
			 System.out.println("obesity2");
			 
		 }
		 else if(bmi>40){
			 System.out.println("obesity3");
			 
		 }
		 else
			 System.out.println("error");
			 
		 
		
		
	}
	public static void main(String[] args) {
		
		bmi((double)80,(double)1.8);
	}

}
