
class Fc {

	double c,f;
	double Temp;
	double a,b;
	static int temp=1;

public Fc(){

		
	
}
	


	void ConverterC(double a){
		
		c=(f-32)/1.8;
		
		System.out.printf("¼·¾¾¿Âµµ´Â: %.1f\n",c);
	}
	
	void ConverterF(double b){
		
		f=(c*1.8)+32;
		System.out.printf("¼·¾¾¿Âµµ´Â: %.1f\n",c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fc a=new Fc();
		if(temp==1){
		a.ConverterC(10.0);
		}
		else if(temp==2){
		a.ConverterF(10.0);
		}

	}

}
