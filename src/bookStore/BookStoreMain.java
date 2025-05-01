package bookStore;

import java.util.Scanner;

public class BookStoreMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStore bookStore = new BookStore();
        ShoppingCart shoppingCart = new ShoppingCart();

        Util.printMenu();

        while(true) {
            System.out.print("메뉴 선택 => ");
            int input = scanner.nextInt();
            scanner.nextLine();

            switch(input) {
                case 1 ->  bookStore.showAllBooks();
                case 2 -> {
                    System.out.print("책 제목을 입력하세요. => ");
                    String inputTitle = scanner.nextLine();
                    bookStore.showBook(inputTitle);
                }
                case 3 -> {
                    System.out.print("구입하실 책 제목을 입력하세요. => ");
                    String inputTitle = scanner.nextLine();

                    System.out.print("수량을 입력해주세요 => ");
                    int quantity = scanner.nextInt();

                    shoppingCart.putShoppingCart(inputTitle, quantity);
                }
                case 4 -> shoppingCart.showShoppingCart();
                case 5 -> shoppingCart.payShoppingCart();
                case 6 -> {
                    System.out.println("시스템 종료");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
