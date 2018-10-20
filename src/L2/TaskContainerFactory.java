package L2;

import java.util.ArrayList;
import java.util.Vector;

//public class TaskContainerFactory implements Factory {
final class TaskContainerFactory {
    public TaskContainerFactory() {
        throw new RuntimeException("Instantiating a final class? I don't think so.");
    }

    //TODO here you should implement the singleton pattern
    static Container createContainer(String strategy, ArrayList<Task> tasks) {
        Container cont;

        switch (strategy) {
            case "FIFO":
                cont = new QueueContainer(tasks);
                break;
            case "LIFO":
                cont = new StackContainer(tasks);
                break;
            default:
                throw new IllegalArgumentException("Strategy must be either 'FIFO' or 'LIFO'");
        }

        return cont;
    }
}
