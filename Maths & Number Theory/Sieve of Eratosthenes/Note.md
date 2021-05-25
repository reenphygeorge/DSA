# Sieve of Eratosthenes

* Used to find the prime numbers upto a range N

* Time Complexity: log( log( N ) )

<br>

## Working

    Consider N = 10

        0  1  2  3  4  5  6  7  8  9  10

    We will remove 0 and 1 from the numbers

        2  3  4  5  6  7  8  9  10
    
    We will start from 2 and remove all multiples of 2

        2  3  5  7  9
    
    Now we will do the same with multiples of 3 and this process continues for square root of 10 = 3 times.

        2  3  5  7

    Thus we got the prime numbers upto 10.

    

