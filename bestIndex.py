N = int(input())
elements = list(map(int, input().split()))
r = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
length = len(elements)
ls = []
copy = 0
while copy < length:
    sums = 0
    approach = copy + 1
    i = 1
    sums += elements[copy]
    for x in range(copy, length):
        i += 1
        p = approach + i
        if p > length:
            break
        for y in range(approach, p):
            sums += elements[y]
        
        approach += i

    ls.append(sums)
    copy += 1  
#finding max value
flag = 0
maxVal = 0
for i in range(length):
    for j in range(length):
        if ls[i] >= ls[j]:
            flag = 1
        else:
            flag =0
            break

    if flag == 1:
        maxVal = ls[i]
        break
print(maxVal)