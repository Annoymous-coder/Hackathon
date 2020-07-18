N = int(input())
nums = list(map(int, input().split()))
assert(len(nums) == N)

# bit_score is in str type to make use of membership operator
bit_score = [""]*N
even_index_frequency = [0]*10
odd_index_frequency = [0]*10

# total pairs possible for ith digit/MSB
total_current_pairs = [0]*10

def largest(number):
    i=9
    while i>=0:
        if str(i) in number:
            return i
        i-=1

def smallest(number):
    i=0
    while i<=9:
        if str(i) in number:
            return i
        i+=1
    
def getMSB(number):
    return int(int(number)/10)

def getPairsFor(number):
    if number == 2:
        return 1
    elif number >= 3:
        return 2
    return 0

for i in range(0, len(nums)):
    current_score = str((largest(str(nums[i])) * 11) + (smallest(str(nums[i])) * 7))
    if len(current_score) > 2:
        current_score = current_score[-2:]
    bit_score[i] = current_score

for i in range(len(bit_score)):
    # odd-frequency in 1 based indexing
    if i%2==0:
        odd_index_frequency[getMSB(bit_score[i])]+=1
    # even frequencys in 1 based indexing
    if i%2==1:
        even_index_frequency[getMSB(bit_score[i])]+=1

for i in range(10):
    # 0 or 1 frequency for a digit cannot form a pair hence neglect such combinations
    if odd_index_frequency[i] <=1 and even_index_frequency[i] <=1:
        continue
    # total_current_pairs stores the possible pairs from both odd and even frequency MSB's
    total_current_pairs[i] = getPairsFor(odd_index_frequency[i]) + getPairsFor(even_index_frequency[i])
    # maximum of 2 pairs allowed, taking account of both MSB'in odd and even frequencies.
    total_current_pairs[i] = min(2, total_current_pairs[i])

print(sum(total_current_pairs), end = "\n")