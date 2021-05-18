# Bitwise Operators

1. ### Bitwise-And Operator ( **&** )


    | a |   | b |   | a & b |
    |---|---|---|---|:--:   |
    | 0 |   | 0 |   |   0   |
    | 0 |   | 1 |   |   0   |
    | 1 |   | 0 |   |   0   |
    | 1 |   | 1 |   |   1   |
    |   |   |   |   |       |

2. ### Bitwise-Or Operator ( **|** )


    | a |   | b |   | a or b|
    |---|---|---|---|:--:   |
    | 0 |   | 0 |   |   0   |
    | 0 |   | 1 |   |   1   |
    | 1 |   | 0 |   |   1   |
    | 1 |   | 1 |   |   1   |
    |   |   |   |   |       |

3. ### XOR Operator ( **^** )

    | a |   | b |   | a ^ b |
    |---|---|---|---|:--:   |
    | 0 |   | 0 |   |   0   |
    | 0 |   | 1 |   |   1   |
    | 1 |   | 0 |   |   1   |
    | 1 |   | 1 |   |   0   |
    |   |   |   |   |       |

4. ### Inverse Operator ( **~** )

        Example: ~ ( 5 ) = ~ ( 1 0 1 ) = 0 1 0

5. ### Right Shift Operator ( **>>** )
    
        Example: 12 >> 2 = 3
        
        It means shifting bits of 12 two times to the right.

        => ...0 0 0 0 1 1 0 0 >> 2
    
        => ...0 0 0 0 0 0 1 1 

6. ### Left Shift Operator ( **<<** )

        Example: 12 << 2 = 48
        
        It means shifting bits of 12 two times to the left.

        => ...0 0 0 0 1 1 0 0 << 2

        => ...0 0 1 1 0 0 0 0

        NB: The empty spaces in the left is filled with zeros

    ## Note

    - a >> 1 = a / 2

    - a << 1 = a * 2
    