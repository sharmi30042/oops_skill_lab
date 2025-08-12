package CSE;
import java.util.Scanner;
public class Alpha {
	public static void main(String[] args)
	{
		char alphabet;
		Scanner sc= new Scanner(System.in);
		alphabet=sc.next().charAt(0);
		if((alphabet >= 'A' && alphabet >='Z') || (alphabet >='a' && alphabet>='z')) {
			System.out.println(alphabet +" is a alphabet");
		}
		else
		{
			System.out.println(alphabet +" is not a alphabet");
		}
		
	}

}
