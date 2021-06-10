# Binary Search

* It's a searching algorithm used on sorted array
* It's more efficient than linear search
* Time Complexity : O(Log n)<br><br><br>

    ## Working

    1. Consider a sorted array 'arr' of size 'n' (here n = 10):
            
            2, 5, 8, 12, 16, 23, 38, 56, 72, 91
    
    2. Let 'x' be the number to be searched.  
            
            Consider x = 38

    3. Initialize start = 0 and end = n-1 
    
            here end = 9

    4. Initialize mid = ( start + end ) / 2
        (mid should be an int variable)
        
            here mid becomes 4

    5. if arr[mid] < x then shift start to mid + 1
        else if arr[mid] > x then shift end to mid - 1
        else if arr[mid] == x then return mid

            here arr[mid] = 16 which is less than 38. So start is shifted to 5
        
            Now the required part of array becomes:
            23, 38, 56, 72, 91

    6. This process is continued until arr[mid] == x or until start < end

    7. If the location of x is not yet returned (ie.., x is'nt found in the array) return -1