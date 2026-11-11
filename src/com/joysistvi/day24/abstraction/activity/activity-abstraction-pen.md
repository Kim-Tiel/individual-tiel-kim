# Activity: Abstraction with Pen

## Objective

Apply abstraction by turning `Pen` into an abstract class, creating interfaces with constants, and updating your `Ballpen` and own child class (`Marker`, `Pencil`, or `Highlighter`) from the polymorphism activity.

## Instructions

Use your code from the polymorphism activity as the starting point. Do not start from scratch.

### Part 1: Make `Pen` abstract

1. Change `Pen` into an abstract class.

2. Change `write()` into an abstract method (no body):

   ```java
   public abstract void write();
   ```

3. Remove `refill()` from `Pen`. It will move to an interface in Part 2.

4. Keep the constructor, getters and setters, `toString()`, and the two overloaded `write(String)` methods unchanged.

5. Add this regular (non-abstract) method to `Pen`:

   ```java
   public void store() {
       System.out.println("Storing the pen in the pencil case.");
   }
   ```

### Part 2: Create the interfaces

6. Create an interface named `Refillable` in the same package.
   - Add this constant:

     ```java
     int MAX_REFILLS = 5;
     ```

   - Add this method (no body):

     ```java
     void refill();
     ```

7. Create another interface named `Clickable` in the same package.
   - Add this constant:

     ```java
     String CLICK_SOUND = "Click!";
     ```

   - Add this method (no body):

     ```java
     void click();
     ```

### Part 3: Update the child classes

8. Update `Ballpen` so it extends `Pen` and implements **both** interfaces:

   ```java
   public class Ballpen extends Pen implements Refillable, Clickable
   ```

9. Update your own child class so it extends `Pen` and implements **only** `Refillable`:

   ```java
   public class Marker extends Pen implements Refillable
   ```

10. Make sure each class has `@Override` versions of the methods it must implement:
    - `Ballpen`: `write()`, `refill()`, `click()`
    - Your own child class: `write()`, `refill()`

    Keep the same messages for `write()` and `refill()` from the polymorphism activity. For `click()` in `Ballpen`, print this message:

    ```
    Click! The ballpen tip comes out.
    ```

    Use the constant `CLICK_SOUND` instead of typing `"Click!"` again.

### Part 4: Update the `Main` class

11. Remove any `new Pen(...)`. Before you remove it, try running it and read the error message. Then write a comment in `Main` that explains why it fails.

12. Create one `Ballpen` object and one object of your own child class.

13. Create a method with this signature:

    ```java
    public static void testPen(Pen pen)
    ```

    It must print the pen using `System.out.println(pen)`, then call `write()` and `store()`.

14. Create a method with this signature:

    ```java
    public static void testRefillable(Refillable refillable)
    ```

    It must call `refill()`, then print the maximum refills using the constant `Refillable.MAX_REFILLS`.

15. Create a method with this signature:

    ```java
    public static void testClickable(Clickable clickable)
    ```

    It must call `click()`.

16. Call `testPen()` and `testRefillable()` for both objects. Call `testClickable()` for the `Ballpen` only.

17. Try calling `testClickable()` with your own child class. Read the error message, then write a comment in `Main` that explains why it fails.

### Part 5: Takeaway

18. At the bottom of `Main.java`, write a comment (3 to 5 lines) that explains the difference between:
    - Abstract class (`extends`)
    - Interface (`implements`)

## Sample Output (Marker)

```
=== testPen() ===
Type: Ballpen
Brand: Pilot
Color: Black
Weight in Grams: 20.0
Point Size: 1.0
Writing smoothly with a ballpen.
Storing the pen in the pencil case.

Type: Marker
Brand: Pentel
Color: Red
Weight in Grams: 35.0
Permanent: Yes
Writing boldly with a marker.
Storing the pen in the pencil case.

=== testRefillable() ===
Replacing the ballpen ink refill.
Maximum refills: 5

Refilling the marker ink.
Maximum refills: 5

=== testClickable() ===
Click! The ballpen tip comes out.
```
