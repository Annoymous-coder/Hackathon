import random as r

def QuickSort(nums, beg, end):
    if beg < end:
        RandomizedPartitionIndex = Partition(nums, beg, end)
        QuickSort(nums, beg, RandomizedPartitionIndex-1)
        QuickSort(nums, RandomizedPartitionIndex+1, end)

# Randomized Partition is done to reduce the probability of getting unbalanced separation by partitionIndex.
def RandomizedPartition(nums, beg, end):
    # Get a random number in range[beg,end] and swap with end element, to continue calling the general Partition Method.
    randomePivotIndex = r.randint(beg,end)
    nums[randomePivotIndex],nums[end] = nums[end],nums[randomePivotIndex]
    Partition(nums,beg,end)

# Lomuto's Partition Method
def Partition(nums, beg, end):
    pivot = nums[end]
    pivotIndex = beg
    for i in range(beg, end):
        if nums[i] <= pivot:
            nums[i],nums[pivotIndex] = nums[pivotIndex],nums[i]
            pivotIndex+=1
    nums[pivotIndex],nums[end] = nums[end],nums[pivotIndex]
    return pivotIndex

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