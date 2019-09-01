package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		process(scan);
		
	}
	
	public static void process(Scanner s) {
		int numOfStoreItems = s.nextInt();
		
		StoreItems[] storeItems = new StoreItems[numOfStoreItems];
		
		for (int i = 0; i < numOfStoreItems; i++) {
			storeItems[i] = new StoreItems();
			storeItems[i].name = s.next();
			storeItems[i].price = s.nextDouble();
		}
		int [] customersPerItem= new int[numOfStoreItems];
		int numOfCusts = s.nextInt();
		Customers[] customers = new Customers[numOfCusts];
		for (int i = 0; i < numOfCusts; i++) {
//			customers[i] = new Customers();
//			customers[i].firstName = s.next();
//			customers[i].lastName = s.next();
//			customers[i].totalItems = s.nextInt();
			
			customers[i] = new Customers(0, s.next(),s.next() ,s.nextInt(),null);
			
			customers[i].items = new StoreItems[customers[i].totalItems];
			for  (int j = 0; j < customers[i].totalItems; j++) {
				
				customers[i].items[j] = new StoreItems();
				customers[i].items[j].count = s.nextInt();
				customers[i].items[j].name = s.next();
				//customers[i].items[j].price = s.nextDouble();
				
				for (int k = 0; k < numOfStoreItems; k++ ) {
					if (customers[i].items[j].name.contentEquals(storeItems[k].name)) {
						storeItems[k].count += customers[i].items[j].count;
						customersPerItem[k]++;
					}
				}
			}
		}
		for (int i = 0; i < numOfStoreItems; i++) {
			System.out.println(
					(customersPerItem[i]== 0 ? "No" : customersPerItem[i]) + 
					" customers bought " + 
							(customersPerItem[i]== 0 ? "" : storeItems[i].count ) +  
							" " + storeItems[i].name);
		}
	}
}
