# Bit Masking
    Here a new binary number called mask is initialized. 
    Then bitwise operation is performed on the given number using the mask.

    Examples Qns:
    
    1.  Seting ith bit
    2.  Finding ith bit
    3.  Clearing ith bit

    
    Consider the case of seting ith bit

    Here, let the binary number be 1 1 0 0 1 and i = 2
    Required Output is 1 1 0 1 1

    So now we have to make a binary mask 0 0 0 1 0
    Then we do the OR Operation ( mask | given no ) to get the required output.

    ( 0 0 0 1 0 | 1 1 0 0 1 ) = 1 1 0 1 1