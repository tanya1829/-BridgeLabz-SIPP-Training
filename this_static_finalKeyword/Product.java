
public class Product {
    static double discount = 10.0;

    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void display() {
        if (this instanceof Product) {
            System.out.println("Product: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("ID: " + productID);
            System.out.println("Discount: " + discount + "%");
            System.out.println();
        }
    }
}
