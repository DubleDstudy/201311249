
class Persongrade {
	double a;
	String grade;
	public Persongrade(){
		
		
		
	}
	void DD(double a){
		if(a<=100 && a>=90){
			grade="A";
			System.out.printf("己利篮:%s",grade);
		}
		else if(a>=80 && a <90){
			grade="B";
			System.out.printf("己利篮:%s",grade);
			
		}
		else if(a>=70 && a <80){
			grade="C";
			System.out.printf("己利篮:%s",grade);
			
		}
		else if(a>=60 && a <=70){
			grade="D";
			System.out.printf("己利篮:%s",grade);
		}
		else{
			grade="F";
			System.out.printf("己利篮:%s",grade);
		}
		
	}
	public static void main(String[] args) {
	
		Persongrade daeyoung = new Persongrade();
		daeyoung.DD(90.0);

	}

}
