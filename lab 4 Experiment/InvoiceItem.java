//public  Create a class called InvoiceItem, which models an item of an invoice, with ID, description, quantity and unit price. Add methods for discount applying discount and taxes as well. In addition, display the invoice generated for the user’s input regarding the respective details.


import java.util.Scanner;
class InvoiceItem {
    // Instance variables
    private String id;
    private String description;
    private int quantity;
    private double unitPrice;
    private double discountPercentage;
    private double taxPercentage;
    // Constructor to initialize the invoice item
    public InvoiceItem(String id, String description, int quantity, double unitPrice, double discountPercentage, double taxPercentage) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.discountPercentage = discountPercentage;
        this.taxPercentage = taxPercentage;}
    // Method to calculate the total price before discount and tax
    public double getTotalBeforeDiscountAndTax() {
        return quantity * unitPrice;}
    // Method to calculate discount amount
    public double getDiscountAmount() {
        return (getTotalBeforeDiscountAndTax() * discountPercentage) / 100;}
    // Method to calculate tax amount
    public double getTaxAmount() {
        return ((getTotalBeforeDiscountAndTax() - getDiscountAmount()) * taxPercentage) / 100;}
    // Method to calculate final total price after discount and tax
    public double getFinalTotal() {
        return getTotalBeforeDiscountAndTax() - getDiscountAmount() + getTaxAmount(); }
    // Method to display invoice
    public void displayInvoice() {
        System.out.println("\n========== INVOICE ==========");
        System.out.println("Item ID       : " + id);
        System.out.println("Description   : " + description);
        System.out.println("Quantity      : " + quantity);
        System.out.printf("Unit Price    : %.2f%n", unitPrice);
        System.out.printf("Total Before Discount & Tax: %.2f%n", getTotalBeforeDiscountAndTax());
        System.out.printf("Discount (%.2f%%): -%.2f%n", discountPercentage, getDiscountAmount());
        System.out.printf("Tax (%.2f%%): +%.2f%n", taxPercentage, getTaxAmount());
        System.out.printf("Final Total   : %.2f%n", getFinalTotal());
        System.out.println("=============================\n");}
    public static void main(String[] args) {
        // Taking user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Item ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Description: ");
        String description = scanner.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter Unit Price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        double discountPercentage = scanner.nextDouble();

        System.out.print("Enter Tax Percentage: ");
        double taxPercentage = scanner.nextDouble();

        InvoiceItem item = new InvoiceItem(id, description, quantity, unitPrice, discountPercentage, taxPercentage);
        item.displayInvoice();
        scanner.close();
    }
}

