package designPattern.factoryMethod;

/**
 * Created by sungheelee on 2015. 12. 5..
 */
public class Dog extends Animal {
    @Override
    AnimalToy getToy() {
        AnimalToy ball = new Ball();
        return ball;
    }
}
