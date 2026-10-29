package com.joysistvi.day13.string;

public class Activity10_Tiel {
    public static void main(String[] args) {
        // ===== Documentation Phase =====

        // 1. contains() - checks if the string has the given text
        System.out.println("1. contains()");

        // Example 1: check if a sentence mentions Java
        String sentence = "I love Java programming";
        System.out.println(sentence.contains("Java"));
        System.out.println(sentence.contains("Python"));

        // Example 2: check if an email address has an @ sign
        String email = "kim.tiel@gmail.com";
        System.out.println(email.contains("@"));
        System.out.println(email.contains("yahoo"));

        // 2. endsWith() - checks if the string ends with the given text
        System.out.println("\n2. endsWith()");

        // Example 1: check if a file is a Java file
        String fileName = "Activity10_Tiel.java";
        System.out.println(fileName.endsWith(".java"));
        System.out.println(fileName.endsWith(".txt"));

        // Example 2: check if a website is a Philippine government site
        String website = "www.tesda.gov.ph";
        System.out.println(website.endsWith(".gov.ph"));
        System.out.println(website.endsWith(".com"));

        // 3. startsWith() - checks if the string starts with the given text
        System.out.println("\n3. startsWith()");

        // Example 1: check if a mobile number uses the local format
        String mobileNumber = "09171234567";
        System.out.println(mobileNumber.startsWith("09"));
        System.out.println(mobileNumber.startsWith("+63"));

        // Example 2: check if a website uses a secure connection
        String url = "https://www.w3schools.com";
        System.out.println(url.startsWith("https://"));
        System.out.println(url.startsWith("http://"));

        // 4. indexOf() - returns the position of the first match, or -1 if not found
        System.out.println("\n4. indexOf()");

        // Example 1: find the position of a character and a word
        String word = "Programming";
        System.out.println(word.indexOf('g'));
        System.out.println(word.indexOf("gram"));
        System.out.println(word.indexOf('z'));

        // Example 2: find the position of the @ sign, and search from a starting index
        String address = "kim.tiel@gmail.com";
        System.out.println(address.indexOf('@'));
        System.out.println(address.indexOf('.', 9));

        // 5. trim() - removes the spaces at the start and end
        System.out.println("\n5. trim()");

        // Example 1: clean a name with extra spaces
        String name = "   Kim Tiel   ";
        System.out.println("[" + name + "]");
        System.out.println("[" + name.trim() + "]");

        // Example 2: check if an input is blank after trimming
        String username = "     ";
        System.out.println(username.isEmpty());
        System.out.println(username.trim().isEmpty());

        // 6. replace() - replaces all matches with a new value
        System.out.println("\n6. replace()");

        // Example 1: replace a word in a sentence
        String message = "I love Python";
        System.out.println(message.replace("Python", "Java"));

        // Example 2: replace every matching character
        String fruit = "banana";
        System.out.println(fruit.replace('a', 'o'));
        String date = "2026-10-29";
        System.out.println(date.replace('-', '/'));

        // 7. toCharArray() - converts the string into an array of characters
        System.out.println("\n7. toCharArray()");

        // Example 1: display each letter with its index
        String text = "Java";
        char[] letters = text.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            System.out.println("Index " + i + ": " + letters[i]);
        }

        // Example 2: display a word in reverse
        String original = "TESDA";
        char[] characters = original.toCharArray();
        String reversed = "";
        for (int i = characters.length - 1; i >= 0; i--) {
            reversed += characters[i];
        }
        System.out.println(original + " reversed: " + reversed);

        // ===== Stretch Goal =====
        String country = "Philippines";

        System.out.println("\n==================================");
        System.out.println("          Stretch Goal");
        System.out.println("==================================");
        System.out.println("Country: " + country);

        // Display the first and last character
        char firstChar = country.charAt(0);
        char lastChar = country.charAt(country.length() - 1);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);

        // Count the P/p and the vowels
        int pCount = 0;
        int vowelCount = 0;
        for (char c : country.toCharArray()) {
            if (c == 'P' || c == 'p') {
                pCount++;
            }

            char lower = Character.toLowerCase(c);
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of P/p: " + pCount);
        System.out.println("Number of vowels: " + vowelCount);
    }
}
