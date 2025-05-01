package bookStore;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    BookStore bookStore = new BookStore();
    Map<Book, Integer> shoppingCart = new HashMap<>();

    public void putShoppingCart(String bookTitle, int quantity) {
        for (Book book : bookStore.getBooks()) {
            if (book.getTitle().equals(bookTitle)) {
                shoppingCart.put(book, quantity);
                System.out.println("[" + book.getTitle() + "] " + quantity + "권을 장바구니에 담았습니다.");
            }
        }
    }

    public void showShoppingCart() {
        if(isEmptyShoppingCart()) {
            System.out.println("장바구니가 비어있습니다.");
            return;
        }
        for (Book book : shoppingCart.keySet()) {
            System.out.println("[" + book.getTitle() + "]"
                    + ", 가격: " + book.getPrice() + "원"
                    + ", 담은 수량: " + shoppingCart.get(book) + "권");
        }
        System.out.println("총 가격: " + getTotalPrice() + "원");
    }

    public void payShoppingCart() {
        if(isEmptyShoppingCart()) {
            System.out.println("장바구니가 비어있습니다.");
            return;
        }
        System.out.println("장바구니에 있는 책들이 결제되었습니다.");
        System.out.println("총 결제 금액: " + getTotalPrice() + "원");
        shoppingCart.clear();
    }

    //todo - Move UtilClass
    private int getTotalPrice() {
        int totalPrice = 0;
        for (Book book : shoppingCart.keySet()) {
            totalPrice += book.getPrice() * shoppingCart.get(book);
        }
        return totalPrice;
    }

    //todo - Move UtilClass
    private boolean isEmptyShoppingCart() {
        return shoppingCart.isEmpty();
    }
}
