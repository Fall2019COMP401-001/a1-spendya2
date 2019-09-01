package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		process(scan);
	}
				
		public static void process(Scanner s) {
			int customerCount = s.nextInt();
			
			for(int i = 0; i <= customerCount; i++) {
				double total = 0;
				String firstName = s.next();
				String lastName = s.next();
				int groceries = s.nextInt();
				for (int j = 0; j < groceries; j++) {
					int quantity = s.nextInt();
					String itemName = s.next();
					double price = s.nextDouble();
					double cost = price * quantity;
					total += cost;
				}

				System.out.println(" " + firstName.charAt(0) + "." + " " + lastName + ": " + String.format("%.2f", total));
			}
		}
}