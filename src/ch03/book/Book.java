package ch03.book;

/**
 * Created by sunghee on 2015. 4. 22..
 */
public class Book {

    private String title;
    private int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public boolean titleLike(String keyword) {
        if (keyword == null) {
            return false;
        }

        return this.title.contains(keyword);
    }

    public void printInfo() {
        System.out.println("제목:" + title + ", 가격:" + price);




    }
}
