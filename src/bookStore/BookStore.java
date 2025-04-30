package bookStore;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

    private List<Book> books = new ArrayList<>();
    private List<Book> shoppingCart = new ArrayList<>();
    Util util = new Util();

    public void bookAdd(Book book) {
        books.add(book);
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
            }
        }
    }

    public void putShoppingCart(String bookTitle, int quantity) {
        for (Book book : books) {
            if (book.getTitle().equals(bookTitle)) {
                if (book.getInventory() <= 0) {
                    System.out.println("[" + book.getTitle() + "] " + "의 재고가 없습니다.");
                    System.out.println();
                    return;
                }
                System.out.println("[" + book.getTitle() + "] " + quantity + "권을 장바구니에 담았습니다.");
                shoppingCart.add(book);
                putCartBook(book, quantity);
            }
        }
    }

    private void putCartBook(Book book, int quantity) {
        book.setInventory(book.getInventory() - quantity);
        book.setCartCount(book.getCartCount() + quantity);
    }

    //todo 도서 제목을 정렬하여 출력
    public void showShoppingCart() {
        for (Book book : shoppingCart) {
            System.out.println("[" + book.getTitle()
                    + ", 가격: " + book.getPrice() + "원"
                    + ", 담은 수량: " + book.getCartCount() + "권");
        }
        System.out.println("총 가격: " + getTotalPrice());
    }

    private void sortShoppingCart() {

    }

    private int getTotalPrice() {
        int totalPrice = 0;
        for (Book book : shoppingCart) {
            totalPrice += book.getPrice() * book.getCartCount();
        }
        return totalPrice;
    }
}




