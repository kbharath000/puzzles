package com.biginfo;

import java.util.Scanner;

public class AirLineFleetCalculator {
	private static Scanner scanner;

	public static void main(String[] args)

	{
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);

		float rangeOfPlane;

		int numberOfPlanes = 0;

		float planetCircumference = 100;

		float distaceTravelledByPlane = 0;
		System.out
		.println("Enter the Range of Plane between 0 and 1 (sample : 0.5)");

		rangeOfPlane = scanner.nextFloat();

		System.out.println(rangeOfPlane);

		// Evaluate the input

		if (rangeOfPlane <= 0.0 || rangeOfPlane >= 1.0) {

			throw new IllegalArgumentException(
					"Range should be in  between 0.1 and 1 (sample: 0.5");
		}

		// Convert the input by multiplying with 100

		float Range = rangeOfPlane * 100;

		// Display the range of a plane

		System.out.println("Range of 1 Plane" + Range
				+ "% of circumference of the planet");

		while (distaceTravelledByPlane < planetCircumference) {

			++numberOfPlanes;

			distaceTravelledByPlane = (Range / numberOfPlanes)
					+ distaceTravelledByPlane;

			if (distaceTravelledByPlane < 100)
				System.out.println("% of planet circumference flown using "
						+ numberOfPlanes + " planes is "
						+ distaceTravelledByPlane);

		}

		// Minimum number of planes required to complete the journey
		System.out.println("Circum Navigation of the planet is complete....");
		System.out
		.println("Minimum number of planes required to complete the journey  ="
				+ numberOfPlanes);
	}

}
