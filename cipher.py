lstext = input()
rotationUnit = int(input())
alpha = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
nums = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
newWord = []
flag = 0
for i in range(len(text)):
    for l in alpha:
        if text[i] == l:
            flag = 1
            break
    for n in nums:
        if text[i] == n:
            flag = 2
            break
    if flag == 1:
        try:
            a = text[i]
            if a.isupper():
                a = text[i].swapcase()
            position = alpha.index(a)
            position += rotationUnit
            actual = len(alpha) - 1
            if position > actual:
                newPos = position - len(alpha)
                newWord.append(alpha[newPos])
            else:
                newWord.append(alpha[position])
        except ValueError:
            newWord.append(text[i])

        #Number section
    elif flag == 2:
        try:
            position = nums.index(text[i])
            position += rotationUnit
            actual = len(nums) - 1
            if position > actual:
                newPos = position - len(nums)
                newWord.append(nums[newPos])
            else:
                newWord.append(nums[position])
        except ValueError:
            newWord.append(text[i])
    
    else:
        newWord.append(text[i])
        
print(''.join(newWord))

