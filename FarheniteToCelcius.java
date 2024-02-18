package day2;

import java.util.Scanner;

public class FarheniteToCelcius {

	public static void main(String[] args) {
		 float Temperature;
		 
		 Scanner in = new Scanner(System.in);
		 
		System.out.println("Enter temperature in Farhenite:");
		Temperature =  in.nextInt();
		
		Temperature = ((Temperature-32)*5)/9;
		System.out.println("Temperature in Celcius:"+Temperature);

	}

}
