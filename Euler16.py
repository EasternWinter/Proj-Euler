number = 2**1000
pro = str(number)
my_list = []

for i in range(0, len(pro)):
    my_list.append(int(pro[i]))

print(sum(my_list))
