A = int(input())
res = []

while A != 0:
    ost = A % 9
    A //= 9
    if ost > 4:
        ost -= 9
        A += 1
    res.append(ost)
res1 = ""
# print(res[::-1])
for i in res[::-1]:
    if i < 0:
        i = "{" + str(i) + "}"
        res1 += i
    else:
        res1 += str(i)
res11 = res1.replace("-", "^")
print(res11)