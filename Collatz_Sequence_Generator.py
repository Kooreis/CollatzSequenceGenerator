def collatz_sequence(n):
    while n != 1:
        print(n)
        if n % 2 == 0:
            n = n // 2
        else:
            n = 3*n + 1
    print(n)

n = int(input("Enter a number: "))
collatz_sequence(n)