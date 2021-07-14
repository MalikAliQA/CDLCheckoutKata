package com.cdl.checkoutkata;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

	static String name;
	static Integer price;
	static Integer spQuantity;
	static Integer spPrice;

	static Items itemA;
	static Items itemB;
	static Items itemC;
	static Items itemD;

	public static void pricing() {
		boolean flag = true;
		boolean flag2 = true;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Item Name");
		name = scan.nextLine();
		
		do {
			System.out.println("Is Item " + name + " on special offer? Y/N");
			String offer = scan.nextLine();
			if (offer.toLowerCase().equals("y")) {

				do {
					try {
						System.out.println("Enter Item " + name + " Normal Price in Pence");
						price = scan.nextInt();
						flag2 = false;
					} catch (InputMismatchException err) {
						System.out.println("Invalid input!");
						scan.next();
					}
				} while (flag2);
				flag2 = true;

				do {
					try {
						System.out.println("Enter Item " + name + " Special Offer Quantity");
						spQuantity = scan.nextInt();
						flag2 = false;
					} catch (InputMismatchException err) {
						System.out.println("Invalid input!");
						scan.next();
					}
				} while (flag2);
				flag2 = true;

				do {
					try {
						System.out.println("Enter Item " + name + " Special Offer Price");
						spPrice = scan.nextInt();
						flag2 = false;
					} catch (InputMismatchException err) {
						System.out.println("Invalid input!");
						scan.next();
					}
				} while (flag2);
				flag2 = true;

				System.out.println("Item " + name + " entered Successfully");
				flag = false;
				
				
			} else if (offer.toLowerCase().equals("n")) {
				do {
					try {
						System.out.println("Enter Item " + name + " Normal Price in Pence");
						price = scan.nextInt();
						flag2 = false;
					} catch (InputMismatchException err) {
						System.out.println("Invalid input!");
						scan.next();
					}
				} while (flag2);
				flag2 = true;
				
				System.out.println("Item " + name + " entered Successfully");
				spQuantity = null;
				spPrice = null;
				flag = false;
			} else {
				System.out.println("Please enter Y or N");
			}
		} while (flag);

	}

	public static void checkout() {
		Integer aCount = 0;
		Integer bCount = 0;
		Integer cCount = 0;
		Integer dCount = 0;

		Integer runningTotal = 0;

		boolean isValid = true;

		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("SCAN ITEM: A, B, C, D OR END to Finish");
			String check = scan.nextLine();
			if ("A".equals(check) || "B".equals(check) || "C".equals(check) || "D".equals(check)
					|| "END".equals(check)) {
				switch (check) {

				case "A":
					System.out.println("Scanning Item A");
					if (itemA.getSpecial_price() == null) {
						runningTotal = runningTotal + itemA.getItem_price();

					} else {
						aCount++;
						if (aCount % itemA.getSpecial_quant() == 0) {
							runningTotal = runningTotal + itemA.getItem_price();
							runningTotal = runningTotal - (itemA.getItem_price() * itemA.getSpecial_quant())
									+ itemA.getSpecial_price();

						} else {
							runningTotal = runningTotal + itemA.getItem_price();
						}
					}
					break;

				case "B":
					System.out.println("Scanning Item B");
					if (itemB.getSpecial_price() == null) {
						runningTotal = runningTotal + itemB.getItem_price();

					} else {
						bCount++;
						if (bCount % itemB.getSpecial_quant() == 0) {
							runningTotal = runningTotal + itemB.getItem_price();
							runningTotal = runningTotal - (itemB.getItem_price() * itemB.getSpecial_quant())
									+ itemB.getSpecial_price();

						} else {
							runningTotal = runningTotal + itemB.getItem_price();
						}
					}
					break;

				case "C":
					System.out.println("Scanning Item C");
					if (itemC.getSpecial_price() == null) {
						runningTotal = runningTotal + itemC.getItem_price();

					} else {
						cCount++;
						if (cCount % itemC.getSpecial_quant() == 0) {
							runningTotal = runningTotal + itemC.getItem_price();
							runningTotal = runningTotal - (itemC.getItem_price() * itemC.getSpecial_quant())
									+ itemC.getSpecial_price();

						} else {
							runningTotal = runningTotal + itemC.getItem_price();
						}
					}
					break;

				case "D":
					System.out.println("Scanning Item D");
					if (itemD.getSpecial_price() == null) {
						runningTotal = runningTotal + itemD.getItem_price();

					} else {
						dCount++;
						if (dCount % itemD.getSpecial_quant() == 0) {
							runningTotal = runningTotal + itemD.getItem_price();
							runningTotal = runningTotal - (itemD.getItem_price() * itemD.getSpecial_quant())
									+ itemD.getSpecial_price();

						} else {
							runningTotal = runningTotal + itemD.getItem_price();
						}
					}
					break;

				case "END":
					System.out.println("Ending Transaction");
					isValid = false;
					break;
				}

			} else {
				System.out.println("Please enter valid option");
			}
			System.out.println("Running Total: " + runningTotal + "p");
		} while (isValid);

		System.out.println("Transaction complete");
		System.out.println("Final Total: " + runningTotal + "p");

	}

	public static void main(String[] args) {

		pricing();
		if (spPrice == null) {
			itemA = new Items(name, price);
			System.out.println("Item " + itemA.getItem_name() + " " + itemA.getItem_price() + "p");
		} else {
			itemA = new Items(name, price, spQuantity, spPrice);
			System.out.println("Item " + itemA.getItem_name() + " " + itemA.getItem_price() + "p "
					+ itemA.getSpecial_quant() + " for " + itemA.getSpecial_price() + "p");
		}

		pricing();
		if (spPrice == null) {
			itemB = new Items(name, price);
			System.out.println("Item " + itemB.getItem_name() + " " + itemB.getItem_price() + "p");
		} else {
			itemB = new Items(name, price, spQuantity, spPrice);
			System.out.println("Item " + itemB.getItem_name() + " " + itemB.getItem_price() + "p "
					+ itemB.getSpecial_quant() + " for " + itemB.getSpecial_price() + "p");
		}

		pricing();
		if (spPrice == null) {
			itemC = new Items(name, price);
			System.out.println("Item " + itemC.getItem_name() + " " + itemC.getItem_price() + "p");
		} else {
			itemC = new Items(name, price, spQuantity, spPrice);
			System.out.println("Item " + itemC.getItem_name() + " " + itemC.getItem_price() + "p "
					+ itemC.getSpecial_quant() + " for " + itemC.getSpecial_price() + "p");
		}

		pricing();
		if (spPrice == null) {
			itemD = new Items(name, price);
			System.out.println("Item " + itemD.getItem_name() + " " + itemD.getItem_price() + "p");
		} else {
			itemD = new Items(name, price, spQuantity, spPrice);
			System.out.println("Item " + itemD.getItem_name() + " " + itemD.getItem_price() + "p "
					+ itemD.getSpecial_quant() + " for " + itemD.getSpecial_price() + "p");
		}

		checkout();
		System.out.println("Bye");

	}

}
