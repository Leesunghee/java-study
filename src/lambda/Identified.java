package lambda;

public interface Identified {
    default int getId() {
        return -1;
    }
}
