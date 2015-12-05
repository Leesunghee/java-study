package designPattern.factoryMethod;

/**
 * Created by sungheelee on 2015. 12. 5..
 */
public class factoryMethodDriver {

    public static void main(String[] args) {

        Animal dog = new Dog();

        AnimalToy ball = dog.getToy();

        ball.itentify();
    }
}
