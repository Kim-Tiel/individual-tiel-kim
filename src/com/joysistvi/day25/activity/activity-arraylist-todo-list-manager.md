# Activity 16: Conditional To-Do List Manager

## Objective

Students will practice using `ArrayList` methods together with conditional statements and methods to manage a simple to-do list.

## Instructions

1. **Setup**
   - Create a Java class named `TodoManager`.
   - Import `ArrayList` and `Scanner`.

2. **Declare the Scanner and the ArrayList**
   - Declare these two as `static` variables inside the class, outside of the `main` method:
     - A `Scanner` called `scanner`
     - An `ArrayList<String>` called `tasks`

3. **Create the Helper Method**

   Add this method to your class. It keeps asking until the user enters a valid number:

   ```java
   // Keeps asking until the user enters a valid integer
   public static int getInput(String prompt) {
       while (true) {
           System.out.print(prompt);
           String input = scanner.nextLine().trim();

           try {
               return Integer.parseInt(input);
           } catch (NumberFormatException e) {
               System.out.println("Invalid Input. Please enter a number.");
           }
       }
   }
   ```

   Use `getInput()` every time you need a number from the user (the menu choice and the task numbers).

4. **Menu System**
   - Create a method named `showMenu()` that displays this menu:

     ```
     1. Add a task
     2. View all tasks
     3. Update a task
     4. Remove a task
     5. Clear all tasks
     0. Exit
     ```

   - Ask the user to enter a choice using `getInput()`.

5. **Create a Method for Each Option**

   Create these methods. Each one does the work of one menu option:

   - `addTask()`: ask for a task and add it to the list.
   - `viewTasks()`: display all tasks with numbers starting at 1. If the list is empty, display `No tasks yet.`
   - `updateTask()`: ask for the task number, then ask for the new task and update it.
   - `removeTask()`: ask for the task number and remove the task.
   - `clearTasks()`: clear the list.

   For `updateTask()` and `removeTask()`, if the task number does not exist, display `Invalid task number.`

6. **Use Conditional Statements**
   - In the `main` method, handle the user's choice using either an **if-else ladder** or a **switch**:
     - If the user enters `1`, call `addTask()`.
     - If the user enters `2`, call `viewTasks()`.
     - If the user enters `3`, call `updateTask()`.
     - If the user enters `4`, call `removeTask()`.
     - If the user enters `5`, call `clearTasks()`.
     - If the user enters `0`, exit the program.
     - For any other number, display `Invalid choice. Please try again.`

7. **Loop Until Exit**
   - Keep showing the menu until the user chooses `0`.

## Sample Output

```
--- Todo Manager Menu ---
1. Add a task
2. View all tasks
3. Update a task
4. Remove a task
5. Clear all tasks
0. Exit
Enter your choice: 0
Exiting TodoManager. Goodbye!

Process finished with exit code 0
```
