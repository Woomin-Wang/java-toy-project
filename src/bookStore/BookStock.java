package bookStore;

public class BookStock {

    private Book book;
    private int inventory;

    public BookStock(Book book, int inventory) {
        this.book = book;
        this.inventory = inventory;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public Book getBook() {
        return book;
    }
}
