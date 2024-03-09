/**
 * This class is used to sort an array of integers in descending order.
 * The sorting algorithm used is bubble sort.
 * */
public class NumberReverseSortingMethod implements ISortingMethod<Integer>{
    /**
     * Default constructor
     */
    public NumberReverseSortingMethod() {}

    /**
     * Sorts the array of integers in reverse order
     * @param array array to be sorted
     * */
    public void sort(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
