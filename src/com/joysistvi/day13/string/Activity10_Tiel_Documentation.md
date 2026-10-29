# Activity 10: String Class Documentation

## Introduction

| Method | What it does | Returns |
| --- | --- | --- |
| `contains()` | Checks if the string has a sequence of characters | `boolean` |
| `endsWith()` | Checks if the string ends with the given characters | `boolean` |
| `startsWith()` | Checks if the string starts with the given characters | `boolean` |
| `indexOf()` | Finds the position of the first match | `int` |
| `trim()` | Removes whitespace from both ends | `String` |
| `replace()` | Replaces every matching character or text | `String` |
| `toCharArray()` | Converts the string into a `char` array | `char[]` |

## 1. contains()

`contains()` checks if a string has a given sequence of characters inside it. It returns `true` if the characters are found and `false` if they are not.

| | |
| --- | --- |
| Syntax | `public boolean contains(CharSequence chars)` |
| Parameter | `chars`: the characters to search for |
| Returns | `boolean`: `true` if the sequence exists, `false` if not |

**Example 1: Check if a sentence mentions Java**

```java
String sentence = "I love Java programming";
System.out.println(sentence.contains("Java"));
System.out.println(sentence.contains("Python"));
```

```
true
false
```

**Example 2: Check if an email address has an @ sign**

```java
String email = "kim.tiel@gmail.com";
System.out.println(email.contains("@"));
System.out.println(email.contains("yahoo"));
```

```
true
false
```

## 2. endsWith()

`endsWith()` checks if a string ends with the given character or characters. Its partner is `startsWith()`, which checks the beginning.

| | |
| --- | --- |
| Syntax | `public boolean endsWith(String chars)` |
| Parameter | `chars`: the character or characters to check for |
| Returns | `boolean`: `true` if the string ends with them, `false` if not |

**Example 1: Check if a file is a Java file**

```java
String fileName = "Activity10_Tiel.java";
System.out.println(fileName.endsWith(".java"));
System.out.println(fileName.endsWith(".txt"));
```

```
true
false
```

**Example 2: Check if a website is a Philippine government site**

```java
String website = "www.tesda.gov.ph";
System.out.println(website.endsWith(".gov.ph"));
System.out.println(website.endsWith(".com"));
```

```
true
false
```

## 3. startsWith()

`startsWith()` checks if a string begins with the given character or characters. Its partner is `endsWith()`, which checks the end.

| | |
| --- | --- |
| Syntax | `public boolean startsWith(String chars)` |
| Parameter | `chars`: the character or characters to check for |
| Returns | `boolean`: `true` if the string starts with them, `false` if not |

**Example 1: Check if a mobile number uses the local format**

```java
String mobileNumber = "09171234567";
System.out.println(mobileNumber.startsWith("09"));
System.out.println(mobileNumber.startsWith("+63"));
```

```
true
false
```

**Example 2: Check if a website uses a secure connection**

```java
String url = "https://www.w3schools.com";
System.out.println(url.startsWith("https://"));
System.out.println(url.startsWith("http://"));
```

```
true
false
```

## 4. indexOf()

`indexOf()` returns the position of the first occurrence of a character or text in a string. If nothing matches, it returns `-1`. Counting starts at index `0`. To find the last occurrence instead, use `lastIndexOf()`.

| | |
| --- | --- |
| Syntax (one of) | `public int indexOf(String str)` |
| | `public int indexOf(String str, int fromIndex)` |
| | `public int indexOf(int char)` |
| | `public int indexOf(int char, int fromIndex)` |
| Parameters | `str`: the text to search for |
| | `char`: a single character, such as `'A'` |
| | `fromIndex`: the index where the search starts |
| Returns | `int`: the index of the first occurrence, or `-1` if it never occurs |

**Example 1: Find the position of a character and a word**

```java
String word = "Programming";
System.out.println(word.indexOf('g'));
System.out.println(word.indexOf("gram"));
System.out.println(word.indexOf('z'));
```

```
3
3
-1
```

The word has two `g`s, but `indexOf()` returns only the first one, at index 3. The letter `z` is not in the word, so the result is `-1`.

**Example 2: Find the @ sign, and search from a starting index**

```java
String address = "kim.tiel@gmail.com";
System.out.println(address.indexOf('@'));
System.out.println(address.indexOf('.', 9));
```

```
8
14
```

The first `.` is at index 3, but the search starts at index 9, after the `@`. So the result is the `.` before `com`, at index 14.

## 5. trim()

`trim()` removes whitespace from both ends of a string. Spaces in the middle stay. It does not change the original string; it returns a trimmed copy.

| | |
| --- | --- |
| Syntax | `public String trim()` |
| Parameters | None |
| Returns | `String`: a copy of the string without leading and trailing whitespace |

**Example 1: Clean a name with extra spaces**

```java
String name = "   Kim Tiel   ";
System.out.println("[" + name + "]");
System.out.println("[" + name.trim() + "]");
```

```
[   Kim Tiel   ]
[Kim Tiel]
```

The brackets show where the string starts and ends. The space between `Kim` and `Tiel` stays.

**Example 2: Check if an input is blank after trimming**

```java
String username = "     ";
System.out.println(username.isEmpty());
System.out.println(username.trim().isEmpty());
```

```
false
true
```

A string of spaces is not empty, so `isEmpty()` alone returns `false`. After `trim()`, it becomes `""`, so blank input can be caught in a validation.

## 6. replace()

`replace()` searches a string for a character or text and returns a new string with **every** match replaced. The original string is not changed.

| | |
| --- | --- |
| Syntax | `public String replace(char searchChar, char newChar)` |
| | Also accepts text: `replace("old", "new")` |
| Parameters | `searchChar`: the character to be replaced |
| | `newChar`: the character to put in its place |
| Returns | `String`: a new string with the replacements made |

**Example 1: Replace a word in a sentence**

```java
String message = "I love Python";
System.out.println(message.replace("Python", "Java"));
```

```
I love Java
```

**Example 2: Replace every matching character**

```java
String fruit = "banana";
System.out.println(fruit.replace('a', 'o'));

String date = "2026-10-29";
System.out.println(date.replace('-', '/'));
```

```
bonono
2026/10/29
```

All three `a`s in `banana` and both `-` in the date are replaced, not only the first one.

## 7. toCharArray()

`toCharArray()` returns a new `char` array that holds every character of the string, in order. This lets you loop through a string letter by letter.

| | |
| --- | --- |
| Syntax | `public char[] toCharArray()` |
| Parameters | None |
| Returns | `char[]`: a new array with the characters of the string |

**Example 1: Display each letter with its index**

```java
String text = "Java";
char[] letters = text.toCharArray();
for (int i = 0; i < letters.length; i++) {
    System.out.println("Index " + i + ": " + letters[i]);
}
```

```
Index 0: J
Index 1: a
Index 2: v
Index 3: a
```

**Example 2: Display a word in reverse**

```java
String original = "TESDA";
char[] characters = original.toCharArray();
String reversed = "";
for (int i = characters.length - 1; i >= 0; i--) {
    reversed += characters[i];
}
System.out.println(original + " reversed: " + reversed);
```

```
TESDA reversed: ADSET
```

The loop starts at the last index and counts down to 0, adding each character to `reversed`.