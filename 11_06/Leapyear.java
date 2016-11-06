
 class Leapyear {
	static void leapyear(int year){

		
	if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
		System.out.println("Leapyear");
	}
	else 
		System.out.println("NotLeapyear");
	
	}
	public static void main(String[] args) {

		leapyear(2012);
	}

}
