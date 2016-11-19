
import java.util.HashMap;
import java.util.Map;

public class P5_CharCount {
		
	static void CharCount(char[] letters){
		Map<Character,Integer> count = new HashMap<Character,Integer>();
	
	
		for(char c:letters){
		
			 if(count.containsKey(c)){
				 count.put(c, count.get(c)+1);
			 }
			 else{
				 count.put(c, 1);
			 }
			}
		System.out.print(letters);
		 System.out.println("\n"+"count");
		 System.out.print(count);
		 
		
	}
	
	
    
	
	public static void main(String[] args) {
		char[] cha= "sangmyung university".toCharArray();
		 CharCount(cha);
		
		
		
	}
}
