public class InvoiceMain {
    public static void main(String[] args) {
        double[] prices = {19.99, 8.79, 15.99};
        int[] units = {12, 8, 9};
        String[] descriptions = {"Pen", "Mug", "T-Shirt"};

        Invoice inv1 = new Invoice(prices, units, descriptions);


        String filename = "invoice.dat";
        inv1.saveInvoiceToFile(filename);
        double total = inv1.readInvoiceFromFileAndCalculateTotal(filename);

        System.out.printf("Total: %.2f%n", total);
    }
}
