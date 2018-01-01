package lambda;

import java.util.function.Consumer;

public class ConsumerPractice {



    public static void main(String[] args) {

        Resource.withResource(resource -> resource.operate());



    }
}
