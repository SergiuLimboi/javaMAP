package L2;

import java.util.Vector;

final class DoubleVectorSorter {
    static Vector<Double> bubblesort(Vector<Double> numbers){
        Vector<Double> vecHolder = (Vector<Double>) numbers.clone();

        for (int i = 0; i < vecHolder.size(); i++){
            for (int j = 0; j < vecHolder.size()-1; j++){
                double doubHolder;
                if (vecHolder.get(j) > vecHolder.get(j+1)){
                    doubHolder = vecHolder.get(j+1);

                    vecHolder.set(
                            j+1,
                            vecHolder.get(j)
                    );

                    vecHolder.set(
                            j,
                            doubHolder
                    );
                }
            }
        }

        return vecHolder;
    }

    static private Vector<Double> merge(Vector<Double> left, Vector<Double> right) {
        Vector<Double> merged = new Vector<>();

        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.get(0).compareTo(right.get(0)) <= 0) {
                merged.add(left.remove(0));
            } else {
                merged.add(right.remove(0));
            }
        }
        merged.addAll(left);
        merged.addAll(right);

        return merged;
    }

    static Vector<Double> mergeSort(Vector<Double> numbers) {
        Vector<Double> vecHolder = (Vector<Double>) numbers.clone();

        if (vecHolder.size() != 1) {
            Vector<Double> left = new Vector<>();
            Vector<Double> right = new Vector<>();
            boolean logicalSwitch = true;

            while (!vecHolder.isEmpty()) {
                if (logicalSwitch) {
                    left.add(vecHolder.remove(0));
                } else {
                    right.add(vecHolder.remove(0));
                }
                logicalSwitch = !logicalSwitch;
            }

            left = mergeSort(left);
            right = mergeSort(right);
            vecHolder.addAll(merge(left, right));
        }

        return vecHolder;
    }
}
