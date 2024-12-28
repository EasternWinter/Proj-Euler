product = 1
n = 100
for i in range(1, n+1):
    product = product * i

pro = str(product)
my_list = []

for i in range(0, len(pro)):
    my_list.append(int(pro[i]))

print(sum(my_list))
