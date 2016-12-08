import java.io.*;
import java.util.Scanner;

public class ScannerFile {
	
	public static void main(String[] args) throws FileNotFoundException {
		try{
		Scanner f=new Scanner(new File("test.txt"));
		String line = f.nextLine();
		System.out.println(line);
		}
		catch(FileNotFoundException f){
			System.out.println("not found");
		}
	}

}