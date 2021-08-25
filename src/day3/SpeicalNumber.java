package day3;
import java.util.Scanner;
public class SpeicalNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 int n,t,r,sum,mul,add ;
		 System.out.println("Enter The Number");
		 n = sc.nextInt();
		 t=n;
		 r=n%10;
		 n=n/10;
		 sum= r+n;
		 mul=r*n;
		 add=sum+mul;
		 if (t==add) {
			 System.out.println("Speical Number");}
		 
			 else {
				 System.out.println("Not Speical Number");
			 }
		 }
		 
	}


