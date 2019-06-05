
nums = [6, 3, 2, 10, 1]
val = True
length = len(nums) -1
while val:
    val = False
    for i in range(length):
        if nums[i] > nums[i +1]:
            temp = nums[i]
            nums[i] = nums[i +1]
            nums[i +1] = temp
            val = True

print(nums)