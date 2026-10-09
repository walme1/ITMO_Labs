from math import *
A = str(input())
res = 0
for i in range (1, len(A) + 1):
    res += int(A[-i]) * factorial(i)
print(res)