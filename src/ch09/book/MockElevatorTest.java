package ch09.book;

/**
 * Created by sunghee on 2015. 5. 5..
 */
public class MockElevatorTest {

    public static void main(String[] args) {
        MockElevator elevator = new MockElevator();
        ManualController controller = elevator.getController();
        controller.up();
        System.out.println("up 이후 =" + elevator.getCurrentFloor());
        controller.up();
        System.out.println("up 이후 =" + elevator.getCurrentFloor());
        controller.down();
        System.out.println("down 이후 =" + elevator.getCurrentFloor());
    }
}
