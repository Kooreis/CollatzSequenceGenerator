# Python Documentation

# Collatz Sequence Generator

This Python script generates the Collatz sequence for a given number. The Collatz sequence is a sequence of numbers resulting from the following operations on an initial number:

1. If the number is even, divide it by 2.
2. If the number is odd, multiply it by 3 and add 1.
3. Repeat the process until the number becomes 1.

## Script Description

The script contains a single function, `collatz_sequence(n)`, which takes an integer `n` as input and prints the Collatz sequence starting from `n`, until it reaches 1.

Here is a brief explanation of the function:

```python
def collatz_sequence(n):
    while n != 1:
        print(n)
        if n % 2 == 0:
            n = n // 2
        else:
            n = 3*n + 1
    print(n)
```

- The function enters a while loop that continues until `n` becomes 1.
- Inside the loop, it first prints the current value of `n`.
- Then it checks if `n` is even (i.e., `n % 2 == 0`). If it is, it divides `n` by 2 using integer division (`n = n // 2`).
- If `n` is odd, it multiplies `n` by 3 and adds 1 (`n = 3*n + 1`).
- The loop repeats with the new value of `n`, and so on, until `n` becomes 1. At this point, it prints `n` and exits the loop.

The script then prompts the user to enter a number, and calls the `collatz_sequence` function with this number:

```python
n = int(input("Enter a number: "))
collatz_sequence(n)
```

## Libraries Used

This script does not import any libraries. It uses only built-in Python functions and operators.

---

# C# Documentation

# CSharp Collatz Conjecture Program

This repository contains a simple C# console application that demonstrates the Collatz Conjecture. The Collatz Conjecture is a mathematical algorithm that starts with any positive integer n. Then each term is obtained from the previous term as follows: if the previous term is even, the next term is one half of the previous term. If the previous term is odd, the next term is 3 times the previous term plus 1. The conjecture is that no matter what value of n, the sequence will always reach 1.

## Code Explanation

The script begins by importing the System namespace:

```csharp
using System;
```

The System namespace contains fundamental classes and base classes that define commonly-used value and reference data types, events and event handlers, interfaces, attributes, and processing exceptions. In this script, it is used to handle standard I/O operations through the Console class.

The script then defines a Program class and a Main method, which is the entry point of the C# console application:

```csharp
class Program
{
    static void Main(string[] args)
    {
        // ...
    }
}
```

Inside the Main method, the script first prompts the user to enter a number:

```csharp
Console.Write("Enter a number: ");
int number = Convert.ToInt32(Console.ReadLine());
```

The script then enters a while loop that continues until the number reaches 1. Inside the loop, the script prints the current number, then checks if it is even or odd. If the number is even, it is divided by 2; if it is odd, it is multiplied by 3 and then 1 is added:

```csharp
while (number != 1)
{
    Console.Write(number + " ");
    if (number % 2 == 0)
    {
        number = number / 2;
    }
    else
    {
        number = 3 * number + 1;
    }
}
Console.Write(number);
```

This loop is the core of the Collatz Conjecture algorithm. The script finally prints the number 1, which is the end point of the Collatz sequence.

## Running the Script

To run the script, you need a C# compiler such as the one provided by the .NET SDK. You can then compile and run the script using the `dotnet run` command.

---

# Java Documentation

# Collatz Sequence Generator in Java

This Java program generates the Collatz sequence for a given number. The Collatz sequence is a sequence of numbers resulting from the following operations on an initial number:

- If the number is even, the next number is one half of the current number.
- If the number is odd, the next number is 3 times the current number plus 1.

The sequence ends when it reaches number 1.

## Code Explanation

The script starts by importing the `java.util.Scanner` class, which is a simple text scanner that can parse primitive types and strings using regular expressions. It is used in this script to read the input number from the user.

The main method of the `CollatzSequenceGenerator` class begins by creating a `Scanner` object to read the user's input. It then prompts the user to enter a number.

The script then enters a loop that continues until the number becomes 1. In each iteration of the loop, the script prints the current number and then updates the number based on whether it is even or odd, following the rules of the Collatz sequence.

When the number finally becomes 1, the script prints the number and exits.

## Usage

To use this script, simply run it in a Java environment, enter a number when prompted, and the script will print the Collatz sequence starting from that number.

## Libraries Used

- `java.util.Scanner`: This class is a part of the Java Collections Framework and is used to get input from the user. It provides methods to parse primitive types and strings. In this script, it is used to read the initial number for the Collatz sequence from the user.

---
