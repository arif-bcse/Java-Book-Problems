package problem.hardware.invoice;

public class Main {
    public static void main(String[] args) {

        Invoice in = new Invoice("A1028", "Cloathings", 2, 550);

        System.out.println(in.getInvoiceAmount());

    }
}