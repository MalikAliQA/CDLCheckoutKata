package com.cdl.checkoutkata;

import java.util.Scanner;

public class Runner {
	
	static Integer aPrice;
	static Integer aSpQuant;	
	static Integer aSpPrice;
	static Items itemA;
			
	static Integer bPrice; 
	static Integer bSpQuant;
	static Integer bSpPrice; 
	static Items itemB; 
	
	static Integer cPrice; 
	static Integer cSpQuant; 
	static Integer cSpPrice; 
	static Items itemC; 
	
	static Integer dPrice; 
	static Integer dSpQuant; 
	static Integer dSpPrice; 
	static Items itemD; 
	
	public static void pricing() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Is Item A on special offer? Y/N");
		String offer = scan.nextLine();
		if(offer.toLowerCase().equals("y")) {
			System.out.println("Enter Item A Normal Price in Pence");
			aPrice = scan.nextInt();
			System.out.println("Enter Item A Special Offer Quantity");
			aSpQuant = scan.nextInt();
			System.out.println("Enter Item A Special Offer Price");
			aSpPrice = scan.nextInt();	
			System.out.println("Item A entered Successfully");
			itemA = new Items ("A", aPrice, aSpQuant, aSpPrice);
		}else {
			System.out.println("Enter Item A Normal Price in Pence");
			aPrice = scan.nextInt();
			System.out.println("Item A entered Successfully");
			itemA = new Items ("A", aPrice);
		}
		
		System.out.println("Item " + itemA.getItem_name() + " " + itemA.getItem_price() + " " + itemA.getSpecial_quant() + " for " + itemA.getSpecial_price());
		
		Scanner scan1 = new Scanner (System.in);
		System.out.println("Is Item B on special offer? Y/N");
		String offerB = scan1.nextLine();
		if(offerB.toLowerCase().equals("y")) {
			System.out.println("Enter Item B Normal Price in Pence");
			bPrice = scan1.nextInt();
			System.out.println("Enter Item B Special Offer Quantity");
			bSpQuant = scan1.nextInt();
			System.out.println("Enter Item B Special Offer Price");
			bSpPrice = scan1.nextInt();	
			System.out.println("Item B entered Successfully");
			itemB = new Items ("B", bPrice, bSpQuant, bSpPrice);
		}else {
			System.out.println("Enter Item B Normal Price in Pence");
			bPrice = scan1.nextInt();		
			System.out.println("Item B entered Successfully");
			itemB = new Items ("B", bPrice);
		}
		
		System.out.println("Item " + itemB.getItem_name() + " " + itemB.getItem_price() + " " + itemB.getSpecial_quant() + " for " + itemB.getSpecial_price());
		
		Scanner scan2 = new Scanner (System.in);
		System.out.println("Is Item C on special offer? Y/N");
		String offerC = scan2.nextLine();
		if(offerC.toLowerCase().equals("y")) {
			System.out.println("Enter Item C Normal Price in Pence");
			cPrice = scan2.nextInt();
			System.out.println("Enter Item C Special Offer Quantity");
			cSpQuant = scan2.nextInt();
			System.out.println("Enter Item C Special Offer Price");
			cSpPrice = scan2.nextInt();	
			System.out.println("Item C entered Successfully");
			itemC = new Items ("C", cPrice, cSpQuant, cSpPrice);
		}else {
			System.out.println("Enter Item C Normal Price in Pence");
			cPrice = scan2.nextInt();		
			System.out.println("Item C entered Successfully");
			itemC = new Items ("C", cPrice);
		}

		System.out.println("Item " + itemC.getItem_name() + " " + itemC.getItem_price() + " " + itemC.getSpecial_quant() + " for " + itemC.getSpecial_price());
		
		Scanner scan3 = new Scanner (System.in);
		System.out.println("Is Item D on special offer? Y/N");
		String offerD = scan3.nextLine();
		if(offerD.toLowerCase().equals("y")) {
			System.out.println("Enter Item D Normal Price in Pence");
			dPrice = scan3.nextInt();
			System.out.println("Enter Item D Special Offer Quantity");
			dSpQuant = scan3.nextInt();
			System.out.println("Enter Item D Special Offer Price");
			dSpPrice = scan3.nextInt();	
			System.out.println("Item D entered Successfully");
			itemD = new Items ("D", dPrice, dSpQuant, dSpPrice);
		}else {
			System.out.println("Enter Item D Normal Price in Pence");
			dPrice = scan3.nextInt();		
			System.out.println("Item D entered Successfully");
			itemD = new Items ("D", dPrice);
		}
		
