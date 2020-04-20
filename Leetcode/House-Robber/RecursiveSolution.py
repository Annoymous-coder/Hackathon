def maxSubsetSum(arr):
    if len(arr) == 1:
        return arr[0]
    if len(arr) == 2:
        return max(arr)
    return max([
        arr[0],
        arr[0] + maxSubsetSum(arr[2:]),
        maxSubsetSum(arr[1:])
    ])