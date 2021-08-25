package day3;
import java.util.Scanner;
public class TrendyNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int a,b = 0, t = 0;
		System.out.println("Enter The Number");
		a = sc.nextInt();
		
		while (a != 0) 
		{
			a/=10;
			t ++ ;
		}
		if (t!=3) {
			System.out.println("It Is a NOT Trendy Number ");
		}
		else {
			b = (a/10)%10 ;
			System.out.println("It Is Trendy Number ");
		}
		
	}


}
