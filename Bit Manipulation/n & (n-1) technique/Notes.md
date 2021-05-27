# n & (n-1) Technique

- Used to find the no of **1s** in the given binary number.

        Example:
    
        Consider the binary number 1 1 0 1
        
        Let c = 0

        1st iteration => 1 1 0 1 & 1 1 0 0 = 1 1 0 0 , c = 1

        2nd iteration => 1 1 0 0 & 1 0 1 1 = 1 0 0 0 , c = 2

        3rd iteration => 1 0 0 0 & 0 1 1 1 = 0 0 0 0 , c = 3

        So 1 1 0 1 has three 1s in it.

        NB: Loop runs until given number becomes 0

    ## Note

    - No of bits in a decimal number = log2 ( n ) + 1

    - No of digits in a decimal number = log10 ( n ) + 1