import java.io.*;
import java.util.Scanner;

public class FileWrite {
	
	public static void main(String[] args) throws IOException {
		try{
		FileWriter file = new FileWriter("testWrite.txt");
		BufferedWriter bf = new BufferedWriter(file);
		bf.write("buffer test");
		bf.close();
		}
		catch (IOException e){
			
		}
	}
}