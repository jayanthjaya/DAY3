package day3;
import java.util.Scanner;
public class Print2 {

	public static void main(String[] args) {
	
		int a,b ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Values Of A");
		a = sc.nextInt();
		System.out.println("Enter The Values Of B");
		b = sc.nextInt();	
		
		while (b<=a) 
		{
			System.out.println(a);
			
			a-- ;
		}
	}

}
