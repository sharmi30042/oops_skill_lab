//java program using switch case
package CSE;
import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
		int day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day number:");
		day=sc.nextInt();
		switch(day) {
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		default : System.out.println("Other Day"); break;
		
		}
		
	}

}
