package L2;

import java.util.ArrayList;
import java.util.Arrays;

public class QueueContainer extends GenericContainer {
    public QueueContainer(ArrayList<Task> input) {
        contents = input;
    }

    public QueueContainer(Task ... input){
        contents = new ArrayList<>(Arrays.asList(input));
    }

//    public Task remove (int index){
//        Task task = contents.get(index);
//        contents.remove(contents.get(index));
//        return task;
//    }

    public Task remove(){
        Task task = contents.get(0);
        contents.remove(contents.get(0));
        return task;
    }

    public void add(Task task){
        contents.add(task);
    }
}
