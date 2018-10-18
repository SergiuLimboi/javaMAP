package L2;

import java.util.ArrayList;

abstract class GenericContainer implements Container{
    ArrayList<Task> contents;

    public int size(){
        return contents.size();
    }

    public boolean isEmpty(){
        return contents.isEmpty();
    }
}
