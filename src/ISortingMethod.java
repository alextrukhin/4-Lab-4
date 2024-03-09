/**
 * Interface for sorting methods of strategy pattern
 * @param <T> generic type (String, Integer, etc.)
 * */
public interface ISortingMethod<T> {
    /**
     * Sorts the array
     * @param array array to be sorted
     * */
    void sort(T[] array);
}
