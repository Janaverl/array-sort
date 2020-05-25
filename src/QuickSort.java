public class QuickSort extends Sort{
    public QuickSort(int[] list) {
        super(list);
    }

    public void sortIntegers() {
        int[] array = duplicateArray(this.list);
        sortIntegers(array, 0, array.length-1);

        this.sortedList = array;
    }

    private void sortIntegers(int array[], int startIndex, int endIndex) { 
        if (startIndex < endIndex) {         
            int pointerIndex = divideBasedOnPointer(array, startIndex, endIndex); 

            sortIntegers(array, startIndex, pointerIndex-1); 
            sortIntegers(array, pointerIndex+1, endIndex); 
        } 
    } 

    private boolean isSwappedToLeftBecauseIsSmaller(int[] array, int index, int compareToValue, int swapWithIndex) {
        if (array[index] < compareToValue) {
            swapTwoInts(array, index, swapWithIndex);
            return true; 
        } 
        return false;
    }

    private int divideBasedOnPointer(int array[], int startIndex, int endIndex) {
        int pointerValue = array[endIndex];  
        int newPointerIndex = startIndex;

        for (int current=startIndex; current<endIndex; current++) {
            if(isSwappedToLeftBecauseIsSmaller(array, current, pointerValue, newPointerIndex)){
                newPointerIndex++;
            }
        } 

        swapTwoInts(array, newPointerIndex, endIndex);

        return newPointerIndex; 
    } 

}