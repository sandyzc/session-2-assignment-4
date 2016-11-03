package assignments;

import java.util.Scanner;

public class HighestOfThreeNumbers {


		public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			// enter the integer
			System.out.println("Enter the first integer");
			int a = s.nextInt();
			System.out.println("Enter the second integer");
			int b = s.nextInt();
			System.out.println("Enter the Third integer");
			int c = s.nextInt();
			// checks if a is greater than b and c
			if ( a>b && a>c ){
				System.out.println(" The first integer "+a +" is greater than "+b + " and " +c);
			} // if a isn't greater checks if b is greater than a & c
			else {
				if( b > a && b>c){
					System.out.println(" The Second integer "+b +" is greater than "+a + " and " +c);
				} // if both a and bis smaller than c is printed out
				else {
					System.out.println(" The Third integer "+c +" is greater than "+b + " and " +a);
				}
			}

		}

	


	}


