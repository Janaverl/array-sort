import java.util.Arrays;

public class Sort {
    protected int[] list;
    protected int[] sortedList;

    public Sort(int[] list) {
        this.list = list;
    }

    public void setList(int[] list){
        this.list = list;
    }

    public int[] getSortedList() {
        return this.sortedList;
    }

    private void printArray(int[] array) {
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public void printList() {
        printArray(this.list);
    }

    public void printSortedList() {
        for(int i=0; i<this.sortedList.length; i++){
            System.out.println(this.sortedList[i]);
        }
    }

    protected int[] duplicateArray(int[] array) {
        return Arrays.copyOf(array, array.length);
    }

    protected int[] swapTwoInts(int[] array, int indexBiggest){
        int toSwap = array[indexBiggest];
        array[indexBiggest] = array[indexBiggest+1];
        array[indexBiggest+1] = toSwap;
        return array;
    }
}