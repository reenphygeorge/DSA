# Insertion Sort

* Time Complexity: O(N^2)

* Has less comparisons compared to Bubble Sort.

## Working

1. Consider an array
    * [ 8, 4, 1, 5, 9, 2 ]<br><br>
2. Here the given array is divided into sorted and unsorted part. At the beginning sorted array will consist only of the element at 0th position.
    * Here 8 belongs to the sorted part.<br>[ **8**, 4, 1, 5, 9, 2 ]<br><br>
3. Now each element from unsorted part is added to the sorted part and the elements in the updated sorted part are rearranged such that they remain sorted.
    *  **4** is added to the sorted part <br>[ **8, 4**, 1, 5, 9, 2 ]

    * Since 4 < 8 they are rearranged.<br>This is how elements are rearranged: <br> Value 4 is stored in a temporary variable.<br>[ **8, 8**, 1, 5, 9, 2]<br> [ **4, 8,** 1, 5, 9, 2 ]<br><br>
4. This step is repeated for n times.
    * Now **1** is added to sorted part and step 3 is repeated...
    * Finally we get:<br>[ **1, 2, 4, 5, 8, 9** ]