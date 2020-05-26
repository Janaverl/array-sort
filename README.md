# table of contents
[about](#about)

[sorting methods](#sorting-methods)
1. [bubble sort](##bubble-sort)
1. [insertion sort](##insertion-sort)
1. [quick sort](##quick-sort)

# about
This program compares different ways of sorting an array in Java to find out which is the fastest.

# sorting methods
## bubble sort
Bubble sort is one way to sort an array of values.
It compares each item to the item that follows the item.
If the objects are not in the correct order, they are swapped so that the largest of the two moves up. This process continues until the largest of the objects, eventually "bubbles" up to the highest position in the array.

After this occurs, the search for the next largest object begins. The swapping continues until the whole array is in the correct order.

If there wasn't a swap in one round, the bubble sort is done.

Example: set the values of an array from smallest to biggest number

| example | 10 | 5 | 9 | 4 | 1 | |
| --- | --- | ---| ---| ---| ---| --- |
| round 1 - comparance 1 | **5** -> | <- **10** | 9 | 4 | 1 | swap |
| round 1 - comparance 2 | 5 | **9** -> | <- **10** | 4 | 1 | swap |
| round 1 - comparance 3 | 5 | 9 | **4** -> | <- **10** | 1 | swap |
| round 1 - comparance 4 | 5 | 9 | 4 | **1** -> | <- **10** | swap |
| round 2 - comparance 5 | **5** -> | <- **9** | 4 | 1 | 10 | **leave** |
| round 2 - comparance 6 | 5 | **4** -> | <- **9** | 1 | 10 | swap |
| round 2 - comparance 7 | 5 | 4 | **1** -> | <- **9** | 10 | swap |
| round 2 - comparance 8 | 5 | 4 | 1 | **9** -> | <- **10** | **leave** |
| round 3 - comparance 9 | **4** -> | <- **5** | 1 | 9 | 10 | swap |
| round 3 - comparance 10 | 4 | **1** -> | <- **5** | 9 | 10 | swap |
| round 3 - comparance 11 | 4 | 1 | **5** -> | <- **9** | 10 | **leave** |
| round 3 - comparance 12 | 4 | 1 | 5 | **9** -> | <- **10** | **leave** |
| round 4 - comparance 13 | **1** -> | <- **4** | 5 | 9 | 10 | swap |
| round 4 - comparance 14 | 1 | **4** -> | <- **5** | 9 | 10 | **leave** |
| round 4 - comparance 15 | 1 | 4 | **5** -> | <- **9** | 10 | **leave** |
| round 4 - comparance 16 | 1 | 4 | 5 | **9** -> | <- **10** | **leave** |
| round 5 - comparance 17 | **1** -> | <- **4** | 5 | 9 | 10 | **leave** |
| round 5 - comparance 18 | 1 | **4** -> | <- **5** | 9 | 10 | **leave** |
| round 5 - comparance 19 | 1 | 4 | **5** -> | <- **9** | 10 | **leave** |
| round 5 - comparance 20 | 1 | 4 | 5 | **9** -> | <- **10** | **leave** |
| sorted in 20 comparances | **1** | **4** | **5** | **9** | **10** | A whole round whithout any swap's, you're done! |

[back to top](##table-of-contents)

## insertion sort
Insertion sort is another way to sort values.

It starts with sorting the first two values. If necessary, the values are swapped.

After that it compares the thirth value with the value before it.
- If necessary, these values are swapped and it will be compared to the first one.
- If not, leave it in it's place. Here comes the benefit compared to bubble sort: it's not needed anymore to compare this values to all the values that we allready went through and from which we know they are in place.

When you ended this procedure for the value at the last place of the initial array, the insertion sort is done.

Example: set the values of an array from smallest to biggest number

| example | 10 | 5 | 9 | 4 | 1 | |
| --- | --- | ---| ---| ---| ---| --- |
| start round 1 | 10 | **```5```** | 9 | 4 | 1  | |
| round 1 - comparance 1 | **```5```** -> | <- **10** | 9 | 4 | 1 | swap |
|  |  | | | | |  |
| start round 2 | 5 | 10 | **```9```** | 4 | 1 |  |
| round 2 - comparance 2 | 5 | **```9```** -> | <- **10** | 4 | 1 | swap |
| round 2 - comparance 3 | **5** -> | <- **```9```** | 10 | 4 | 1 | leave |
|  |  | | | | |  |
| start round 3 | 5 | 9 | 10 | **```4```** | 1 |  |
| round 3 - comparance 4 | 5 | 9 | **```4```** -> | <- **10** | 1 | swap |
| round 3 - comparance 5 | 5 | **```4```** -> | <- **9** | 10 | 1 | swap |
| round 3 - comparance 6 | **```4```** -> | <- **5** | 9 | 10 | 1 | swap |
|  |  | | | | |  |
| start round 4 | 4 | 5 | 9 | 10 | **```1```** |  |
| round 4 - comparance 7 | 4 | 5 | 9 | **```1```** -> | <- **10** | swap |
| round 4 - comparance 8 | 4 | 5 | **```1```** -> | <- **9** | 10 | swap |
| round 4 - comparance 9 | 4 | **```1```** -> | <- **5** | 9 | 10 | swap |
| round 4 - comparance 10 | **```1```** -> | <- **4** | 5 | 9 | 10 | swap |
| sorted in 10 comparances | **1** | **4** | **5** | **9** | **10** | The value that initially was at the last place (1) is sorted, so you're done! |

[back to top](##table-of-contents)

## quick sort
Quick Sort is a way of sorting where the list is divided in partitions.

After selecting a pointer every element is compared to that pointer and placed on the left or the right side of it.

After doing that, all the elements of the left side doesn't have to be compared to the values on the right side again. The right and left sides are now two sub-arrays. Inside this sub-arrays will have a new pointer and devide the values again in two partitions (smaller? in the left partition. bigger? in the right partition).

Sorting is done when the list excists only of pointers and partitions of 1 value.

| example | 10 | 5 | 9 | 4 | 1 | 7 | 6 | 8 | |
| --- | --- | ---| ---| ---| ---| --- | ---| ---| --- | 
| **pointer ::: 8** | **10** | **5** | **9** | **4** | **1** | **7** | **6** | **```8```** | |
| comparer ::: 10 | 5 | 9 | 4 | 1 | 7 | 6 | **```8```** | **10** | swap |
| comparer ::: 5 | **5** | 9 | 4 | 1 | 7 | 6 | **```8```** | 10 | leave |
| comparer ::: 9 | 5 | 4 | 1 | 7 | 6 | **```8```** | **9** | 10 | swap |
| comparer ::: 4 | 5 | **4** | 1 | 7 | 6 | **```8```** | 9 | 10 | leave |
| comparer ::: 1 | 5 | 4 | **1** | 7 | 6 | **```8```** | 9 | 10 | leave |
| comparer ::: 7 | 5 | 4 | 1 | **7** | 6 | **```8```** | 9 | 10 | leave |
| comparer ::: 6 | 5 | 4 | 1 | 7 | **6** | **```8```** | 9 | 10 | leave |
|  |  | | | | |  | | | pointer "8" is placed where it belongs now. | 
| **pointer ::: 6** | **5** | **4** | **1** | **7** | **```6```** | | | | |
| comparer ::: 5 | **5** | 4 | 1 | 7 | **```6```** | X | | | leave |  
| comparer ::: 4 | 5 | **4** | 1 | 7 | **```6```** | X | | | leave |
| comparer ::: 1 | 5 | 4 | **1** | 7 | **```6```** | X | | | leave |
| comparer ::: 7 | 5 | 4 | 1 | **```6```** | **7** | X | | | swap |
|  |  | | | | |  | | | pointer "6" is placed where it belongs now.. <br> 7 is alone in a partition, so it's also placed where it belongs now. | 
| **pointer ::: 1** | **5** | **4** | **```1```** | | | | | |  |
| comparer ::: 5 | 4 | **```1```** | **5** | X | X | X | | | swap |
| comparer ::: 4 | **```1```** | **4** | 5 | X | X | X | | | swap |
|  |  | | | | |  | | | pointer "1" is placed where it belongs now.. | 
| **pointer ::: 5** |  | **4** | **```5```** | | | | | |  |
| comparer ::: 4 | X | **4** | **```5```** | X | X | X | | | leave |
|  |  | | | | |  | | | pointer "5" is placed where it belongs now.. <br> 4 is alone in a partition, so it's also placed where it belongs now. | 
| **pointer ::: 10** |  |  |  | |  |  | **9** | **```10```** |  |
| comparer ::: 9 | X | X | X | X | X | X | **9** | **```10```** | leave |
|  |  | | | | |  | | |  | 
| you're done! | ```1``` | 4 | ```5``` | ```6```| 7 | ```8``` | 9 | ```10``` | The list now excists only of pointers and partitions of 1 value. You're done! |

[back to top](##table-of-contents)

## bogo sort
Bogo sort is a very inifficient way of sorting. It is also known as permutation sort, stupid sort, slowsort, shotgun sort or monkey sort.

It's as simple as slow: it sorts the values random, and checks if all the values are in place. If that's not the case, the are sorted randomly again and again checked if they are in place. And so on.

Each round of random sort is programmed like this:
- the first element is swapped with a random element that comes after it (or itself)
- the second element is swapped with a random element that comes after it  (or itself)
- and so on
- the second last element is swapped with the last element or itsel
- check if the list is sorted. If not: start over.

this is an example of how one random sort could look like:

| el        | random    | 10            | 5             | 9             | 4             | 1             |
| ---       | ---       | ---           | ---           | ---           |     ---       | ---           |
| 1st: 10   | 9         | **```9```**   | 5             | **10**        | 4             | 1             |
| 2nd: 5    | 1         | ```9```       |  **```1```**  | 10            | 4             | **5**         |
| 3th: 10   | 10        | ```9```       |  ```1```      | **```10```**  | 4             | 5             |
| 4th: 4    | 5         | ```9```       |  ```1```      | ```10```      | **```5```**   | **4**         |
| result    | not sorted! redo! | ```9```       |  ```1```      | ```10```      | ```5```       | ```4```       |

The correct way random should go in this example, in order to be sorted is like that:

| el        | random            | 10            | 5             | 9             | 4             | 1             |
| ---       | ---               | ---           | ---           | ---           |     ---       | ---           |
| 1st: 10   | 1                 | **```1```**   | 5             | 9             | 4             | **10**        |
| 2nd: 5    | 4                 | ```1```       | **```4```**   | 9             | **5**         | 10            |
| 3th: 9    | 5                 | ```1```       | ```4```       | **```5```**   | **9**         | 10            |
| 4th: 9    | 9                 | ```1```       | ```4```       | ```5```       | **```9```**   | 10            |
| result    | yes! it's sorted! | ```1```       |  ```4```      | ```5```       | ```9```       | ```10```      |

What are the ods of only needing one round?
Well, there are 120 possible sorts in this case (a list of 5 values):
While swapping the first element, there are 5 possibilities. In the second swap there are 4. Combine those and there are only for the first 2 element 20 possibilities.
thirth row: 3 swaps, makes 60. Fourth row: 2 swaps, makes 120.

Each try to sort randomly has a change of 1 on 120 to be sorted correct. So it might need more then 120 tries. Because: one result can apear again in another try. So, you just don't know. But in theorie it is possible be right from the first time.

[back to top](##table-of-contents)