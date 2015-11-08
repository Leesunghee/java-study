package designPattern.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunghee on 2015. 7. 5..
 */
public class BookShelf implements Aggregate {
    private List books;


    public BookShelf(int initialsize) {
        this.books = new ArrayList(initialsize);

    }

    public Book getBookAt(int index) {
        return (Book) books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

}
