package L2;

import java.util.ArrayList;
import java.util.Vector;

public class StrategyTaskRunner implements TaskRunner{
    private String strategy;
    private Container container;

    public StrategyTaskRunner(String strategy, ArrayList<Task> tasks) {
        this.strategy = strategy;
        container = TaskContainerFactory.createContainer(strategy, tasks);
    }

    public StrategyTaskRunner(String strategy, Vector<Task> tasks) {
        this.strategy = strategy;
        container = TaskContainerFactory.createContainer(strategy, new ArrayList<Task>(tasks));
    }

    @Override
    public void executeOneTask(){
        Task holder = container.remove();
        System.out.println(holder.toString());
    }

    @Override
    public void executeAll() {
        while (!this.hasTask()){
            Task holder = container.remove();
            System.out.println(holder.toString());
        }
    }

    @Override
    public void addTask(Task task) {
        container.add(task);
    }

    @Override
    public boolean hasTask() {
        return this.container.isEmpty();
    }
}
