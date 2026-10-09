text = input("Введите 7 бит: ").strip()

if len(text) != 7 or text.count("0") + text.count("1") != 7:
    print("Ошибка: введите ровно 7 цифр 0 или 1")
else:
    bits = [int(c) for c in text]
    names = ["r1", "r2", "i1", "r3", "i2", "i3", "i4"]

    s1 = (bits[0] + bits[2] + bits[4] + bits[6]) % 2
    s2 = (bits[1] + bits[2] + bits[5] + bits[6]) % 2
    s3 = (bits[3] + bits[4] + bits[5] + bits[6]) % 2

    error = s1 + 2 * s2 + 4 * s3

    if error != 0:
        print("Ошибка в бите", error, names[error - 1])
        bits[error - 1] = 1 - bits[error - 1]
    else:
        print("Ошибок не обнаружено")

    print("Правильное сообщение: ", bits[2], bits[4], bits[5], bits[6], sep="")