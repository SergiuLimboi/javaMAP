package L2;

public class DelayTaskRunner extends AbstractTaskRunner {
    public DelayTaskRunner(TaskRunner runner) {
        super(runner);
    }

    @Override
    public void executeOneTask() {
        try {
            Thread.sleep(3000);
            this.runner.executeOneTask();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void executeAll() {
        try {
            Thread.sleep(3000);
            this.runner.executeAll();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void addTask(Task task) {
        this.runner.addTask(task);
    }

    @Override
    public boolean hasTask() {
        return this.runner.hasTask();
    }
}
