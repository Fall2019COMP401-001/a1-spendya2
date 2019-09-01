package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		process(scan);
	}
	
	public static void process(Scanner s) {
		int numOfStoreItems = s.nextInt();
		
		StoreItems[] storeItems = new StoreItems[numOfStoreItems];
		
		for (int i = 0; i < numOfStoreItems; i++) {
			storeItems[i].name = s.next();
			storeItems[i].price = s.nextDouble();
		}
		
		int numOfCusts = s.nextInt();
		Customers[] customers = new Customers[numOfCusts];
		
		double total = 0;
		
		for (int i = 0; i < numOfCusts; i++) {
			customers[i].firstName = s.next();
			customers[i].lastName = s.next();
			customers[i].totalItems = s.nextInt();
		
			for  (int j = 0; j < customers[i].totalItems; j++) {
				int quantity = s.nextInt();
				String itemName = s.next();
				for (int k = 0; k < numOfStoreItems; k++) {
					if (itemName.contentEquals(storeItems[k].name)) {
						double cost = quantity * storeItems[k].price;
						total += cost;
					}
				}
			}
		}
		
		for (int i = 0; i < customers[i].totalItems; i++) {
			customers[i].totalCost = total;
			double maxCost = customers[i].totalCost;
			String maxName = customers[i].firstName + customers[i].lastName;
			for (int j = 0; j < numOfCusts; j++) {
				if (customers[j].totalCost > customers[j+1].totalCost) {
					maxCost = customers[j].totalCost;
					maxName = customers[j].firstName + " " + customers[j].lastName;
				}
			}
			System.out.println("Biggest: " + maxName + " (" + maxCost + ")" );
		}
		
		for (int i = 0; i < customers[i].totalItems; i++) {
			double minCost = customers[i].totalCost;
			String minName = customers[i].firstName + customers[i].lastName;
			for (int j = 0; j < numOfCusts; j++) {
				if (customers[j].totalCost < customers[j+1].totalCost) {
					minCost = customers[j].totalCost;
					minName = customers[j].firstName + " " + customers[j].lastName;
				}
				System.out.println("Smallest: " + minName + " (" + minCost + ")" );
			}
		}
	}
}

