/**
 * ReverseStringSortingMethod class implements ISortingMethod interface
 * and provides a method to sort an array of strings in reverse order.
 */
public class StringReverseSortingMethod implements ISortingMethod<String>{
    /**
     * Default constructor
     */
    public StringReverseSortingMethod() {}

    /**
     * Sorts the array of strings in reverse order
     * @param array array to be sorted
     * */
    public void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) < 0) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
