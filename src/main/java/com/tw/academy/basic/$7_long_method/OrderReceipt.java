package com.tw.academy.basic.$7_long_method;

/**
 * This class is a example for bad smell;
 *
 * @author  Thoughtworks
 * @version 1.0
 * @since   2018-1-1
 */
public class OrderReceipt {
    private final Order order;
    final double SALES_TAX_RATE = 0.1d;
    final String ORDER_HEAD = "======Printing Orders======\n";
    final String SALSES_TAX = "Sales Tax";
    final String TOTAL_AMOUNT = "Total Amount";

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        StringBuilder receiptDetails = new StringBuilder();

        receiptDetails.append(ORDER_HEAD);

        receiptDetails.append(order.getCustomerName());
        receiptDetails.append(order.getCustomerAddress());
        receiptDetails.append(order.generateOrderDetail());
        receiptDetails.append(SALSES_TAX).append('\t').append(order.getOrderTotalSalesTax());
        receiptDetails.append(TOTAL_AMOUNT).append('\t').append(order.getOrderTotalAmount());
        return receiptDetails.toString();
    }
}