package com.cdl.checkoutkata;

public class Items {
	
	private String item_name;
	private Integer item_price;
	private Integer special_quant;
	private Integer special_price;
	
	public Items(String item_name, Integer item_price) {
		super();
		this.item_name = item_name;
		this.item_price = item_price;
			
	}
	
	public Items(String item_name, Integer item_price, Integer special_quant, Integer special_price) {
		super();
		this.item_name = item_name;
		this.item_price = item_price;
		this.special_quant = special_quant;
		this.special_price = special_price;
			
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public Integer getItem_price() {
		return item_price;
	}

	public void setItem_price(Integer item_price) {
		this.item_price = item_price;
	}

	public Integer getSpecial_quant() {
		return special_quant;
	}

	public void setSpecial_quant(Integer special_quant) {
		this.special_quant = special_quant;
	}

	public Integer getSpecial_price() {
		return special_price;
	}

	public void setSpecial_price(Integer special_price) {
		this.special_price = special_price;
	}
	
	
	

}
