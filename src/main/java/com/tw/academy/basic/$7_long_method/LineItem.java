package com.tw.academy.basic.$7_long_method;

public class LineItem {
	private String description;
	private double price;
	private int quantity;
	private final double SALES_TAX_RATE = 0.1d;
	private final String TAB = "\t";
	private final String NEWLINE = "\n";

	public LineItem(String description, double p, int quantity) {
		super();
		this.description = description;
		this.price = p;
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

    double totalAmount() {
        return price * quantity;
    }

    public String generateItemDetail(){
		return getDescription() + TAB + getPrice() + TAB +  getQuantity() + TAB+ totalAmount() + NEWLINE;
	}
	public double getItemSalesTax(){
		return totalAmount() * SALES_TAX_RATE;
	}
	public double getItemTotalAmount(){
		return totalAmount() + getItemSalesTax();
	}

}