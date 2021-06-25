refactor step:
    1. clean dead code
    2. extract constants(clean magic_number)
    3. rename variables and delete todo annotation
    4. extract append order detail, add generateOrderDetail function and generateItemDetail function
    5. remove for loop, add init getSalesTax and getTotalAmount in order class and lineItem class.
    6. remove receiptDetails and constants SALES_TAX_RATE in OrderReceipt class.