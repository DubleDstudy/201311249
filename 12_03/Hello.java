public class Hello {

    private String name;
    public Hello(String name){
        this.name=name;
    }
    public void sayHello(){
        System.out.println("Hello "+name);
    }
	
	public static void main(String[] args) {
		
		Hello[] h = new Hello[5];
		h[0] = new Hello("dy1");
		h[1] = new Hello("dy2");
		h[2] = new Hello("dy3");
		h[3] = new Hello("dy4");
		h[4] = new Hello("dy5");
		for(int i=0;i<5;i++){
			h[i].sayHello();
		}
		System.out.println("---------");
		for(Hello e:h){
			e.sayHello();
		}
		System.out.println("---------");
		for(int i=0;i<h.length; i++){
			h[i].sayHello();
		}

		
	}
		
}