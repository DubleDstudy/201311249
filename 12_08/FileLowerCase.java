import java.io.*;
import java.util.Scanner;

public class FileLowerCase{
	
	public static void main(String[] args) throws FileNotFoundException {
		
	try	{	
		Scanner f=new Scanner(new File("test.txt"));
		String line = f.nextLine();
		System.out.println(line.toLowerCase());
		}
	catch(FileNotFoundException fnfe){
		System.out.println("error");
		}
	}

}