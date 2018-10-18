package L2;

import java.time.LocalDateTime;

public class PrinterTaskRunner extends AbstractTaskRunner {
    public PrinterTaskRunner(TaskRunner runner) {
        super(runner);
    }

    @Override
    public void executeOneTask() {
        System.out.println(String.format("Executed at: %s", LocalDateTime.now().getHour()));
        this.runner.executeOneTask();
    }

    @Override
    public void executeAll() {
        System.out.println(String.format("Executed at: %s", LocalDateTime.now().getHour()));
        this.runner.executeAll();
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