		System.out.println("Item " + itemD.getItem_name() + " " + itemD.getItem_price() + " " + itemD.getSpecial_quant() + " for " + itemD.getSpecial_price());
		
	}
	
	
	public static void checkout() {
		Integer aCount = 0;
		Integer bCount = 0;
		Integer cCount = 0;
		Integer dCount = 0;
		
		Integer runningTotal = 0;
		
		
		boolean isValid = true;

		do
		{
			Scanner scan = new Scanner (System.in);
			System.out.println("SCAN ITEM: A, B, C, D OR END to Finish");
			String check = scan.nextLine();
			if("A".equals(check) || "B".equals(check) || "C".equals(check) || "D".equals(check) || "END".equals(check)) {
				switch (check) {
				  
				
				case "A":
				    System.out.println("Scanning Item A");
				    if(itemA.getSpecial_price() == null) {
				    	runningTotal = runningTotal + itemA.getItem_price();
				  
				    }else {
				      	aCount++;
				    	if(aCount % itemA.getSpecial_quant() == 0 ) {
				    		runningTotal = runningTotal + itemA.getItem_price();
				    		runningTotal = runningTotal - (itemA.getItem_price()*itemA.getSpecial_quant()) + itemA.getSpecial_price();
				    					    		
				    	}else {
				    		runningTotal = runningTotal + itemA.getItem_price();
				    	}
				    }
				    break;
				    
				    
				  case "B":
				    System.out.println("Scanning Item B");
				    if(itemB.getSpecial_price() == null) {
				    	runningTotal = runningTotal + itemB.getItem_price();
				  
				    }else {
				      	bCount++;
				    	if(bCount % itemB.getSpecial_quant() == 0 ) {
				    		runningTotal = runningTotal + itemB.getItem_price();
				    		runningTotal = runningTotal - (itemB.getItem_price()*itemB.getSpecial_quant()) + itemB.getSpecial_price();
				    					    		
				    	}else {
				    		runningTotal = runningTotal + itemB.getItem_price();
				    	}
				    }
				    break;
				 
				  
				  case "C":
				   System.out.println("Scanning Item C");
				    if(itemC.getSpecial_price() == null) {
				    	runningTotal = runningTotal + itemC.getItem_price();
				  
				    }else {
				      	cCount++;
				    	if(cCount % itemC.getSpecial_quant() == 0 ) {
				    		runningTotal = runningTotal + itemC.getItem_price();
				    		runningTotal = runningTotal - (itemC.getItem_price()*itemC.getSpecial_quant()) + itemC.getSpecial_price();
				    					    		
				    	}else {
				    		runningTotal = runningTotal + itemC.getItem_price();
				    	}
				    }
				    break;
				    
				    
				  case "D":
					  System.out.println("Scanning Item D");
					    if(itemD.getSpecial_price() == null) {
					    	runningTotal = runningTotal + itemD.getItem_price();
					  
					    }else {
					      	dCount++;
					    	if(dCount % itemD.getSpecial_quant() == 0 ) {
					    		runningTotal = runningTotal + itemD.getItem_price();
					    		runningTotal = runningTotal - (itemD.getItem_price()*itemD.getSpecial_quant()) + itemD.getSpecial_price();
					    					    		
					    	}else {
					    		runningTotal = runningTotal + itemD.getItem_price();
					    	}
					    }
				    break;
				    
				    
				    
				  case "END":
					    System.out.println("Ending Transaction");
					    isValid = false;
					    break;
				}
				
			}else {
				System.out.println("Please enter valid option");
			}
			System.out.println("Running Total: " + runningTotal);
		}while(isValid);

		
		System.out.println("Transaction complete");
		System.out.println("Final Total: " + runningTotal);
		
	}
	


	public static void main(String[] args) {		
		
		pricing();
		checkout();
		System.out.println("Bye");
		
	}
		

}
