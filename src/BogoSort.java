import java.math.BigInteger;

public class BogoSort extends Sort {
    private static String NAME = "Bogo Sort";

    public BogoSort(int[] list) {
        super(list, NAME);
    }

    public void sortIntegers() {
        int[] tempArray = duplicateArray(this.list);

        boolean isSorted = false;

        while(!isSorted){
            shuffle(tempArray);
            isSorted = isSorted(tempArray);
        };

        this.sortedList = tempArray;
    }

    private static int getRandomValueInRange(int min, int max){
        int range = (1+max) - min;
        return (int)(Math.random() * range) + min;
    }

    private void shuffle(int[] array) {
        for(int i=0; i<array.length-1; i++) {
            int randomBiggerIndex =  getRandomValueInRange((i), (array.length-1));
            swapTwoInts(array, i, randomBiggerIndex);
        }
    }

    private boolean isSorted(int[] array) {
        for(int i=0; i<array.length-1; i++){
            if(array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }

    public BigInteger whatAreTheOdsBeingRightInOneShuffle(){
        long length = this.list.length;
        BigInteger ods = new BigInteger("1");
        for(long i=length; i>0; i--){
            ods = ods.multiply(BigInteger.valueOf(i));
        }
        return ods;
    }

    public boolean isAccepted(){
        BigInteger ods = whatAreTheOdsBeingRightInOneShuffle();
        BigInteger chanceForEuroMillionsJackPot = new BigInteger("139838160");
        int chancesForBeingRightInOneShuffleAreSmaller = ods.compareTo(chanceForEuroMillionsJackPot);
        if (chancesForBeingRightInOneShuffleAreSmaller == 1){
            return false;
        }
        return true;
    }
}