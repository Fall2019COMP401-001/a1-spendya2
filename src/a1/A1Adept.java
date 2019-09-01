package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		process(scan);
	}
	
	public static void process(Scanner s) {
		int numOfItems = s.nextInt();
		String[] itemName = new  String[numOfItems];
		double[] itemPrice = new double[numOfItems];
		
		for (int i = 0; i < numOfItems; i++) {
			itemName[i] = s.next();
			itemPrice[i] = s.nextDouble();
		}
		
		int numOfCusts = s.nextInt();
		String[] firstName = new String[numOfCusts];
		String[] lastName = new String[numOfCusts];
		
		double[] finalCost = new double[numOfCusts];
		
		for (int i = 0; i < numOfCusts; i++) {
			firstName[i] = s.next();
			lastName[i] = s.next();
			
			int totalItemsBought = s.nextInt();
			
			double fullCost = 0;
			
			for (int j = 0; j < totalItemsBought; j++) {
				int quantity = s.nextInt();
				String name = s.next();
			
				for (int k = 0; k < numOfItems; k++) {
				if (name.contentEquals(itemName[k])) {
					fullCost += quantity * itemPrice[k];
					}
				}
			}	
			finalCost[i] = fullCost;
		}
		
		int maxIndex =  0;
		int minIndex = 0;
		double max = finalCost[0];
		double  min = finalCost[0];
		double value = 0;
		
		
	
		for (int i =0; i < numOfCusts; i++) {
			if (finalCost[i] > max) {
				max = finalCost[i];
				maxIndex = i;
			}
			
			if (finalCost[i] < min) {
				min = finalCost[i];
				minIndex = i;	
			}
		}
		
		for (int i = 0; i < numOfCusts; i++) {
			value += finalCost[i];
		}
		String maxString = String.format("%,.2f", finalCost[maxIndex]);
		String minString = String.format("%,.2f", finalCost[minIndex]);
		String average = String.format("%,.2f", value/numOfCusts);
		
		System.out.println("Biggest: " + firstName[maxIndex] + " " + lastName[maxIndex] + " (" + maxString + ")" );
		System.out.println("Smallest: " + firstName[minIndex] + " " + lastName[minIndex] + " (" + minString + ")" );
		System.out.println("Average: " + average);
	}
}
	

