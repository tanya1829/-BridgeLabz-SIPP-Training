package JavaGenerics;
interface Category {
    String getCategoryName();
}

class BookCategory implements Category {
    @Override
    public String getCategoryName() {
        return "Books";
    }
}

class ClothingCategory implements Category {
    @Override
    public String getCategoryName() {
        return "Clothing";
    }
}

class GadgetCategory implements Category {
    @Override
    public String getCategoryName() {
        return "Gadgets";
    }
}

// ===== Generic Product Class =====
class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public T getCategory() { return category; }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {
        System.out.println("Product: " + name +
                ", Category: " + category.getCategoryName() +
                ", Price: ₹" + price);
    }
}

// ===== Utility Class for Generic Method =====
class MarketplaceUtils {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountedPrice = product.getPrice() * (1 - percentage / 100.0);
        product.setPrice(discountedPrice);
        System.out.println("Applied " + percentage + "% discount to " + product.getName());
    }
}

// ===== Main Application Class =====
public class DynamicMarketplace {
    public static void main(String[] args) {
        // Creating product instances with specific categories
        Product<BookCategory> book = new Product<>("Java Programming", 499.0, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("Cotton Shirt", 999.0, new ClothingCategory());
        Product<GadgetCategory> watch = new Product<>("Smartwatch", 1999.0, new GadgetCategory());

        // Display before discount
        System.out.println("Before Discount:");
        book.display();
        shirt.display();
        watch.display();

        System.out.println("\nApplying Discounts...");
        MarketplaceUtils.applyDiscount(book, 10);
        MarketplaceUtils.applyDiscount(shirt, 20);
        MarketplaceUtils.applyDiscount(watch, 15);

        // Display after discount
        System.out.println("\nAfter Discount:");
        book.display();
        shirt.display();
        watch.display();
    }
}


