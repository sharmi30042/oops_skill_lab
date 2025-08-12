//java program to convert temperatures
package CSE;
import java.util.Scanner;
public class Temperature {
	public static void main(String[] args)
	{
		float Ftemp,Ctemp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temp: ");
		Ftemp=sc.nextFloat();
		Ctemp=(Ftemp- 32) * 5 / 9;
		System.out.println(Ctemp + "  is Celsius temperature");
	}

}
