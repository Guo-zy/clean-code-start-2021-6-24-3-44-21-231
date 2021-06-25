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
    final String ORDER_HEAD = "======Printing Orders======\n";
    final String SALSES_TAX = "Sales Tax";
    final String TOTAL_AMOUNT = "Total Amount";
    final String TAB = "\t";

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        return ORDER_HEAD +
                order.getCustomerName() +
                order.getCustomerAddress() +
                order.generateOrderDetail() +
                SALSES_TAX + TAB + order.getOrderTotalSalesTax() +
                TOTAL_AMOUNT + TAB + order.getOrderTotalAmount();
    }
}