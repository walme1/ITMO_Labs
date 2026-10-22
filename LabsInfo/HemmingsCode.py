hemming = list(input('Введи только 7 битов: '))
if any(bit not in ['0', '1'] for bit in hemming):
    print('Используй только двоичную запись!')
elif len(hemming) != 7:
    print('Только 7 цифр!')

else:
    S1 = int(hemming[0]) + int(hemming[2]) + int(hemming[4]) + int(hemming[6])
    if S1 % 2 != 0:
        S1 = '1'
    else:
        S1 = '0'
    S2 = int(hemming[1]) + int(hemming[2]) + int(hemming[5]) + int(hemming[6])
    if S2 % 2 != 0:
        S2 = '1'
    else:
        S2 = '0'
    S3 = int(hemming[3]) + int(hemming[4]) + int(hemming[5]) + int(hemming[6])
    if S3 % 2 != 0:
        S3 = '1'
    else:
        S3 = '0'

    S = int(S3 + S2 + S1, 2)

    if S > 0:
        print(f'Найдена ошибка в бите номер {S}')
        if hemming[S - 1] == '1':
            hemming[S - 1] = '0'
        else:
            hemming[S - 1] = '1'
    else:
        print('Ошибок не обнаружено')
    bits = hemming[2] + hemming[4] + hemming[5] + hemming[6]
    print(f'Информационные биты: {bits}')   
