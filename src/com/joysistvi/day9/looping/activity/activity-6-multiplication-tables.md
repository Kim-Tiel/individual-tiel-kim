# Activity 5: Multiplication Tables using Java

## Overview

In this activity, you will create two Java programs that display multiplication tables. The first program uses the `Scanner` class to display one table chosen by the user. The second program uses **nested for loops** to display multiple tables at once.

---

## Part 1: Multiplication Table using Scanner

Create a Java program that requires the use of the `Scanner` class.

### Requirements

- The program should ask the user to input which multiplication table they want to display.
- Only the chosen multiplication table will be shown. For example, if the user inputs `5`, only the multiplication table of 5 will be displayed.
- Each table should list the multiples from 1 up to 10.

### Sample Run

```
Enter the multiplication table you want to display: 5

Multiplication Table of 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
```

---

## Part 2: Multiplication Tables using Nested For Loops

Create another Java program **in a separate class** that displays multiplication tables using nested for loops.

### Requirements

- Use **nested for loops** (an outer loop for the table number and an inner loop for the multiplier).
- The output should clearly label each table, for example: `Multiplication Table of 2`.
- Each table should list the multiples from 1 up to 10, for example: `2 x 1 = 2`, `2 x 2 = 4`, ..., `2 x 10 = 20`.
- Display the tables for 1 through 10.

### Sample Output

```
Multiplication Table of 1
1 x 1 = 1
1 x 2 = 2
...
1 x 10 = 10

Multiplication Table of 2
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20

Multiplication Table of 3
3 x 1 = 3
...
3 x 10 = 30

...

Multiplication Table of 10
10 x 1 = 10
...
10 x 10 = 100
```

---

## Notes

- Part 1 and Part 2 must be in **separate classes** (separate `.java` files).
- Keep the output format exactly as shown: `<number> x <multiplier> = <product>`.

---

## Submission

1. Push your code to GitHub using `git add`, `git commit`, and `git push`.
2. Submit the URL of your GitHub repository in Google Classroom.
