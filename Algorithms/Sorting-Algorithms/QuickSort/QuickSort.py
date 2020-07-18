import random as r

def Partition(nums, beg, end):
    pivot = nums[end]
    pivotIndex = beg
    for i in range(beg, end):
        if nums[i] <= pivot:
            nums[i],nums[pivotIndex] = nums[pivotIndex],nums[i]
            pivotIndex+=1
    nums[pivotIndex],nums[end] = nums[end],nums[pivotIndex]
    return pivotIndex

def QuickSort(nums, beg, end):
    if beg < end:
        partitionIndex = Partition(nums, beg, end)
        QuickSort(nums, beg, partitionIndex-1)
        QuickSort(nums, partitionIndex+1, end)

N = int(input("Enter the size of the array \n"))
nums = [0]*N

# Generate N numbers in the range[1,50]
nums = r.sample(range(1,50), N)

print("Before Quick Sort:", end = "\n")
for number in nums:
    print(number, end = " ")

print("\n")

QuickSort(nums,0,len(nums)-1)

print("After Quick Sort:", end = "\n")
for number in nums:
    print(number, end = " ")