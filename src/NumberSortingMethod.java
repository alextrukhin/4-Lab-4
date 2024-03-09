/**
 * This class is used to sort an array of integers in ascending order.
 * The sorting algorithm used is bubble sort.
 */
public class NumberSortingMethod implements ISortingMethod<Integer>{
    /**
     * Default constructor
     */
    public NumberSortingMethod() {}

    /**
     * Sorts the array of integers in ascending order
     * @param array array to be sorted
     * */
    public void sort(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
