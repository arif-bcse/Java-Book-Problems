package problem.hardware.invoice;

public class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double price_per_item;

    public Invoice(String number, String description, int quantity, double price_per_item) {
        this.description = description;
        this.quantity = quantity;
        this.price_per_item = price_per_item;
        this.number = number;
    }
    public double getInvoiceAmount(){
        if(quantity<0)
            quantity=0;
        if(price_per_item<0)
            price_per_item = 0.0;

        return quantity*price_per_item;


    }
}
