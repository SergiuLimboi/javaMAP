package L2;

abstract class AbstractTaskRunner implements TaskRunner {
    TaskRunner runner;

    AbstractTaskRunner(TaskRunner runner) {
        this.runner = runner;
    }
}
