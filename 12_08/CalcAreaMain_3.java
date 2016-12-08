import java.util.Scanner;


public class CalcAreaMain_3{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("input r:");
         double r = sc.nextDouble();
         double area = Math.PI*Math.pow(r,2);
         System.out.printf("r  %.1f area  %.1f",r,area);      	
         
    }
}