package ch03.book;

/**
 * Created by sunghee on 2015. 4. 22..
 */
public class BookSimpleMain {

    public static void main(String[] args) {


        if (args.length == 0) {
            printUsage();
            return;
        }

        BookCatalog catalog = new BookCatalog();

        if (args[0].equals("-a")) {
            catalog.printAllBooks();
            return;
        }

        if (args[0].equals("-k")) {
            catalog.printBooksTitleLike(args[1]);
        }
    }

    private static void printUsage() {
        System.out.println("전체 출력: java ch03.book.BookMain -a");
        System.out.println("전체 출력: java ch03.book.BookMain -k 단어");
    }
}
