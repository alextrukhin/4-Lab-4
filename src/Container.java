/**
 * Container class for numbers and strings with a generic type and sort using strategy pattern
 * @param <T> generic type (String, Integer, etc.)
 */
public class Container<T> {
    /**
     * Array of generic type
     */
    private T[] array;

    /**
     * Default constructor
     */
    public Container() {}

    /**
     * Constructor to initialize the array
     * @param array array to be initialized
     */
    public Container(T[] array) {
        this.array = array;
    }

    /**
     * Getter and setter for the array
     * @return array
     */
    public T[] getArray() {
        return array;
    }

    /**
     * Getter and setter for the array
     * @param array array to be set
     */
    public void setArray(T[] array) {
        this.array = array;
    }

    /**
     * Sorts the array using the strategy pattern
     * @param sortingMethod sorting method to be used
     * */
    public void sort(ISortingMethod<T> sortingMethod) {
        sortingMethod.sort(array);
    }
}
