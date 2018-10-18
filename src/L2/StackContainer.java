package L2;

import java.util.ArrayList;
import java.util.Arrays;

public class StackContainer extends GenericContainer {
    public StackContainer(ArrayList<Task> input) {
        contents = input;
    }

    public StackContainer(Task ... input){
        contents = new ArrayList<>(Arrays.asList(input));
    }

//    public Task remove(int index){
//        Task task = contents.get(index);
//        contents.remove(index);
//        return task;
//    }

    public Task remove(){
        Task task = contents.get(contents.size()-1);
        contents.remove(contents.size()-1);
        return task;
    }

    public void add(Task task){
        contents.add(task);
    }
}
