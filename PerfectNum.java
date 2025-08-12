//java program for checking perfect number 
package CSE;
import java.util.Scanner;
public class PerfectNum {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not a perfect number");
		}
	}

}
