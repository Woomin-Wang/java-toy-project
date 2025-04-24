package BookStore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BookStore bookStore = new BookStore();

        bookStore.bookAdd(new Book("급류", "정대건", "민음사", 13000,2));
        bookStore.bookAdd(new Book("데미안", "헤르만헤세", "민음사", 8000, 5));
        bookStore.bookAdd(new Book("모순", "양귀자", "쓰다", 15000, 1));
        bookStore.bookAdd(new Book("브람스", "프랑수아즈 사강", "민음사", 7000, 3));

        System.out.println("============================================");
        System.out.println("    1. 모든 도서 조회  2. 도서 검색  3. 장바구니 담기 ");
        System.out.println("    4. 장바구니 조회  5. 도서 구매  6. 종료");
        System.out.println("============================================");

        while(true) {
            System.out.print("메뉴 선택 => ");
            int input = scanner.nextInt();
            scanner.nextLine();

            if(input == 1) {
                bookStore.showAllBooks();
                System.out.println();
            } else if(input == 2) {
                System.out.print("책 제목을 입력하세요 => ");
                String inputTitle = scanner.nextLine();
                bookStore.showBook(inputTitle);
                System.out.println();
            } else if(input == 3) {
                System.out.print("구입하실 책 제목을 입력하세요 => ");
                String inputTitle = scanner.nextLine();
                System.out.print("수량을 입력해주세요 => ");
                int quantity = scanner.nextInt();
                bookStore.putShoppingCart(inputTitle, quantity);
                System.out.println();
            } else if(input == 4) {
                bookStore.showShoppingCart();
                System.out.println();
            } else if(input == 5) {;


            } else if(input == 6) {
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

        System.out.println("시스템 종료");
    }
}
