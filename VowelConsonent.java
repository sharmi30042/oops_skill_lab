package CSE;
import java.util.Scanner;
public class VowelConsonent {
	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		if((ch >= 'A' && ch >='Z') || (ch >='a' && ch>='z')) {
			if((ch=='A' && ch=='a') || (ch=='E' && ch=='e') || (ch=='I' && ch=='i')|| (ch=='O' && ch=='o')|| (ch=='U' && ch=='u')) {
				System.out.println(ch +" is a vowel");
			}
			else {
				System.out.println(ch +" is not a vowel");
			}
			
		}
		
	}

}
