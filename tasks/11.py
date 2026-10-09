A = int(input())
fib = [1, 2]

while fib[-1] < A:
    fib.append(fib[-1] + fib[-2])

if fib[-1] > A:
    fib.pop()

res = ""
for i in reversed(range(len(fib))):
    if fib[i] <= A:
        res += "1"
        A -= fib[i]
    else:
        res += "0"
print(res)
