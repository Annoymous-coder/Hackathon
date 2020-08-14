import random as r

def MergeSort(nums):
    # Stop recursion when size of list becomes 1. That is sorted.
    if len(nums) < 2:
        return

    # For every recursive call, divide the list in halves of left and right parts.
    mid = len(nums)//2
    left = [0]*mid
    right = [0]*(len(nums)-mid)
    
    left = nums[:mid]
    right = nums[mid:]

    # Recursive Call for sorting individual left and right sides, when both are complete Merge method is called.
    MergeSort(left)
    MergeSort(right)
    Merge(nums, left, right)

# Merge method to merge left and right subarrays back into nums with sorted order.
def Merge(nums, left, right):
    i,j,k = 0,0,0
    while(i<len(left) and j<len(right)):
        if left[i] < right[j]:
            nums[k] = left[i]
            i+=1
        else:
            nums[k] = right[j]
            j+=1
        k+=1
    while i<len(left):
        nums[k] = left[i]
        i+=1
        k+=1
    while j<len(right):
        nums[k] = right[j]
        j+=1
        k+=1

N = int(input("Enter the size of the array \n"))
nums = [0]*N
nums = r.sample(range(1,100), N)

print("Before MergeSort:")
for number in nums:
    print(number, end = " ")

print("\n")

MergeSort(nums)

print("After MergeSort:")
for number in nums:
    print(number, end = " ")
