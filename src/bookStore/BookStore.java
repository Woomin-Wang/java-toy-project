package bookStore;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

    private List<Book> books = new ArrayList<>();
    private List<BookStock> bookStocks = new ArrayList<>();
    Util util = new Util();

    public BookStore() {
        books.add(new Book("급류", "정대건", "민음사", 13000));
        books.add(new Book("데미안", "헤르만헤세", "민음사", 8000));
        books.add(new Book("모순", "양귀자", "쓰다", 15000));
        books.add(new Book("브람스", "프랑수아즈 사강", "민음사", 7000));

        for (Book book : books) {
            BookStock bookStock = new BookStock(book, 10);
            bookStocks.add(bookStock);
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public void showAllBooks() {
        for (Book book : books) {
            util.printBookInfo(book);

        }
    }

    public void showBook(String bookTitle) {
        for (Book book : books) {
            if (book.getTitle().equals(bookTitle)) {
                util.printBookInfo(book);
                showBookStock(bookTitle);
            }
        }
    }

    private void showAllBookStock() {
        for (BookStock bookStock : bookStocks) {
            System.out.println(", 재고: " + bookStock.getInventory() + "권");
        }
    }

    private void showBookStock(String bookTitle) {
        for (BookStock bookStock : bookStocks) {
            if(bookStock.getBook().getTitle().equals(bookTitle))
                System.out.println(", 재고: " + bookStock.getInventory() + "권");
        }
    }
}


