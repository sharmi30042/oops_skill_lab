//java program using while loop
package CSE;
import java.util.Scanner;
public class While {
	public static void main(String[] args) {
		int i=1,n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		while(i<=n) {
			System.out.println("i= "+i);
			i++;
		}
	}

}
