import java.util.Scanner;

public class Distance {
	public static void main (String[] args) {
		String point1; //coordinates of first point
		String point2; //coordniates of second point
		int pos; //used for the index of "," in the input string
		float p1x; //x-coordinate of first point
		float p1y; //y-coordinate of first point
		float p2x; //x-coordinate of second point
		float p2y; //y-coordinate of second point
		float dist; //distance between the two points

		Scanner input = new Scanner(System.in); //created a scanner object

		System.out.print("Enter coordinates of first point (x1,y1): ");
		point1 = input.nextLine(); //reading the string input of coordinates of first point
		System.out.print("Enter coordinates of second point (x2,y2): ");
		point2 = input.nextLine(); //getting the string input of coordinates of second point
		pos = point1.indexOf(","); //Assigning the index of "," in the input string of first point
		p1x = Float.parseFloat(point1.substring(1, pos)); //Assigning p1x the x-coordinate of first point
		p1y = Float.parseFloat(point1.substring(pos+1, point1.length()-1)); //Assigning p1y the y-coordinate of first point
		pos = point2.indexOf(","); //Assigning the index of "," in the input string of second point
		p2x = Float.parseFloat(point2.substring(1, pos)); //Assigning p2x the x-coordinate of second point
		p2y = Float.parseFloat(point2.substring(pos+1, point2.length()-1)); //Assigning p2y the y-coordinate of second point
		dist = (float) Math.sqrt(Math.pow(Math.abs(p2x-p1x), 2) + Math.pow(Math.abs(p2y-p1y), 2)); //Calculating the distance using the given formula		
		System.out.printf("The distance between the two points is: %f \n", dist);
	}
}
