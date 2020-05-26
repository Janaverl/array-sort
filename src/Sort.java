import java.util.Arrays;

public class Sort {
    protected int[] list;
    protected int[] sortedList;
    protected String name;

    public Sort(int[] list) {
        this.list = list;
    }

    public Sort(int[] list, String name) {
        this.list = list;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setList(int[] list){
        this.list = list;
    }

    public int[] getSortedList() {
        return this.sortedList;
    }

    public int getListLength() {
        return this.list.length;
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
        printArray(this.sortedList);
    }

    public void sortIntegers(){

    }

    protected int[] duplicateArray(int[] array) {
        return Arrays.copyOf(array, array.length);
    }

    protected void swapTwoInts(int[] array, int indexBiggest) {
        swapTwoInts(array, indexBiggest, indexBiggest+1);
    }

    protected void swapTwoInts(int[] array, int indexOne, int indexTwo) {
        int toSwap = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = toSwap;
    }

    public boolean isAccepted(){
        return true;
    }
}