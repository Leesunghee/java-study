package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePractice {

    public int sumAll(List<Integer> numbers, Predicate<Integer> p) {
        int sum = 0;
        for (int number : numbers) {
            if (p.test(number)) {
                sum += number;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        PredicatePractice predicatePractice = new PredicatePractice();

        System.out.println("1 : " + predicatePractice.sumAll(list, n -> true));
        System.out.println("2: " + predicatePractice.sumAll(list, n -> n % 2 == 0));
        System.out.println("3 : " + predicatePractice.sumAll(list, n -> n > 3));

    }
}
