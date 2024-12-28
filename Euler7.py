import math
import time
prime_list = []
def isPrime(n):
    if n < 2: return False
    elif len(prime_list) == 0:
        for i in range(2, int(n**0.5) + 1):
            if n % i == 0:
                return False
    else:
        for i in prime_list:
            if n % i == 0:
                return False
    return True

def nthPrime(x):
    numberOfPrimes = 0
    prime = 1
    while numberOfPrimes < x:
        prime += 1
        if isPrime(prime) == True:
            prime_list.append(prime)
            numberOfPrimes += 1
    return prime

t0 = time.time()
 
print(nthPrime(10001))

t1 = time.time()
print("Time required:", t1 - t0)
