import java.util.Calendar;
class SundayCount{
   static void countSunday(){
   int Count = 0;
   int i=1901;
   Calendar sunday = Calendar.getInstance();
   while(i<=2000){
	i++;
	
	
	 for(int j = 1; j<=12;j++){
		  sunday.set(i, j,1);
		  
		  if(sunday.get(Calendar.DAY_OF_WEEK) == 1){
		  Count++;
		  	}
    
   
   		}
   }
   System.out.println("SundayCount:"+Count);
   }
   public static void main(String[] args) {
	   countSunday();
   }
   
}