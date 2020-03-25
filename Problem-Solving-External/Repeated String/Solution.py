#!/bin/python

import math
import os
import random
import re
import sys

# Complete the repeatedString function below.


 
# Complete the repeatedString function below.
def repeatedString(s, n):
    n_per_string = s.count('a')
    n_per_substring = s[0:n%len(s)].count('a')
    return n_per_string * (n/len(s)) + n_per_substring
 

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = raw_input()

    n = int(raw_input())

    result = repeatedString(s, n)

    fptr.write(str(result) + '\n')

    fptr.close()

