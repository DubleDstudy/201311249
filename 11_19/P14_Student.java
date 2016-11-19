import java.util.ArrayList;
import java.util.Collections;

class P14_Student implements Comparable<P14_Student>{
	
	private int number;
	private String name;
public P14_Student(String name, int number){
	this.name = name;
	this.number = number;
	}

public String getName(){
	return name;
}
public void setName(String name){
	this.name = name;
}
public int getNumber(){
	return number;
}
public void setNumber(int number){
	this.number =number;
	
}

public int compareTo(P14_Student st){
	return name.compareTo(((P14_Student) st).name);
	}

 public static void main(String[] args) {
	ArrayList<P14_Student> studentNameList = new ArrayList<P14_Student>();
	 studentNameList.add(new P14_Student("dy",1));
	 studentNameList.add(new P14_Student("sm",3));
	 studentNameList.add(new P14_Student("hs",2));
	 studentNameList.add(new P14_Student("ab",4));
	 studentNameList.add(new P14_Student("ac",5));
	 
	System.out.println("Nosort---");
	for (P14_Student st : studentNameList) {
        System.out.println(st.getName() + ", "+st.getNumber() );
	}
	System.out.println("sort!");
	Collections.sort(studentNameList);
	for (P14_Student st : studentNameList) {
        System.out.println(st.getName() + ", "+st.getNumber() );
	}
	
	
	
 		}
 }