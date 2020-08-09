T = int(input())
res = [""]*T
while(T>0):
    N = int(input())
    rank = list(map(int, input().split()))
    assert(len(rank) == N)

    previous_rank = rank[0]
    total_gifts = previous_rank
    for i in range(1,N):
        if rank[i] > rank[i-1]:
            total_gifts = total_gifts + previous_rank + 1
        else:
            total_gifts = total_gifts + 1
        previous_rank = rank[i]
    res.append(total_gifts)
    T-=1

for i in res:
    print(i)