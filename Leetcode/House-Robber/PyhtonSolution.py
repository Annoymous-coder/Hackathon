def maxSubsetSum(arr):
    dp = []
    dp.append(arr[0])
    dp.append(max(arr[:2]))
    for a in arr[2:]:
        dp.append(max([
            dp[-2]+a, 
            a, 
            dp[-1]
        ]))
    return dp[-1]