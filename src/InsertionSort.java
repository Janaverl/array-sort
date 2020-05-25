/**
 * Insertion sort is a way to sort an array of values.
 * It starts with sorting the first two values. If necessary, the values are swapped.
 * After that it compares the thirth value with the value before it.
 * If necessary, these values are swapped and it will be compared to the first one.
 * If not, leave it in it's place.
 * Here comes the benefit compared to bubble sort: it's not needed anymore to compare this values to all the values that we allready went through and from which we know they are in place.
 * When you ended this procedure for the value at the last place of the initial array, the insertion sort is done.
 */
public class InsertionSort extends Sort{
    public InsertionSort(int[] list) {
        super(list);
    }

    public void sortIntegers() {
        int[] array = duplicateArray(this.list);

        for(int sortedLength=0; sortedLength<array.length-1; sortedLength++){
            for(int current=sortedLength; current>=0; current--){
                if(array[current] > array[current+1]){
                    array = swapTwoInts(array, current);
                } else {
                    break;
                }
            }
        }

        this.sortedList = array;
    }
}