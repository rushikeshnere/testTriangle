package test.triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleTest {

	public static void main(String args[])
	{
		double sideALength, sideBLength, sideCLength;

		try
		{
			Scanner userInputScanner = new Scanner(System.in);
			System.out.println("Please enter the length of side A of triangle:");
			sideALength = userInputScanner.nextDouble();
			System.out.println("Please enter the length of side B of triangle:");
			sideBLength = userInputScanner.nextDouble();
			System.out.println("Please enter the length of side C of triangle:");
			sideCLength = userInputScanner.nextDouble();

			if(sideALength <=0 || sideBLength <= 0 || sideCLength <= 0)
			{
				System.out.println("Invalid user input. Triangle can not have length of a side lesser than or equals to 0");
			}
			else
			{
				TriangleFactory triangleFactory = new TriangleFactory();
				Triangle triangle = triangleFactory.getTriangle(sideALength, sideBLength, sideCLength);
				System.out.println("Type of a triangle is " + triangle.getTriangleType());
			}
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid user input.");
		}
	}
}
