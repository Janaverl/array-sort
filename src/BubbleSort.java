/**
 * Bubble sort is a way to sort an array of values.
 * It compares each item to the item that follows the item.
 * If the objects are not in the correct order, they are swapped so that the largest of the two moves up.
 *  This process continues until the largest of the objects, eventually "bubbles" up to the highest position in the array.
 * After this occurs, the search for the next largest object begins.
 * The swapping continues until the whole array is in the correct order.
 */
public class BubbleSort extends Sort {

    public BubbleSort(int[] list) {
        super(list);
    }

    public void sortIntegers() {
        int[] tempArray = duplicateArray(this.list);
        
        boolean swappedAnElement = false;

        do{
            swappedAnElement = false;
            for(int i=0; i<tempArray.length-1; i++){
                if(tempArray[i] > tempArray[i+1]){
                    tempArray = swapTwoInts(tempArray, i);
                    swappedAnElement = true;
                }
            }
        }while(swappedAnElement);

        this.sortedList = tempArray;
    }
    
}