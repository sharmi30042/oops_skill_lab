//Java program to check whether a number is even or odd 
package CSE;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args)
	{
		int num; 
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println(num + " Even Number" );
		}
		else 
		{
			System.out.println(num +" Odd Number");
		}
	}

}
