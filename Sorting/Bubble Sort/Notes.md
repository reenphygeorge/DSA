# Bubble Sort

* It's the most basic sorting algorithm.

* Time Complexity: O(N^2)

## Working

1. Consider an array 
    * [ 4, 3, 7, 1, 5 ]<br><br>
2. First, each element is compared to the adjacent element and are swaped if former element is greater than the later one.
    * [ **3**, **4**, 7, 1, 5 ]<br><br>
3. This process is repeated n times. After completing this process n times, the largest element will be at the extreme right side of the array.
    * [ 3, **4**, **7**, 1, 5 ]
    
    * [ 3, 4, **1**, **7**, 5 ]

    * [ 3, 4, 1, **5**, **7** ]<br><br>
4. This whole process is repeated n-1 times.<br><br>
5. Thus we get the sorted array:
    * [ 1, 3, 4, 5, 7 ]
    