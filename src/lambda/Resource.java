package lambda;

import java.util.function.Consumer;

public class Resource {

    private Resource() {}

    public static void withResource(Consumer<Resource> consumer) {
        Resource resource = new Resource();

        try {
            consumer.accept(resource);
        } finally {
            resource.dispose();
        }
    }

    public void operate() {
        System.out.println("Operating on resource");
    }

    public void dispose() {
        System.out.println("Disposing resource");
    }
}
