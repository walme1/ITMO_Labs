A = str(input())
res = 0

for i in range(len(A)):
    res = res * (-10) + int(A[i])

print(res)