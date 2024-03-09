/**
 * This class is used to sort the array of strings in ascending order.
 * It uses the compareTo method to compare the strings and sort them accordingly.
 */
public class StringSortingMethod implements ISortingMethod<String>{
    /**
     * Default constructor
     */
    public StringSortingMethod() {}

    /**
     * Sorts the array of strings in ascending order
     * @param array array to be sorted
     * */
    public void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
