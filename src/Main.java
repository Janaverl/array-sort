public class Main {
    public static void main(String[] args){
        int[] myList = {10, 5, 2, 3, 1, 101, 15, 22, 43, 51, 210, 65, 22};

        BubbleSort bubblesort = new BubbleSort(myList);
        bubblesort.sortIntegers();
        bubblesort.printSortedList();

        InsertionSort insertionSort = new InsertionSort(myList);
        insertionSort.sortIntegers();
        insertionSort.printSortedList();

        QuickSort quicksort = new QuickSort(myList);
        quicksort.sortIntegers();
        quicksort.printSortedList();
    }
}