package com.tw.academy.basic.$7_long_method;

import java.util.List;
import java.util.stream.Collectors;

public class Order {
    String customerName;
    String address;
    List<LineItem> lineItems;

    public Order(String customerName, String address, List<LineItem> lineItems) {
        this.customerName = customerName;
        this.address = address;
        this.lineItems = lineItems;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return address;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public String generateOrderDetail(){
        return lineItems.stream().map(LineItem::generateItemDetail).collect(Collectors.joining());
    }

    public double getOrderTotalAmount(){
        return lineItems.stream().mapToDouble(LineItem::getItemTotalAmount).sum();
    }

    public double getOrderTotalSalesTax(){
        return lineItems.stream().mapToDouble(LineItem::getItemSalesTax).sum();
    }
}
