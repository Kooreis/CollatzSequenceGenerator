def collatz_sequence(n):
    while n != 1:
        print(n)
        if n % 2 == 0:
            n = n // 2