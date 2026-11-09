# Activity: Polymorphism with Pen

## Objective

Apply method overriding, runtime polymorphism, and method overloading by building on your `Pen`, `Ballpen`, and own child class (`Marker`, `Pencil`, or `Highlighter`) from the inheritance activity.

## Instructions

Use your code from the inheritance activity as the starting point. Do not start from scratch.

### Part 1: Method overriding

1. In `Pen`, add this method:

   ```java
   public void refill() {
       System.out.println("Refilling the pen.");
   }
   ```

2. Override `refill()` in `Ballpen` and in your own child class. Each one must print its own message. Examples:
   - `Ballpen`: `"Replacing the ballpen ink refill."`
   - `Marker`: `"Refilling the marker ink."`
   - `Pencil`: `"Replacing the pencil lead."`
   - `Highlighter`: `"Refilling the highlighter ink."`

3. Use `@Override` on every overridden method, including `write()`.

### Part 2: Method overloading

4. In `Pen`, add these overloaded methods:

   ```java
   public void write(String text) {
       System.out.println("Writing \"" + text + "\" with a pen.");
   }

   public void write(String text, int times) {
       for (int i = 0; i < times; i++) {
           write(text);
       }
   }
   ```

   Do NOT override these two in the child classes.

### Part 3: Runtime polymorphism

5. In `Main`, create these objects using a **`Pen` reference**:
   - One `Pen`
   - One `Ballpen`
   - One object of your own child class

   Example:

   ```java
   Pen pen2 = new Ballpen(...);
   ```

6. For each of the three objects, print a label (for example, `"--- Ballpen ---"`), then call `write()` and `refill()`.

7. Create a method in `Main` with this signature:

   ```java
   public static void testPen(Pen pen)
   ```

   It must print the pen using `System.out.println(pen)`, then call `write()` and `refill()`.

8. Call `testPen()` three times, once for each of your objects.

### Part 4: Overloading in action

9. Using one of your child objects stored in a `Pen` reference, call:
   - `write("Hello")`
   - `write("Hello", 3)`

### Part 5: Takeaway

10. At the bottom of `Main.java`, write a comment (3 to 5 lines) that explains the difference between:
    - Method overloading (compile-time)
    - Method overriding (runtime)

## Sample Output (Marker)

```
=== Calling methods on Pen references ===
--- Pen ---
Writing with a pen.
Refilling the pen.

--- Ballpen ---
Writing smoothly with a ballpen.
Replacing the ballpen ink refill.

--- Marker ---
Writing boldly with a marker.
Refilling the marker ink.

=== testPen() ===
Brand: Generic
Color: Blue
Weight in Grams: 15.0
Writing with a pen.
Refilling the pen.

Type: Ballpen
Brand: Pilot
Color: Black
Weight in Grams: 20.0
Point Size: 1.0
Writing smoothly with a ballpen.
Replacing the ballpen ink refill.

Type: Marker
Brand: Pentel
Color: Red
Weight in Grams: 35.0
Permanent: Yes
Writing boldly with a marker.
Refilling the marker ink.


=== Overloading ===
Writing "Hello" with a pen.
Writing "Hello" with a pen.
Writing "Hello" with a pen.
Writing "Hello" with a pen.
```

(The first line under Overloading comes from `write("Hello")`, and the next three come from `write("Hello", 3)`.)
