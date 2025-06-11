import math
l = {}
count = 0
m = 2
MaxL = 1500000
while 2*m*(m+1) <= MaxL:
    for n in range(1, m):
        if math.gcd(m, n) == 1 and n%2 != m%2:
            L = 2*m*(n + m)
            for i in range(L, MaxL + 1, L):
                if i in l:
                    l[i] += 1
                else:
                    l[i] = 1
    m +=1
for j in l:
    if l[j] == 1:
        count += 1
print(count)