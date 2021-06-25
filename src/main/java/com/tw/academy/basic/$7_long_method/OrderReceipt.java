package com.tw.academy.basic.$7_long_method;

/**
 * This class is a example for bad smell;
 *
 * @author  Thoughtworks
 * @version 1.0
 * @since   2018-1-1
 */
public class OrderReceipt {
    private Order o;
    final double SALES_TAX_RATE = 0.1d;
    final String ORDER_HEAD = "======Printing Orders======\n";
    final String SALSES_TAX = "Sales Tax";
    final String TOTAL_AMOUNT = "Total Amount";

    public OrderReceipt(Order o) {
        this.o = o;
    }

    //todo: rename -- Tom
    public String printReceipt() {
        StringBuilder output = new StringBuilder();

        output.append(ORDER_HEAD);

        output.append(o.getCustomerName());
        output.append(o.getCustomerAddress());

        double totSalesTx = 0d;
        double tot = 0d;
        for (LineItem lineItem : o.getLineItems()) {
            output.append(lineItem.getDescription());
            output.append('\t');
            output.append(lineItem.getPrice());
            output.append('\t');
            output.append(lineItem.getQuantity());
            output.append('\t');
            output.append(lineItem.totalAmount());
            output.append('\n');

            double salesTax = lineItem.totalAmount() * SALES_TAX_RATE;
            totSalesTx += salesTax;

            tot += lineItem.totalAmount() + salesTax;
        }

        output.append(SALSES_TAX).append('\t').append(totSalesTx);

        output.append(TOTAL_AMOUNT).append('\t').append(tot);
        return output.toString();
    }
}