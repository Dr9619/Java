import java.util.Scanner;

public class ChangeCal {
	public static void main (String[] args) {
		int price; //price of the item to be recieved from the user
		int c; //change
		int q=0; //No.of quarters
		int d=0; //No.of dimes
		int n=0; //No.of Nickels

		Scanner input = new Scanner(System.in); //created a scanner object

		System.out.print("Enter the price of the item (in cents): ");
		price = input.nextInt(); //storing the price in of the item in cost
		c = 100-price; //Since the price is 5<=price<=100(1 dollar)	
		if(c%5==0 && c>4 && c<101){		
			while(c>0){
			//If the change is greater than 25 then we count the no.of quarters to give out		
				while(c>=25) {
					c -= 25;
					q++;		
				}
				//We then calculate the no.of dimes to give out
				while(c<25 && c>=10) {
				c -= 10;
				d++;
				}
				//finally the no.of nickels to give out
				while(c<10 && c>=5) {
					c -= 5;
					n++;
				}
			}
		System.out.printf("%d quarters,\n%d dimes, and\n%d nickel\n", q,d,n);
		}
		else {
		System.out.printf("Please enter a valid price\n");		
		}
		
	}
}
