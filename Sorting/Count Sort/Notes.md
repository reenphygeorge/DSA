# Count Sort
* It is an efficient algorithm to sort an array with repeating elements.
* Time Complexity : O (N)

## Working
1. Consider an array arr

        arr[] = [1, 4, 1, 2, 7, 5, 2]
2. Now initialize an array count[] of size = greatest element in the array arr + 1

        count[7+1] ie.., count[8]
3. Now take the count of each element and store them in the appropriate locations of the array count[]

        ie.., here in arr '1' occurs 2 times, so put count[1] = 2
        but '3' occurs 0 times, so put count[3] = 0

        count[] = [0, 2, 2, 0, 1, 1, 0, 1]
4. Now add all the elements upto the respective positions and store it in the respective positions.

        ie.., count[1] = count[0] + count[1]
              .
              .
              .
              count[7] = count[0] + ... + count[7]
        
        count[] = [0, 2, 4, 4, 5, 6, 6, 7]
5. Initialize a new array result[] of size equal to that of arr[]
   
   Now start a loop from the last element of arr and store the value of the respective element in a variable 'temp'
        
        temp = current element of arr
   Decrement count[temp] by 1
        
        ie, count[temp] = count[temp] - 1
   Now store temp in result[count[temp]]

        ie.., result[count[temp]] = temp
6. Now the array becomes sorted:

        result[] = [1, 1, 2, 2, 4, 5, 7]