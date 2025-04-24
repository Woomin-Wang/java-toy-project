package BookStore;

public class Book {

    private String title;
    private String author;
    private String publisher;
    private int price;
    private int inventory;
    private int cartCount;

    public Book(String title, String author, String publisher, int price, int inventory) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.inventory = inventory;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getCartCount() {
        return cartCount;
    }

    public void setCartCount(int cartCount) {
        this.cartCount = cartCount;
    }
}
