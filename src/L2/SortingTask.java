package L2;

import java.util.Random;
import java.util.Vector;

public class SortingTask extends Task {
    private Vector<Double> numbers;

    public SortingTask(Vector<Double> numbers) {
        super(
                String.valueOf(new Random().nextInt(89999) + 10000),
                String.format("A sorting task for a vector containing %d numbers", numbers.size())
        );
        this.numbers = numbers;
    }

    public SortingTask(double ... num){
        super(
                String.valueOf(new Random().nextInt(89999) + 10000),
                String.format("A sorting task for a vector containing %d numbers", num.length)
        );
        Vector<Double> vecHolder = new Vector<>(num.length);
        for (double d: num){
            vecHolder.add(d);
        }
        this.numbers = vecHolder;
    }

    public Vector<Double> getNumbers() {
        return numbers;
    }

    public void setNumbers(Vector<Double> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void execute() {
        Vector<Double> bubbleSorted = DoubleVectorSorter.bubblesort(this.numbers);
        System.out.println(bubbleSorted.toString());
        Vector<Double> mergeSorted = DoubleVectorSorter.mergeSort(this.numbers);
        System.out.println(mergeSorted);
    }

    @Override
    public String toString() {
        return numbers.toString();
    }

}
