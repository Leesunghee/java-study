package ch09.book;

/**
 * Created by sunghee on 2015. 5. 5..
 */
public class MockElevator implements Elevator {

    private class MockController implements ManualController {
        @Override
        public void up() {
            currentFloor++;
        }

        @Override
        public void down() {
            currentFloor--;
        }
    }

    private int currentFloor;

    @Override
    public int getCurrentFloor() {
        return currentFloor;
    }

    @Override
    public ManualController getController() {
        return new MockController();
    }


}
