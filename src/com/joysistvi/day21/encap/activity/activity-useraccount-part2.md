# Activity: UserAccount, Part 2 (Constructor and toString)

## Objective

Improve your Day 1 `UserAccount` program by adding a parameterized constructor and a `toString()` method.

## Instructions

Use your Day 1 code as the starting point. Do not start from scratch.

### Part 1: Update the `UserAccount` class

1. Add a parameterized constructor that accepts all six fields:
   - `firstName`, `middleName`, `lastName`, `address`, `email`, `password`

2. Use `this` inside the constructor.

3. Make sure your validation rules for email and password still work when an object is created through the constructor.
   - Hint: think about whether the constructor should assign the fields directly or call your setters. What happens to your validation in each case?

4. Override `toString()` using `@Override`. It must display:
   - Full name (first, middle, last)
   - Email
   - Address

   **Do NOT include the password in the output.** Think about why.

### Part 2: Update the `Main` class

5. Keep asking the user for all six fields using `Scanner`, the same as Day 1.

6. Create the object using the constructor instead of calling the setters one by one.

7. Remove the manual printing of each getter. Display the account using only:

   ```java
   System.out.println(account);
   ```

## Sample Run

```
*** User Registration ***
Please enter the details below:

Enter first name: Juan
Enter middle name: Santos
Enter last name: Dela Cruz
Enter address: Malabon City
Enter email: juan@email.com
Enter password: Secret123

=== Account Details ===
Full Name: Juan Santos Dela Cruz
Email: juan@email.com
Address: Malabon City
```

## Sample Run (Invalid Input)

```
*** User Registration ***
Please enter the details below:

Enter first name: Juan
Enter middle name: Santos
Enter last name: Dela Cruz
Enter address: Malabon City
Enter email: abc
Enter password: Secret123
Invalid email format.

=== Account Details ===
Full Name: Juan Santos Dela Cruz
Email: null
Address: Malabon City
```
