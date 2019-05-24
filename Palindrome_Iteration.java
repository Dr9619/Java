//Dharshan Ravichandran
//dr899

//Importing Scanner from java.util class library
import java.util.Scanner;

public class Palindrome_Iteration {
	public static void main (String[] args) {
		String s;
		String s1;
		boolean check = true;
		while(check) {
			int t=0;	
			Scanner input = new Scanner(System.in); //created a scanner object
			System.out.print("Enter a potential palindrome: ");
			s = input.nextLine(); //storing the input string in s
	
			if (s.length()%2==0) { //Checking to see if the string length is even
				for(int i=0;i<s.length()/2;i++) { //i goes from 0 to half of the string length
					if(s.charAt(i)==s.charAt(s.length()-(1+i))) { //comparing characters
						t++; //increements a variable which would equal half the string length if palindrome
					}
				}
			}
			else {
				for(int i=0;i<Math.floor(s.length()/2);i++) { //If it is odd we ignore the middle char
					if(s.charAt(i)==s.charAt(s.length()-(1+i))) {
						t++;
					}
				}	
			}
			if (t==Math.floor(s.length()/2)) {
				System.out.println("That string IS a plaindrome");
			}
			else {
				System.out.println("That string is NOT a palindrome");
			}
			System.out.print("Test another palindrome (no-n/yes-any other key)? ");
			s1 = input.nextLine();
			if(s1.equals("n")) {
				check = false;
			}
		}
	}
}
