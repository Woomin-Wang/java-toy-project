package bookStore;

import java.util.Map;

public class Util {

    public static void printMenu() {
        System.out.println("============================================");
        System.out.println("    1. 모든 도서 조회  2. 도서 검색  3. 장바구니 담기 ");
        System.out.println("    4. 장바구니 조회  5. 도서 구매  6. 종료");
        System.out.println("============================================");
    }

    public void printBookInfo(Book book) {
        System.out.println("[" + book.getTitle()
                + "] 저자: " + book.getAuthor()
                + ", 출판사: " + book.getPublisher()
                + ", 가격: " + book.getPrice() + "원");
    }

}
