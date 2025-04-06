# Fibonacci Sequence Program

## Description

This program calculates and prints the Fibonacci sequence up to a specified number of terms. The sequence begins with 0 and 1, and each subsequent number is the sum of the previous two numbers.

In this version, the program prints the first 10 terms of the Fibonacci sequence, but the number of terms can be adjusted as needed.

## How It Works

1. The program starts with two numbers: 0 and 1.
2. It then calculates each subsequent Fibonacci number as the sum of the previous two numbers.
3. The program prints each number as it is calculated.

## Code Explanation

1. **Variables:**
   - `a`: Stores the first number of the sequence (starts at 0).
   - `b`: Stores the second number of the sequence (starts at 1).
   - `next`: Temporarily stores the next number in the sequence before printing it.

2. **For Loop:**
   - The loop runs 8 times to calculate and print the next 8 Fibonacci numbers, but this can be adjusted.

3. **Logic:**
   - In each iteration of the loop:
     - `next` is calculated as the sum of `a` and `b`.
     - `a` is updated to hold the value of `b`.
     - `b` is updated to hold the value of `next`.

## Example Output

```
0
1
1
2
3
5
8
13
21
34
```

## How to Run

To run this program, you need a Java runtime environment (JRE).

1. Save the code in a file named `FibonacciSequence.java`.
2. Open a terminal and navigate to the folder where the file is saved.
3. Compile the program using the following command:
   ```
   javac FibonacciSequence.java
   ```
4. Run the program using the following command:
   ```
   java FibonacciSequence
   ```

## Customization

- The number of Fibonacci terms can be adjusted by changing the number in the loop condition:
  ```java
    // for (int i = 0; i < 8; i++) {
  ```
  Replace `8` with any number to print that many Fibonacci numbers.

## Author
Guluzade Gulu


