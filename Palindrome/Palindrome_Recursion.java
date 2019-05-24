import java.util.Scanner;

public class Palindrome_Recursion {
	
	public static void PalindromeTester(String s,int i, int j, int t) {
		String s1;
		String p;
		if(i<Math.floor(s.length()/2)) { //Checking to see if we have checked the first half characters of the string
			if (s.charAt(i)==s.charAt(j)) {
				t++;		
			}
			PalindromeTester(s, i+1, j-1, t); //We increment to the left and decrement to the right all the while incrementing an variable t when the characters match
		}
		else {
			if (t==Math.floor(s.length()/2)) {
				System.out.println("That string IS a plaindrome\n");
			}
			else {
				System.out.println("That string is NOT a palindrome\n");
			}
			Scanner input = new Scanner(System.in);
			System.out.print("Test another palindrome (y/n)? ");
			s1 = input.nextLine();
			if (s1.equals("y")) {
				System.out.print("Enter a potential palindrome: ");
				p = input.nextLine();
				PalindromeTester(p, 0, p.length()-1, 0); //If it is y then the PalindromeTester is run from the start
			}
			else {
				return; //If it is a n then it returns to main
			}
		}
		
	}

	public static void main (String[] args) {
		
		String pal;
		Scanner input = new Scanner(System.in); //created a scanner object

		System.out.print("Enter a potential palindrome: ");
		pal = input.nextLine(); //storing the input string in pal
		PalindromeTester(pal, 0, pal.length()-1, 0);
	}
}
