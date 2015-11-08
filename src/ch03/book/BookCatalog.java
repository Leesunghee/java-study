package ch03.book;

/**
 * Created by sunghee on 2015. 4. 22..
 */
public class BookCatalog {

    private Book[] books;

    public BookCatalog() {
        books = new Book[4];
        books[0] = new Book("자바 7 프로그래밍", 28000);
        books[1] = new Book("자바 웹 개발", 25000);
        books[2] = new Book("정의란 무엇인", 15000);
        books[3] = new Book("자바 네트워킹", 22000);

    }

    public void printAllBooks() {
        for (Book book : books) {
            book.printInfo();
        }
    }

    public void printBooksTitleLike(String keyword) {
        for (Book book : books) {
            if (book.titleLike(keyword)) {
                book.printInfo();
            }
        }
    }
}
