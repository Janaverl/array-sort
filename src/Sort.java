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

    public void printArray(int[] array) {
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public void printList() {
        printArray(this.list);
    }
}