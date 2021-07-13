package com.cdl.checkoutkata;

import java.util.Scanner;

public class Runner {
	


	public static void main(String[] args) {
		
		Integer APrice = null;
		Integer ASpQuant = null ;
		Integer ASpPrice = null ;
		Items itemA = null;
				
		Integer BPrice = null;
		Integer BSpQuant = null ;
		Integer BSpPrice = null ;
		Items itemB = null;
		
		Integer CPrice = null;
		Integer CSpQuant = null ;
		Integer CSpPrice = null ;
		Items itemC = null;
		
		Integer DPrice = null;
		Integer DSpQuant = null ;
		Integer DSpPrice = null ;
		Items itemD = null;
		
		

		Scanner scan = new Scanner (System.in);
		System.out.println("Is Item A on special offer? Y/N");
		String offer = scan.nextLine();
		if(offer.toLowerCase().equals("y")) {
			System.out.println("Enter Item A Normal Price in Pence");
			APrice = scan.nextInt();
			System.out.println("Enter Item A Special Offer Quantity");
			ASpQuant = scan.nextInt();
			System.out.println("Enter Item A Special Offer Price");
			ASpPrice = scan.nextInt();	
			System.out.println("Item A entered Successfully");
			itemA = new Items ("A", APrice, ASpQuant, ASpPrice);
		}else {
			System.out.println("Enter Item A Normal Price in Pence");
			APrice = scan.nextInt();
			System.out.println("Item A entered Successfully");
			itemA = new Items ("A", APrice);
		}
		
		System.out.println("Item " + itemA.getItem_name() + " " + itemA.getItem_price() + " " + itemA.getSpecial_quant() + " for " + itemA.getSpecial_price());
		
		Scanner scan1 = new Scanner (System.in);
		System.out.println("Is Item B on special offer? Y/N");
		String offerB = scan1.nextLine();
		if(offerB.toLowerCase().equals("y")) {
			System.out.println("Enter Item B Normal Price in Pence");
			BPrice = scan1.nextInt();
			System.out.println("Enter Item B Special Offer Quantity");
			BSpQuant = scan1.nextInt();
			System.out.println("Enter Item B Special Offer Price");
			BSpPrice = scan1.nextInt();	
			System.out.println("Item B entered Successfully");
			itemB = new Items ("B", BPrice, BSpQuant, BSpPrice);
		}else {
			System.out.println("Enter Item B Normal Price in Pence");
			BPrice = scan1.nextInt();		
			System.out.println("Item B entered Successfully");
			itemB = new Items ("B", BPrice);
		}
		
		System.out.println("Item " + itemB.getItem_name() + " " + itemB.getItem_price() + " " + itemB.getSpecial_quant() + " for " + itemB.getSpecial_price());
		
		Scanner scan2 = new Scanner (System.in);
		System.out.println("Is Item C on special offer? Y/N");
		String offerC = scan2.nextLine();
		if(offerC.toLowerCase().equals("y")) {
			System.out.println("Enter Item C Normal Price in Pence");
			CPrice = scan2.nextInt();
			System.out.println("Enter Item C Special Offer Quantity");
			CSpQuant = scan2.nextInt();
			System.out.println("Enter Item C Special Offer Price");
			CSpPrice = scan2.nextInt();	
			System.out.println("Item C entered Successfully");
			itemC = new Items ("C", CPrice, CSpQuant, CSpPrice);
		}else {
			System.out.println("Enter Item C Normal Price in Pence");
			CPrice = scan2.nextInt();		
			System.out.println("Item C entered Successfully");
			itemC = new Items ("C", CPrice);
		}

		System.out.println("Item " + itemC.getItem_name() + " " + itemC.getItem_price() + " " + itemC.getSpecial_quant() + " for " + itemC.getSpecial_price());
		
		Scanner scan3 = new Scanner (System.in);
		System.out.println("Is Item D on special offer? Y/N");
		String offerD = scan3.nextLine();
		if(offerD.toLowerCase().equals("y")) {
			System.out.println("Enter Item D Normal Price in Pence");
			DPrice = scan3.nextInt();
			System.out.println("Enter Item D Special Offer Quantity");
			DSpQuant = scan3.nextInt();
			System.out.println("Enter Item D Special Offer Price");
			DSpPrice = scan3.nextInt();	
			System.out.println("Item D entered Successfully");
			itemD = new Items ("D", DPrice, DSpQuant, DSpPrice);
		}else {
			System.out.println("Enter Item D Normal Price in Pence");
			DPrice = scan3.nextInt();		
			System.out.println("Item D entered Successfully");
			itemD = new Items ("D", DPrice);
		}
		
		System.out.println("Item " + itemD.getItem_name() + " " + itemD.getItem_price() + " " + itemD.getSpecial_quant() + " for " + itemD.getSpecial_price());
	}
	
	//do i really need constructors can just use the varibles???
	

}
