package ch10.book.generic;

/**
 * Created by sunghee on 2015. 5. 12..
 */
public class Cage<T> {

    private T animal;

    public void add(T animal) {
        this.animal = animal;
    }

    public T remove() {
        T temp = animal;
        animal = null;
        return temp;
    }


}
