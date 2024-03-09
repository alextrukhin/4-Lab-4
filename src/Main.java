/**
 * Main class to test the sorting methods.
 */
public class Main {
    /**
     * Main method to test the sorting methods.
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Integer[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        String[] strings = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape"};

        Container<Integer> numberContainer = new Container<>(numbers);
        Container<String> stringContainer = new Container<>(strings);

        NumberSortingMethod numberSortingMethod = new NumberSortingMethod();
        NumberReverseSortingMethod reverseNumberSortingMethod = new NumberReverseSortingMethod();
        StringSortingMethod stringSortingMethod = new StringSortingMethod();
        StringReverseSortingMethod reverseStringSortingMethod = new StringReverseSortingMethod();

        numberContainer.sort(numberSortingMethod);
        System.out.println("Sorted numbers:");
        for (Integer number : numberContainer.getArray()) {
            System.out.print(number + " ");
        }
        System.out.println();

        numberContainer.sort(reverseNumberSortingMethod);
        System.out.println("Reverse sorted numbers:");
        for (Integer number : numberContainer.getArray()) {
            System.out.print(number + " ");
        }
        System.out.println();

        stringContainer.sort(stringSortingMethod);

        System.out.println("Sorted strings:");
        for (String string : stringContainer.getArray()) {
            System.out.print(string + " ");
        }
        System.out.println();

        stringContainer.sort(reverseStringSortingMethod);

        System.out.println("Reverse sorted strings:");
        for (String string : stringContainer.getArray()) {
            System.out.print(string + " ");
        }
        System.out.println();
    }
}