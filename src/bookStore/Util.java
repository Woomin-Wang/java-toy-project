package bookStore;

public class Util {

    public void printBookInfo(Book book) {
        System.out.println("[" + book.getTitle()
                + "] 저자: " + book.getAuthor()
                + ", 출판사: " + book.getPublisher()
                + ", 가격: " + book.getPrice() + "원");
    }



}
