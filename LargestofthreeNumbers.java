package day2;

import java.util.Scanner;

public class LargestofthreeNumbers {
		public static void main(String [] args)
		{
			
			int x,y,z;
			System.out.println("enter value of x,y,z:");
			Scanner in = new Scanner(System.in);
			
			x=in.nextInt();
			y=in.nextInt();
			z=in.nextInt();
			
			if(x>y && x>z) {
				System.out.println("first no is Largest");
			}
			else if(y>x && y>z) {
				System.out.println("Second no is largest");
			}
			else if(z>x && z<y) {
				System.out.println("Third no is Largest");
			}
			else
				System.out.println("Entered no are not distinct");
			
		}
}
