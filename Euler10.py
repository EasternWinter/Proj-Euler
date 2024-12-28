n = 2000000
prime = [True for i in range(n+1)]
p = 2
while p * p <= n:
    if prime[p] == True:
        for i in range(p * p, n+1, p):
            prime[i] = False
    p += 1
c = 0
for p in range(2, n+1):
    if prime[p] == True:
        c = c + p
print(c)
