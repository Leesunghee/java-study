package designPattern.Iterator;

/**
 * Created by sunghee on 2015. 7. 5..
 */
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }

        System.identityHashCode(bookShelf);
        System.out.println("args = [" + args + "]");

        System.out.println();
        System.out.println();

       // System.out.println(adf);



//        System.out.println(sdlllllslll);
    }
}
