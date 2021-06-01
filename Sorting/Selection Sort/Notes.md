# Selection Sort

* Time Complexity: O(N^2)

## Working

1. Consider an array
    * [ 4, 1, 9, 2, 3, 6 ]<br><br>
2. Traverse through the array after 0th element to find the smallest element smaller than the 0th element.
    * Here leave 4 and traverse from 1 to 6
    
    * We get 1 as the smallest number<br>[ **4, 1**, 9, 2, 3, 6 ]<br><br>
3. Now swap the 0th element with the minimum element found.
    * [ **1, 4**, 9, 2, 3, 6 ]<br><br>
4. Now Traverse through the array after 1st element to find the smallest element smaller than the 1st element.
    * Leave 1 and 4 and traverse from 9 to 6
    
    * We get 2 as the smallest number<br>[ 1, **4**, 9, **2**, 3, 6 ]
    
    * Swap 2 and 4<br>[ 1, **2**, 9, **4**, 3, 6 ]
5. Repeat this n times
    * Finally we get<br>[ 1, 2, 3, 4, 6, 9 ]